package udemy.allorden.junit5app.ejemplos.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.*;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Properties;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import udemy.allorden.junit5app.ejemplos.exceptions.DineroInsuficienteException;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CuentaTest {
	Cuenta cuenta;
	
	@BeforeEach
	void initMetodoTest() {
		this.cuenta = new Cuenta("Aaron", new BigDecimal("1000.12345"));
		System.out.println("Iniciando el método prueba...");
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("Finalizando el método prueba...");
	}
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Inicializando el test...");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("Finalizando el test...");
	}


	@Test
	@DisplayName("Probando nombre de la cuenta corriente")
	void testNombreCuenta() {
		//cuenta.setPersona("Aaron");
		
		String esperado = "Aaron";
		String real = cuenta.getPersona();

		assertNotNull(real, () -> "La cuenta no puede ser null");
		assertEquals(esperado, real, () -> "El nombre de la cuenta no es el nombre esperado. Valor esperado = " + esperado + " | valor real = " + real);
		assertTrue(real.equals("Aaron"), () -> "Nombre cuenta esperada deber ser igual a la real");
	}
	
	@Test
	@DisplayName("Probando el saldo de la cuenta corriente, que no sea null, mayor que cero, valor esperado")
	void testSaldoCuenta() {
		assertNotNull(cuenta.getSaldo());
		assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
		assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
		assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
	}
	
	@Test
	@DisplayName("Comprobando datos de referencia de las cuentas")
	void testReferenciaDeCuenta()  {
		cuenta = new Cuenta("Diego García", new BigDecimal("8900.9997"));
		Cuenta cuenta2 = new Cuenta("Diego García", new BigDecimal("8900.9997"));
		
		//assertNotEquals(cuenta2, cuenta);
		assertEquals(cuenta2, cuenta);
	}
	
	@Test
	@DisplayName("Comprobando el saldo del débito de la cuenta")
	void testDebitoCuenta() {
		cuenta = new Cuenta("Nacho", new BigDecimal("1000.12345"));
		cuenta.debito(new BigDecimal(100));
		
		assertNotNull(cuenta.getSaldo());
		assertEquals(900, cuenta.getSaldo().intValue());
		assertEquals("900.12345", cuenta.getSaldo().toPlainString());
	}
	
	@Test
	@DisplayName("Comprobando el saldo del credito de la cuenta")
	void testCreditoCuenta() {
		cuenta = new Cuenta("Nacho", new BigDecimal("1000.12345"));
		cuenta.credito(new BigDecimal(100));
		
		assertNotNull(cuenta.getSaldo());
		assertEquals(1100, cuenta.getSaldo().intValue());
		assertEquals("1100.12345", cuenta.getSaldo().toPlainString());
	}
	
	@Test
	@DisplayName("Comprobando si hay dinero suficiente en la cuenta")
	void testDineroInsufienteException() {
		cuenta = new Cuenta("Andrés", new BigDecimal("1000.12345"));
		
		Exception exception = assertThrows(DineroInsuficienteException.class, () -> {
			cuenta.debito(new BigDecimal(1500));
		});
		
		String real = exception.getMessage();
		String esperado = "Dinero insuficiente";
		
		assertEquals(esperado, real);
	}
	
	@Test
	@DisplayName("Comprobando las transferencias entre cuentas")
	void testTransferirDineroCuentas() {
		Cuenta cuenta1 = new Cuenta("John Doe", new BigDecimal("2500"));
		Cuenta cuenta2 = new Cuenta("Andrés Guzman", new BigDecimal("1500.8989"));
		
		Banco banco = new Banco();
		banco.setNombre("Trade Republic");
		banco.transferir(cuenta2, cuenta1, new BigDecimal(500));
		assertEquals("1000.8989", cuenta2.getSaldo().toPlainString());
		assertEquals("3000", cuenta1.getSaldo().toPlainString());
	}
	
	@Test
	@Disabled
	@DisplayName("Comprobando las relaciones entre las cuentas y el banco")
	void testRelacionBancoCuentas() {
		fail();
		Cuenta cuenta1 = new Cuenta("John Doe", new BigDecimal("2500"));
		Cuenta cuenta2 = new Cuenta("Andrés Guzman", new BigDecimal("1500.8989"));
		
		Banco banco = new Banco();
		banco.addCuenta(cuenta1);
		banco.addCuenta(cuenta2);
		
		banco.setNombre("Trade Republic");
		banco.transferir(cuenta2, cuenta1, new BigDecimal(500));
		
		assertAll(() -> assertEquals("1000.8989", cuenta2.getSaldo().toPlainString(), 
					() -> "El valor del saldo de la cuenta2 no es el valor esperado"), 
				
				() -> assertEquals("3000", cuenta1.getSaldo().toPlainString(),
					() -> "El valor del saldo de la cuenta1 no es el valor esperado"), 
				
				() -> assertEquals(2, banco.getCuentas().size(),
					() -> "El nº de cuentas no coinciden con la cantidad esperada"),
				
				() -> assertEquals("Trade Republic", cuenta1.getBanco().getNombre(),
					() -> "El nombre del banco no coincide con el nombre esperado"),
				
				() -> assertEquals("Andrés Guzman", banco.getCuentas().stream()
						.filter(c -> c.getPersona().equals("Andrés Guzman"))
						.findFirst().get().getPersona(),
					() -> "El nombre de la persona no coincide con el nombre espeardo"),
				
				() -> assertTrue(banco.getCuentas().stream()
						.filter(c -> c.getPersona().equals("Andrés Guzman"))
						.findFirst().isPresent(),
					() -> "El valor booleano no coincide con el valor esperado"),
				
				() -> assertTrue(banco.getCuentas().stream()
						.anyMatch(c -> c.getPersona().equals("John Doe")),
					() -> "El valor booleano no coincide con el valor esperado")
		);
	}
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	void testSoloWindows() {}
	
	@Test
	@EnabledOnOs({OS.LINUX, OS.MAC})
	void testSoloLinuxMac() {}
	
	@Test
	@DisabledOnOs(OS.WINDOWS)
	void testNoWindows() {}
	
	@Test
	@DisabledOnJre(JRE.JAVA_8)
	void soloJDK8() {}
	
	@Test
	@EnabledOnJre(JRE.JAVA_25)
	void soloJDK25() {}
	
	@Test
	@DisabledOnJre(JRE.JAVA_25)
	void testNoJDK25() {}
	
	@Test
	void imprimirSystemProperties() {
		Properties properties = System.getProperties();
		properties.forEach((k, v) -> System.out.println(k + ":" + v));
	}
	
	@Test
	@EnabledIfSystemProperty(named = "java.version", matches = "25.0.4.1")
	void testJavaVersion() {}
	
	@Test
	@DisabledIfSystemProperty(named = "os.arch", matches = ".*32.*")
	void testSolo64Bits() {}
	
	@Test
	@EnabledIfSystemProperty(named = "os.arch", matches = ".*32.*")
	void testNo64Bits() {}
	
	@Test
	@EnabledIfSystemProperty(named = "user.name", matches = "alex_")
	void TestUserName() {}
	
	/**
	 * Este método para que funcione:
	 * --> Run Configurations
	 * --> Arguments
	 * --> VM Arguments: -ea -DENV=dev
	 * De lo contrario no funciona
	 */
	@Test
	@EnabledIfSystemProperty(named = "ENV", matches = "dev")
	void testDev() {}
	
	@Test
	void imprimirVariablesAmbiente() {
		Map<String, String> getenv = System.getenv();
		getenv.forEach((k, v) -> System.out.println(k + " = " + v));
	}
	
	@Test
	@EnabledIfEnvironmentVariable(named = "JAVA_HOME", matches = ".*jdk-25.0.4.1.*")
	void testJavaHome() {}
	
	
	@Test
	@EnabledIfEnvironmentVariable(named = "NUMBER_OF_PROCESSORS", matches = "8")
	void testProcesadores() {}
	
	/**
	 * Este método para que funcione:
	 * --> Run Configurations
	 * --> Environment
	 * --> name = ENVIRONMENT, value = dev
	 * De lo contrario no funciona
	 */
	@Test
	@EnabledIfEnvironmentVariable(named = "ENVIRONMENT", matches = "dev")
	void testEnv() {}
	
	/**
	 * Este método para que funcione:
	 * --> Run Configurations
	 * --> Environment
	 * --> name = ENVIRONMENT, value = prod
	 * De lo contrario sí funciona cuando lo que queremos
	 * es que no se ejecute el método
	 */
	@Test
	@DisabledIfEnvironmentVariable(named = "ENVIRONMENT", matches = "prod")
	void testEnvProdDisabled() {}
	
	/**
	 * Este método para que funcione:
	 * --> Run Configurations
	 * --> Arguments
	 * --> VM Arguments: -ea -DENV=dev
	 * De lo contrario no funciona
	 */
	@Test
	@DisplayName("Test Saldo Cuenta Dev")
	void testSaldoCuentaDev() {
		boolean esDev = "dev".equals(System.getProperty("ENV"));
		assumeTrue(esDev);
		
		assertNotNull(cuenta.getSaldo());
		assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
		assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
		assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
	}
	
	@Test
	@DisplayName("Test Saldo Cuenta Dev 2")
	void testSaldoCuentaDev2() {
		boolean esDev = "dev".equals(System.getProperty("ENV"));
		assumingThat(esDev, () -> {
			assertNotNull(cuenta.getSaldo());
			assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
		});
		
		assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
		assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
	}
}

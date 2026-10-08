package udemy.allorden.junit5app.ejemplos.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.Timeout;
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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import udemy.allorden.junit5app.ejemplos.exceptions.DineroInsuficienteException;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CuentaTest {
	private Cuenta cuenta;
	private TestInfo testInfo;
	private TestReporter testReporter;
	
	@BeforeEach
	void initMetodoTest(TestInfo testInfo, TestReporter testReporter) {
		this.cuenta = new Cuenta("Aaron", new BigDecimal("1000.12345"));
		this.testInfo = testInfo;
		this.testReporter = testReporter;
		
		System.out.println("Iniciando el método prueba...");
		testReporter.publishEntry(" ejecutando: " + testInfo.getDisplayName() + " " 
				+ testInfo.getTestMethod().orElse(null).getName()
				+ " con las etiquetas " + testInfo.getTags());
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
	
	@Nested
	@DisplayName("Probando atributos de la cuenta corriente")
	class cuentaTestNombreSaldo {
		@Test
		@DisplayName("Probando nombre de la cuenta")
		void testNombreCuenta() {
			testReporter.publishEntry(testInfo.getTags().toString());
			if (testInfo.getTags().contains("cuenta"))
				testReporter.publishEntry("Hacer algo con la etiqueta cuenta");
			
			//cuenta.setPersona("Aaron");
			
			String esperado = "Aaron";
			String real = cuenta.getPersona();

			Assertions.assertNotNull(real, () -> "La cuenta no puede ser null");
			Assertions.assertEquals(esperado, real, () -> "El nombre de la cuenta no es el nombre esperado. Valor esperado = " + esperado + " | valor real = " + real);
			Assertions.assertTrue(real.equals("Aaron"), () -> "Nombre cuenta esperada deber ser igual a la real");
		}
		
		@Test
		@DisplayName("Probando el saldo de la cuenta, que no sea null, mayor que cero, valor esperado")
		void testSaldoCuenta() {
			Assertions.assertNotNull(cuenta.getSaldo());
			Assertions.assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
			Assertions.assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
			Assertions.assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
		}
		
		@Test
		@DisplayName("Comprobando datos de referencia de las cuentas")
		void testReferenciaDeCuenta()  {
			cuenta = new Cuenta("Diego García", new BigDecimal("8900.9997"));
			Cuenta cuenta2 = new Cuenta("Diego García", new BigDecimal("8900.9997"));
			
			//assertNotEquals(cuenta2, cuenta);
			Assertions.assertEquals(cuenta2, cuenta);
		}
	}
	
	@Tag("cuenta")
	@Tag("banco")
	@Nested
	class cuentaTestOperaciones {
		@Test
		@DisplayName("Comprobando el saldo del débito de la cuenta")
		void testDebitoCuenta() {
			cuenta = new Cuenta("Nacho", new BigDecimal("1000.12345"));
			cuenta.debito(new BigDecimal(100));
			
			Assertions.assertNotNull(cuenta.getSaldo());
			Assertions.assertEquals(900, cuenta.getSaldo().intValue());
			Assertions.assertEquals("900.12345", cuenta.getSaldo().toPlainString());
		}
		
		
		@Test
		@DisplayName("Comprobando el saldo del credito de la cuenta")
		void testCreditoCuenta() {
			cuenta = new Cuenta("Nacho", new BigDecimal("1000.12345"));
			cuenta.credito(new BigDecimal(100));
			
			Assertions.assertNotNull(cuenta.getSaldo());
			Assertions.assertEquals(1100, cuenta.getSaldo().intValue());
			Assertions.assertEquals("1100.12345", cuenta.getSaldo().toPlainString());
		}
		
		@Test
		@DisplayName("Comprobando las transferencias entre cuentas")
		void testTransferirDineroCuentas() {
			Cuenta cuenta1 = new Cuenta("John Doe", new BigDecimal("2500"));
			Cuenta cuenta2 = new Cuenta("Andrés Guzman", new BigDecimal("1500.8989"));
			
			Banco banco = new Banco();
			banco.setNombre("Trade Republic");
			banco.transferir(cuenta2, cuenta1, new BigDecimal(500));
			Assertions.assertEquals("1000.8989", cuenta2.getSaldo().toPlainString());
			Assertions.assertEquals("3000", cuenta1.getSaldo().toPlainString());
		}
	}
	
	@Nested
	@Tag("cuenta")
	@Tag("erores")
	class CuentaTestExceptions {
		@Test
		@DisplayName("Comprobando si hay dinero suficiente en la cuenta")
		void testDineroInsufienteException() {
			cuenta = new Cuenta("Andrés", new BigDecimal("1000.12345"));
			
			Exception exception = Assertions.assertThrows(DineroInsuficienteException.class, () -> {
				cuenta.debito(new BigDecimal(1500));
			});
			
			String real = exception.getMessage();
			String esperado = "Dinero insuficiente";
			
			Assertions.assertEquals(esperado, real);
		}
	}
	
	@Nested
	@Tag("cuenta")
	@Tag("banco")
	class CuentaTestRelaciones {
		@Test
		@Disabled
		@DisplayName("Comprobando las relaciones entre las cuentas y el banco")
		void testRelacionBancoCuentas() {
			Assertions.fail();
			Cuenta cuenta1 = new Cuenta("John Doe", new BigDecimal("2500"));
			Cuenta cuenta2 = new Cuenta("Andrés Guzman", new BigDecimal("1500.8989"));
			
			Banco banco = new Banco();
			banco.addCuenta(cuenta1);
			banco.addCuenta(cuenta2);
			
			banco.setNombre("Trade Republic");
			banco.transferir(cuenta2, cuenta1, new BigDecimal(500));
			
			Assertions.assertAll(() -> Assertions.assertEquals("1000.8989", cuenta2.getSaldo().toPlainString(), 
						() -> "El valor del saldo de la cuenta2 no es el valor esperado"), 
					
					() -> Assertions.assertEquals("3000", cuenta1.getSaldo().toPlainString(),
						() -> "El valor del saldo de la cuenta1 no es el valor esperado"), 
					
					() -> Assertions.assertEquals(2, banco.getCuentas().size(),
						() -> "El nº de cuentas no coinciden con la cantidad esperada"),
					
					() -> Assertions.assertEquals("Trade Republic", cuenta1.getBanco().getNombre(),
						() -> "El nombre del banco no coincide con el nombre esperado"),
					
					() -> Assertions.assertEquals("Andrés Guzman", banco.getCuentas().stream()
							.filter(c -> c.getPersona().equals("Andrés Guzman"))
							.findFirst().get().getPersona(),
						() -> "El nombre de la persona no coincide con el nombre espeardo"),
					
					() -> Assertions.assertTrue(banco.getCuentas().stream()
							.filter(c -> c.getPersona().equals("Andrés Guzman"))
							.findFirst().isPresent(),
						() -> "El valor booleano no coincide con el valor esperado"),
					
					() -> Assertions.assertTrue(banco.getCuentas().stream()
							.anyMatch(c -> c.getPersona().equals("John Doe")),
						() -> "El valor booleano no coincide con el valor esperado")
			);
		}
	}
	
	@Nested
	class SistemaOperativoTest {
		@Test
		@EnabledOnOs(OS.WINDOWS)
		void testSoloWindows() {}
		
		@Test
		@EnabledOnOs({OS.LINUX, OS.MAC})
		void testSoloLinuxMac() {}
		
		@Test
		@DisabledOnOs(OS.WINDOWS)
		void testNoWindows() {}
	}
	
	@Nested
	class JavaVersionTest {
		@Test
		@DisabledOnJre(JRE.JAVA_8)
		void soloJDK8() {}
		
		@Test
		@EnabledOnJre(JRE.JAVA_25)
		void soloJDK25() {}
		
		@Test
		@DisabledOnJre(JRE.JAVA_25)
		void testNoJDK25() {}
	}
	
	@Nested
	class SistemPropertiesTest {
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
	}
	
	@Nested
	class VariableAmbienteTest {
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
	}
	
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
		Assumptions.assumeTrue(esDev);
		
		Assertions.assertNotNull(cuenta.getSaldo());
		Assertions.assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
		Assertions.assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
		Assertions.assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
	}
	
	@Test
	@DisplayName("Test Saldo Cuenta Dev 2")
	void testSaldoCuentaDev2() {
		boolean esDev = "dev".equals(System.getProperty("ENV"));
		Assumptions.assumingThat(esDev, () -> {
			Assertions.assertNotNull(cuenta.getSaldo());
			Assertions.assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
		});
		
		Assertions.assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
		Assertions.assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
	}
	
	@DisplayName("Probando Debito Cuenta Repetir")
	@RepeatedTest(value = 5, name = "{displayName} Repetición númmero {currentRepetition} de {totalRepetition}")
	void testDebitoCuentaRepetir(RepetitionInfo info) {
		if (info.getCurrentRepetition() == 3)
			System.out.println("Estamos en la repetición " + info.getCurrentRepetition());
			
		cuenta = new Cuenta("Nacho", new BigDecimal("1000.12345"));
		cuenta.debito(new BigDecimal(100));
		
		Assertions.assertNotNull(cuenta.getSaldo());
		Assertions.assertEquals(900, cuenta.getSaldo().intValue());
		Assertions.assertEquals("900.12345", cuenta.getSaldo().toPlainString());
	}
	
	@Nested
	class PruebasParametrizadasTest {
		@ParameterizedTest(name = "número {index} ejecutado con valor {0} - {argumentsWithNames}")
		@DisplayName("Comprobando el saldo del débito de la cuenta con ValueSource")
		@ValueSource(strings = {"100", "200", "300", "500", "700", "1000"})
		void testDebitoCuentaValueSource(String monto) {
			cuenta.debito(new BigDecimal(monto));
			
			Assertions.assertNotNull(cuenta.getSaldo());
			Assertions.assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
		}
		
		@ParameterizedTest(name = "número {index} ejecutado con valor {0} - {argumentsWithNames}")
		@DisplayName("Comprobando el saldo del débito de la cuenta con CsvSource")
		@CsvSource({"1, 100", "2, 200", "3, 300", "4, 500", "5, 700", "6, 1000"})
		void testDebitoCuentaCsvSource(String index, String monto) {
			System.out.println(index + " -> " + monto);
			cuenta.debito(new BigDecimal(monto));
			
			Assertions.assertNotNull(cuenta.getSaldo());
			Assertions.assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
		}
		
		@ParameterizedTest(name = "número {index} ejecutado con valor {0} - {argumentsWithNames}")
		@DisplayName("Comprobando el saldo del débito de la cuenta con CsvSource")
		@CsvSource({"200, 100, John, Andrés", "250, 200, José, José", "300, 300, Marcos, Marcos", 
			"510, 500, Diego, Nacho", "750, 700, Aaron, Aaron", "1000, 1000, Elizeu, Antonio"})
		void testDebitoCuentaCsvSource2(String saldo, String monto, String esperado, String actual) {
			System.out.println(saldo + " -> " + monto);
			
			cuenta.setSaldo(new BigDecimal(saldo));
			cuenta.debito(new BigDecimal(monto));
			cuenta.setPersona(actual);
			
			Assertions.assertNotNull(cuenta.getSaldo());
			Assertions.assertNotNull(cuenta.getPersona());
			Assertions.assertEquals(esperado, actual);
			Assertions.assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
		}
		
		@ParameterizedTest(name = "número {index} ejecutado con valor {0} - {argumentsWithNames}")
		@DisplayName("Comprobando el saldo del débito de la cuenta con CsvFileSource")
		@CsvFileSource(resources = "/data.csv")
		void testDebitoCuentaCsvFileSource(String monto) {
			cuenta.debito(new BigDecimal(monto));
			
			Assertions.assertNotNull(cuenta.getSaldo());
			Assertions.assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
		}
		
		@ParameterizedTest(name = "número {index} ejecutado con valor {0} - {argumentsWithNames}")
		@DisplayName("Comprobando el saldo del débito de la cuenta con CsvFileSource")
		@CsvFileSource(resources = "/data2.csv")
		void testDebitoCuentaCsvFileSource2(String saldo, String monto, String esperado, String actual) {
			cuenta.setSaldo(new BigDecimal(saldo));
			cuenta.debito(new BigDecimal(monto));
			cuenta.setPersona(actual);
			
			Assertions.assertNotNull(cuenta.getSaldo());
			Assertions.assertNotNull(cuenta.getPersona());
			Assertions.assertEquals(esperado, actual);
			Assertions.assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
		}
	}
	
	@ParameterizedTest(name = "número {index} ejecutado con valor {0} - {argumentsWithNames}")
	@DisplayName("Comprobando el saldo del débito de la cuenta con MethodSource")
	@MethodSource("montoList")
	void testDebitoCuentaMethodSource(String monto) {
		cuenta.debito(new BigDecimal(monto));
		
		Assertions.assertNotNull(cuenta.getSaldo());
		Assertions.assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
	}
	
	private static List<String> montoList() {
		return Arrays.asList("100", "200", "300", "500", "700", "1000");
	}
	
	@Nested
	@Tag("timeout")
	class EjemploTimeoutTest {
		@Test
		@Timeout(2)
		void pruebaTimeout() throws InterruptedException {
			TimeUnit.MILLISECONDS.sleep(100);
		}
		
		@Test
		@Timeout(value = 1500, unit = TimeUnit.MILLISECONDS)
		void pruebaTimeout2() throws InterruptedException {
			TimeUnit.MILLISECONDS.sleep(800);
		}
		
		@Test
		void testTimeoutAssertions() {
			Assertions.assertTimeout(Duration.ofSeconds(5), () -> {
				TimeUnit.MILLISECONDS.sleep(4000);
			});
		}
	}
	
}

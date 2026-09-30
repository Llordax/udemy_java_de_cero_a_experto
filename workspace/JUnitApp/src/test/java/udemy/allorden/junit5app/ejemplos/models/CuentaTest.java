package udemy.allorden.junit5app.ejemplos.models;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import udemy.allorden.junit5app.ejemplos.exceptions.DineroInsuficienteException;

class CuentaTest {

	@Test
	@DisplayName("Probando nombre de la cuenta corriente")
	void testNombreCuenta() {
		Cuenta cuenta = new Cuenta("Aaron", new BigDecimal("1000.12345"));
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
		Cuenta cuenta = new Cuenta("Aaron", new BigDecimal("1000.12345"));
		
		assertNotNull(cuenta.getSaldo());
		assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
		assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
		assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
	}
	
	@Test
	@DisplayName("Comprobando datos de referencia de las cuentas")
	void testReferenciaDeCuenta()  {
		Cuenta cuenta = new Cuenta("Diego García", new BigDecimal("8900.9997"));
		Cuenta cuenta2 = new Cuenta("Diego García", new BigDecimal("8900.9997"));
		
		//assertNotEquals(cuenta2, cuenta);
		assertEquals(cuenta2, cuenta);
	}
	
	@Test
	@DisplayName("Comprobando el saldo del débito de la cuenta")
	void testDebitoCuenta() {
		Cuenta cuenta = new Cuenta("Nacho", new BigDecimal("1000.12345"));
		cuenta.debito(new BigDecimal(100));
		
		assertNotNull(cuenta.getSaldo());
		assertEquals(900, cuenta.getSaldo().intValue());
		assertEquals("900.12345", cuenta.getSaldo().toPlainString());
	}
	
	@Test
	@DisplayName("Comprobando el saldo del credito de la cuenta")
	void testCreditoCuenta() {
		Cuenta cuenta = new Cuenta("Nacho", new BigDecimal("1000.12345"));
		cuenta.credito(new BigDecimal(100));
		
		assertNotNull(cuenta.getSaldo());
		assertEquals(1100, cuenta.getSaldo().intValue());
		assertEquals("1100.12345", cuenta.getSaldo().toPlainString());
	}
	
	@Test
	@DisplayName("Comprobando si hay dinero suficiente en la cuenta")
	void testDineroInsufienteException() {
		Cuenta cuenta = new Cuenta("Andrés", new BigDecimal("1000.12345"));
		
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
}

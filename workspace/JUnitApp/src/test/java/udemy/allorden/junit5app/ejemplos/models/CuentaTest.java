package udemy.allorden.junit5app.ejemplos.models;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import udemy.allorden.junit5app.ejemplos.exceptions.DineroInsuficienteException;

class CuentaTest {

	@Test
	void testNombreCuenta() {
		Cuenta cuenta = new Cuenta("Aaron", new BigDecimal("1000.12345"));
		cuenta.setPersona("Aaron");
		
		String esperado = "Aaron";
		String real = cuenta.getPersona();

		assertNotNull(real);
		assertEquals(esperado, real);
		assertTrue(real.equals("Aaron"));
	}
	
	@Test
	void testSaldoCuenta() {
		Cuenta cuenta = new Cuenta("Aaron", new BigDecimal("1000.12345"));
		
		assertNotNull(cuenta.getSaldo());
		assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
		assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
		assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
	}
	
	@Test
	void testReferenciaDeCuenta()  {
		Cuenta cuenta = new Cuenta("Diego García", new BigDecimal("8900.9997"));
		Cuenta cuenta2 = new Cuenta("Diego García", new BigDecimal("8900.9997"));
		
		//assertNotEquals(cuenta2, cuenta);
		assertEquals(cuenta2, cuenta);
	}
	
	@Test
	void testDebitoCuenta() {
		Cuenta cuenta = new Cuenta("Nacho", new BigDecimal("1000.12345"));
		cuenta.debito(new BigDecimal(100));
		
		assertNotNull(cuenta.getSaldo());
		assertEquals(900, cuenta.getSaldo().intValue());
		assertEquals("900.12345", cuenta.getSaldo().toPlainString());
	}
	
	@Test
	void testCreditoCuenta() {
		Cuenta cuenta = new Cuenta("Nacho", new BigDecimal("1000.12345"));
		cuenta.credito(new BigDecimal(100));
		
		assertNotNull(cuenta.getSaldo());
		assertEquals(1100, cuenta.getSaldo().intValue());
		assertEquals("1100.12345", cuenta.getSaldo().toPlainString());
	}
	
	@Test
	void testDinetoInsufienteException() {
		Cuenta cuenta = new Cuenta("Andrés", new BigDecimal("1000.12345"));
		
		Exception exception = assertThrows(DineroInsuficienteException.class, () -> {
			cuenta.debito(new BigDecimal(1500));
		});
		
		String real = exception.getMessage();
		String esperado = "Dinero insuficiente";
		
		assertEquals(esperado, real);
	}
}

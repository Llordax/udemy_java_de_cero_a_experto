package udemy.allorden.junit5app.ejemplos.models;

import java.math.BigDecimal;

import udemy.allorden.junit5app.ejemplos.exceptions.DineroInsuficienteException;

public class Cuenta {
	
	private String persona;
	private BigDecimal saldo;
	
	public Cuenta() {
		super();
	}

	public Cuenta(String persona, BigDecimal saldo) {
		super();
		this.persona = persona;
		this.saldo = saldo;
	}

	public String getPersona() {
		return persona;
	}
	
	public void setPersona(String persona) {
		this.persona = persona;
	}
	
	public BigDecimal getSaldo() {
		return saldo;
	}
	
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	public void debito(BigDecimal monto) {
		BigDecimal nuevoSaldo = this.saldo.subtract(monto);
		if (nuevoSaldo.compareTo(BigDecimal.ZERO) < 0)
			throw new DineroInsuficienteException("Dinero insuficiente");
		
		this.saldo = nuevoSaldo;
		
	}
	
	public void credito(BigDecimal monto) {
		this.saldo = this.saldo.add(monto);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Cuenta))
			return false;
		
		Cuenta cuenta = (Cuenta) obj;
		if (this.persona == null || this.saldo == null)
			return false;

		return this.persona.equals(cuenta.getPersona()) && 
				this.saldo.equals(cuenta.getSaldo());
	}
}

package udemy.tarea.domain;

import udemy.tarea.clasesabstractas.Electronico;

public class TvLcd extends Electronico {

	private int pulgada;
	
	public TvLcd(int precio, String fabricante, int pulgada) {
		super(precio, fabricante);
		this.pulgada = pulgada;
	}

	public int getPulgada() {
		return pulgada;
	}

	@Override
	public double getPrecioVenta() {
		return precio * 0.9;
	}

}	
	
	
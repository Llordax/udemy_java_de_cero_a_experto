package udemy.tarea.domain;

import udemy.tarea.clasesabstractas.Electronico;

public class IPhone extends Electronico {

	private String color, modelo;
	
	public IPhone(int precio, String color, String modelo, String fabricante) {
		super(precio, fabricante);
		this.color = color;
		this.modelo = modelo;
	}
	
	public String getColor() {
		return color;
	}

	public String getModelo() {
		return modelo;
	}

	@Override
	public double getPrecioVenta() {
		return precio * 0.9;
	}

}

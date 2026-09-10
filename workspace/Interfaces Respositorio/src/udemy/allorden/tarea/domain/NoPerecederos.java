package udemy.allorden.tarea.domain;

public class NoPerecederos extends Producto {

	private int contenido, calorias;

	public NoPerecederos(String nombre, double precio, int contenido, int calorias) {
		super(nombre, precio);
		this.contenido = contenido;
		this.calorias = calorias;
	}

	public int getContenido() {
		return contenido;
	}

	public int getCalorias() {
		return calorias;
	}

	@Override
	public String toString() {
		return "NoPerecederos [nombre=" + nombre + ", precio=" + precio + ", contenido=" + contenido + ", calorias=" + calorias + "]";
	}
	
}

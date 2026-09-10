package udemy.allorden.apistream.ejercicios.e4;

public class Producto {
	
	private double precio, cantidad;

	/**
	 * Constructor con parámetros.
	 * 
	 * @param precio del producto pasado como argumento.
	 * @param cantidad del producto pasado como argumento.
	 */
	public Producto(double precio, double cantidad) {
		super();
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	/**
	 * Getter
	 * 
	 * @return Precio del producto.
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Getter
	 * 
	 * @return cantidad del producto.
	 */
	public double getCantidad() {
		return cantidad;
	}
}

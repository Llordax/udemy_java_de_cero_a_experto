package udemy.allorden.appfacturas.domain;

public class ItemFactura {

	private int cantidad;
	private Producto producto;

	public ItemFactura(int cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public float calcularImporte() {
		return cantidad * producto.getPrecio();
	}

	@Override
	public String toString() {
		return producto + 
				"\t" + cantidad + 
				"\t" + calcularImporte();
	}
	
}

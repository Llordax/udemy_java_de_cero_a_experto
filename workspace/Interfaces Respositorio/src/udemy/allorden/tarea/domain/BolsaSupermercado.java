package udemy.allorden.tarea.domain;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {
	
	private List<T> productos = new ArrayList<>();
	private int max = 5;
	
	public List<T> getProductos(){
		return productos;
	}
	
	public void addProducto(T t) {
		if(productos.size() <= max)
			productos.add(t);
		
		else
			throw new RuntimeException("No hay espacio disponible");
		
	}
	

}

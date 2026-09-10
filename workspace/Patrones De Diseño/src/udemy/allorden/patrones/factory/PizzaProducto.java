package udemy.allorden.patrones.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaProducto {
	
	protected String nombre, masa, salsa;
	protected List<String> ingredientes;
	
	public PizzaProducto() {
		super();
		ingredientes = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void preparar() {
		System.out.println("Preparando " + nombre);
		System.out.println("Seleccionando la masa " + masa);
		System.out.println("Agregando la salsa " + salsa);
		System.out.println("Agregando ingredientes: ");
		this.ingredientes.forEach(System.out::println);
	}
	
	public void empaquetar() {
		System.out.println("Poniendo la pizza en una caja de empaque");
	}
	
	public abstract void cocinar();
	
	public abstract void cortar();

	@Override
	public String toString() {
		return "PizzaProducto [nombre=" + nombre + ", masa=" + masa + ", salsa=" + salsa + ", ingredientes="
				+ ingredientes + "]";
	}
		
	
}

package udemy.allorden.patrones.factory;

public abstract class PizzeriaZonaAbstractFactory {
	
	public PizzaProducto ordenarPizza(String tipo) {
		PizzaProducto pizza = crearPizza(tipo);
		
		System.out.println();
		System.out.println();
		System.out.println("-----Fabricando la pizza " + pizza.getNombre());
		pizza.preparar();
		pizza.cocinar();
		pizza.cortar();
		pizza.empaquetar();
		
		return pizza;
	}
	
	public abstract PizzaProducto crearPizza(String tipo);

}

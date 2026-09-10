package udemy.allorden.patrones.factory.producto;

import udemy.allorden.patrones.factory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {
	
	public PizzaNewYorkVegetariana() {
		super();
		nombre = "Pizza vegetariana New York";
		masa = "Masa integral vegana";
		salsa = "Salsa de tomate";
		ingredientes.add("Queso vegano");
		ingredientes.add("Tomate");
		ingredientes.add("Aceitunas");
		ingredientes.add("Espinacas");
		ingredientes.add("Berenjenas");
	}

	@Override
	public void cocinar() {
		System.out.println("Cocinando por 20 mins a 150ºC");
	}

	@Override
	public void cortar() {
		System.out.println("Cortando la pizza en rebanadas cuadradas");
	}

}

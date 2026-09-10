package udemy.allorden.patrones.factory.producto;

import udemy.allorden.patrones.factory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {

	public PizzaNewYorkItaliana() {
		super();
		nombre = "Pizza italiana New York";
		masa = "Masa gruesa";
		salsa = "Salsa de tomate italiano con carne";
		ingredientes.add("Queso Mozzarella");
		ingredientes.add("Aceitunas");
		ingredientes.add("Jamón");
		ingredientes.add("Chorizo");
		ingredientes.add("Champiñones");
	}

	@Override
	public void cocinar() {
		System.out.println("Cocinando por 30 mins a 120ºC");
	}

	@Override
	public void cortar() {
		System.out.println("Cortando la pizza en triángulos grandes");
	}

}

package udemy.allorden.patrones.factory.producto;

import udemy.allorden.patrones.factory.PizzaProducto;

public class PizzaNewYorkPepperoni extends PizzaProducto {

	public PizzaNewYorkPepperoni() {
		super();
		nombre = "Pizza pepperoni New York";
		masa = "Masa delgada a la piedra";
		salsa = "Salsa de tomate";
		ingredientes.add("Queso mozzarella");
		ingredientes.add("Extra pepperoni");
		ingredientes.add("Aceitunas");
	
	}

	@Override
	public void cocinar() {
		System.out.println("Cocinando por 40 mins a 90ºC");
	}

	@Override
	public void cortar() {
		System.out.println("Cortando la pizza en triángulos");
	}

}

package udemy.allorden.patrones.factory.producto;

import udemy.allorden.patrones.factory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {

	public PizzaCaliforniaPepperoni() {
		super();
		nombre = "Pizza California pepperoni";
		masa = "Masa a la piedra gruesa";
		ingredientes.add("Pepperoni");
		ingredientes.add("Extra queso mozzarella");
		ingredientes.add("Aceitunas");
	}

	@Override
	public void cocinar() {
		System.out.println("Cocinando a 50 mins a 55ºC");
	}

	@Override
	public void cortar() {
		System.out.println("Cortando la pizza en pequeños rectángulos");
	}
}

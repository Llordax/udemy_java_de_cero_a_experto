package udemy.allorden.patrones.factory.producto;

import udemy.allorden.patrones.factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

	public PizzaCaliforniaQueso() {
		super();
		nombre = "Pizza California queso";
		masa = "Masa a la piedra delgada";
		salsa = "Salsa de tomate con rúcula";
		ingredientes.add("Extra queso Mozzarella");
		ingredientes.add("Cebolla");
		ingredientes.add("Queso azul");
	}

	@Override
	public void cocinar() {
		System.out.println("Cocinando 35 mins a 100ºC");
	}

	@Override
	public void cortar() {
		System.out.println("Cortando la pizza en pequeños triángulos");
	}
}

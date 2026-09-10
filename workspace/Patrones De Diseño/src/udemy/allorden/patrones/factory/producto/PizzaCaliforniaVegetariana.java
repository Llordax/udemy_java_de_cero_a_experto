package udemy.allorden.patrones.factory.producto;

import udemy.allorden.patrones.factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

	public PizzaCaliforniaVegetariana() {
		super();
		nombre = "Pizza California Vegetariana";
		masa = "Masa delgada Light";
		salsa = "Salsa BBQ Light";
		
		ingredientes.add("Queso Mozzarella");
		ingredientes.add("Aceitunas");
		ingredientes.add("Espinacas");
		ingredientes.add("Cebolla");
		ingredientes.add("Berenjena");
	}

	@Override
	public void cocinar() {
		System.out.println("Cocinando por 20 mins a 180ºC");
	}

	@Override
	public void cortar() {
		System.out.println("Cortando la pizza en rebanadas rectangulares");
	}
}

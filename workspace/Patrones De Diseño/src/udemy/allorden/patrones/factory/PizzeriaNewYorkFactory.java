package udemy.allorden.patrones.factory;

import udemy.allorden.patrones.factory.producto.PizzaNewYorkItaliana;
import udemy.allorden.patrones.factory.producto.PizzaNewYorkPepperoni;
import udemy.allorden.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {

	@Override
	public PizzaProducto crearPizza(String tipo) {
		return switch(tipo) {
			case "vegetariana" -> new PizzaNewYorkVegetariana();
			case "pepperoni" -> new PizzaNewYorkPepperoni();
			case "italiana" -> new PizzaNewYorkItaliana();
			default -> null;
		};
	}
}

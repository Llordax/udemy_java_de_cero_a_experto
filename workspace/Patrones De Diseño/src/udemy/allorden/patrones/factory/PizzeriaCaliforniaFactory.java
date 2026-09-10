package udemy.allorden.patrones.factory;

import udemy.allorden.patrones.factory.producto.PizzaCaliforniaPepperoni;
import udemy.allorden.patrones.factory.producto.PizzaCaliforniaQueso;
import udemy.allorden.patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory {

	@Override
	public PizzaProducto crearPizza(String tipo) {
		return switch(tipo) {
			case "queso" -> new PizzaCaliforniaQueso();
			case "vegetariana" -> new PizzaCaliforniaVegetariana();
			case "pepperoni" -> new PizzaCaliforniaPepperoni();
			default -> null;
		};
	}

}

package udemy.allorden.patrones.factory.ejemplo;

import udemy.allorden.patrones.factory.PizzaProducto;
import udemy.allorden.patrones.factory.PizzeriaCaliforniaFactory;
import udemy.allorden.patrones.factory.PizzeriaNewYorkFactory;
import udemy.allorden.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
	
	public static void main(String[] args) {
		
		PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
		PizzeriaZonaAbstractFactory ca = new PizzeriaCaliforniaFactory();
		
		PizzaProducto pizza = ca.ordenarPizza("queso");
		System.out.println("Bruce ordena la pizza " + pizza.getNombre());
		
		pizza = ny.ordenarPizza("pepperoni");
		System.out.println("Andrés ordena una " + pizza.getNombre());
		
		pizza = ca.ordenarPizza("vegetariana");
		System.out.println("James ordena " + pizza.getNombre());
		
		pizza = ny.ordenarPizza("vegetariana");
		System.out.println("Luis ordena " + pizza.getNombre());
		
		pizza = ca.ordenarPizza("pepperoni");
		System.out.println("John ordena la pizza " + pizza.getNombre());
		
		System.out.println("pizza = " + pizza);
	}
}

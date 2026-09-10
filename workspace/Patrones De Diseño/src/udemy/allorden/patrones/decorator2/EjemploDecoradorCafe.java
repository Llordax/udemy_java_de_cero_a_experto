package udemy.allorden.patrones.decorator2;

import udemy.allorden.patrones.decorator2.decorador.ConChocolateDecorador;
import udemy.allorden.patrones.decorator2.decorador.ConCremaDecorador;
import udemy.allorden.patrones.decorator2.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {

	public static void main(String[] args) {
		
		Configurable cafe = new Cafe("Café Mocha", 7);
		ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
		ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
		ConChocolateDecorador conChocolate = new ConChocolateDecorador(conLeche);
		
		System.out.println("El precio del café Mocha es: " + conChocolate.getPrecioBase());
		System.out.println("Ingredientes: " + conChocolate.getIngredientes());
		
		Configurable capuccino = new Cafe("Café capuccino", 4);
		conCrema = new ConCremaDecorador(capuccino);
		conLeche = new ConLecheDecorador(conCrema);
		
		System.out.println("El precio del capuccino es: " + conLeche.getPrecioBase());
		System.out.println("Ingredientes: " + conLeche.getIngredientes());
		
		Configurable espresso = new Cafe("Café Espresso", 3);
		System.out.println("El precio del café espresso es: " + espresso.getPrecioBase());
		System.out.println("Ingredientes: " + espresso.getIngredientes());
	}
}

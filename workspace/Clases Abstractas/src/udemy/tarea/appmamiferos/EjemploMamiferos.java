package udemy.tarea.appmamiferos;

import udemy.tarea.appmamiferos.clasesabstractas.Mamifero;
import udemy.tarea.appmamiferos.domain.*;

public class EjemploMamiferos {

	public static void main(String[] args) {
		
		Mamifero[] mamiferos = new Mamifero[5];
		
		Mamifero guepardo = new Guepardo("sabana", "Acinonyx jubatus", 1.2, 1.50, 80, 0.1, 70);
		Mamifero leon = new Leon("sabana", "Panthera leo", 1.40, 1.70, 190, 0.12, 45, 7, 120);
		Mamifero tigre = new Tigre("selva", "Panthera tigris", 1.45, 1.70, 200, 0.1, 45, "felino");
		Mamifero lobo = new Lobo("bosque", "Canis lupus", 1.20, 1.1, 65, "gris", 0.07, 6, "canino");
		Mamifero perro = new Perro("casa", "Canis lupus familiaris", 0.7, 1, 40, "crema", 0.05, 291);
		
		mamiferos[0] = guepardo;
		mamiferos[1] = leon;
		mamiferos[2] = tigre;
		mamiferos[3] = lobo;
		mamiferos[4] = perro;
		
		for(Mamifero m : mamiferos) {
			System.out.println(m.comer() + "\n"
					+ m.comunicarse() + "\n"
					+ m.correr() + "\n"
					+ m.dormir()
					+ m.toString());
			System.out.println();
		}

	}

}

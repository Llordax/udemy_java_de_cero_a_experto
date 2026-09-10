package udemy.allorden.interfaces.imprenta;

import udemy.allorden.interfaces.imprenta.modelo.*;
import static udemy.allorden.interfaces.imprenta.modelo.Genero.*;
import static udemy.allorden.interfaces.imprenta.modelo.Imprimible.*;

public class EjemploImprenta {

	public static void main(String[] args) {
		
		Curriculum cv = new Curriculum(new Persona("John", "Doe"), 
				"Ingeniero de sistemas", "Resumen laboral...");
		
		cv.addExperiencia("Java")
		.addExperiencia("Oracle DBA")
		.addExperiencia("Spring Framework")
		.addExperiencia("Desarrollador fullstack")
		.addExperiencia("Angular");
		
		Libro libro = new Libro(new Persona("Erich", "Gamma"), 
				"Patrones de diseños: Elem. Reusables POO", PROGRAMACION);

		libro.addPagina(new Pagina("Patrón Singleton"))
			.addPagina(new Pagina("Patrón Observador"))
			.addPagina(new Pagina("Patrón Factory"))
			.addPagina(new Pagina("Patrón Composite"))
			.addPagina(new Pagina("Patrón Facade"));
		
		Informe informe = new Informe(new Persona("Martín", "Fowler"), 
				new Persona("Jame", "Gosling"), "Estudio sobre microservicios");
		
		imprimir(cv);
		imprimir(informe);
		imprimir(libro);
		
		imprimir(new Imprimible() {
			@Override
			public String imprimir() {
				return "Imprimiendo un objeto genérico de una clase anónima";
			}
		});
		
		System.out.println(TEXTO_DEFECTO);
		
	}

}

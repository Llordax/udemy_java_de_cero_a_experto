package udemy.allorden.recursividad.ejemplo;

import java.util.stream.Stream;

import udemy.allorden.recursividad.ejemplo.models.Componente;

public class EjemploRecursividad {
	
	public static void main(String[] args) {
		
		Componente pc = new Componente("Gabinete PC ATX");
		Componente poder = new Componente("Fuente de poder 750w");
		Componente placaMadre = new Componente("MainBoard Asus sockets AMD");
		Componente cpu = new Componente("CPU AMD Rayzen 5 2800");
		Componente ventilador = new Componente("Ventilador CPU");
		Componente disipador = new Componente("Disipador");
		Componente tv = new Componente("Nvidia RTX 3080 8GB");
		Componente gpu = new Componente("Nvidia RTX GPU");
		Componente gpuRam = new Componente("4GB RAM");
		Componente gpuRam2 = new Componente("4GB RAM");
		Componente gpuVentiladores = new Componente("Ventiladores");
		Componente ram = new Componente("Memoria RAM 32 GB");
		Componente ssd = new Componente("Disco SSD 2TB");
		
		cpu.addComponente(ventilador)
			.addComponente(disipador);
		
		tv.addComponente(gpu)
			.addComponente(gpuRam)
			.addComponente(gpuRam2)
			.addComponente(gpuVentiladores);
		
		placaMadre.addComponente(cpu)
			.addComponente(tv)
			.addComponente(ram)
			.addComponente(ssd);
		
		pc.addComponente(poder)
			.addComponente(placaMadre)
			.addComponente(new Componente("Teclado"))
			.addComponente(new Componente("Mouse"));
		
		metodoRecursivoJava8(pc,0).forEach(c -> System.out.println("\t".repeat(c.getNivel()) + c.getNombre()));
	}
	
	public static void metodoRecursivo(Componente componente, int nivel) {
		// Imprime el nombre del componente con indentación basada en el nivel
		System.out.println("\t".repeat(nivel) + componente.getNombre());
		
		 // Caso Recursivo: Se verifica si el componente tiene componentes hijos
		if (componente.tieneComponentes()) 
			// Itera sobre cada componente hijo
			for (Componente c : componente.getComponentes()) 
				// Llamada recursiva para el componente hijo, incrementando el nivel
				metodoRecursivo(c, nivel + 1); // Esta es la parte recursiva del método
		
		/**
		 * Caso Base implícito: Cuando un componente no tiene componentes hijos (componente.tieneComponentes() devuelve false),
		 * el método termina su ejecución después de imprimir el nombre del componente.
		 * 
		 * No se realizan más llamadas recursivas, finalizando así la recursión para esa rama.
		 */
	}
	
	public static Stream<Componente> metodoRecursivoJava8(Componente componente, int nivel) {
		componente.setNivel(nivel);
		
		return Stream.concat(Stream.of(componente), 
				componente.getComponentes().stream().flatMap(c -> metodoRecursivoJava8(c, nivel + 1)));
	}
}

package es.allorden.app.jardin;

import es.allorden.app.hogar.*; //-> con esto importas todas las clases, métodos, atributos... dentro del paquete
//import es.allorden.app.hogar.Gato;

//import es.allorden.app.hogar.Persona.*; -> con esto importas todas las clases, métodos, atributos... dentro del paquete
import static es.allorden.app.hogar.ColorPelo.*;
import static es.allorden.app.hogar.Persona.saludar; //Import estático
import static es.allorden.app.hogar.Persona.GENERO_FEMENINO;
import static es.allorden.app.hogar.Persona.GENERO_MASCULINO;

public class EjemploPackages {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		p.setNombre("Andrés");
		p.setApellido("Guzmán");
		p.setColorPelo(RUBIO);
		
		System.out.println(p.getNombre());
		
		Perro perro = new Perro();
		perro.nombre = "Tobby";
		perro.raza = "Pitbull";
		
		String jugando = perro.jugar(p);
		System.out.println("jugando = " + jugando);
		
		/**
		 * Gracias al import estático podemos llamar al método estático
		 * sin necesidad de hacer referencia a la clase donde está programado
		 * dicho método (En este caso, la clase persona).
		 */
		String saludo = saludar(); 
		
		String generoMujer = GENERO_FEMENINO;
		String generoHombre = GENERO_MASCULINO;

	}

}

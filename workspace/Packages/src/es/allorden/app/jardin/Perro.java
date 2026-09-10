package es.allorden.app.jardin;

import es.allorden.app.hogar.Persona;

public class Perro {

	protected String nombre, raza;
	
	String jugar(Persona persona) {
		return persona.lanzarPelota();
	}
}

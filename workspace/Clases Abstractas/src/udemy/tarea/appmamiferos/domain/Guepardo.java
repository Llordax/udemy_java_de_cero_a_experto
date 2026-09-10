package udemy.tarea.appmamiferos.domain;

import udemy.tarea.appmamiferos.clasesabstractas.Felino;

public class Guepardo extends Felino {

	//SIN CAMPOS DE CLASE

	public Guepardo(String habitat, String nombreCientifico, double altura, double largo, double peso,
			double tamanioGarras, int velocidad) {
		super(habitat, nombreCientifico, altura, largo, peso, tamanioGarras, velocidad);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public String comer() {
		return "El guepardo caza";
	}

	@Override
	public String dormir() {
		return "El guepardo duerme en " + habitat;
	}

	@Override
	public String correr() {
		return "El guepardo corre a una velocidad de " + velocidad + "km/h"; 
	}

	@Override
	public String comunicarse() {
		
		return "El guepardo se comunica rugiendo";
	}
}

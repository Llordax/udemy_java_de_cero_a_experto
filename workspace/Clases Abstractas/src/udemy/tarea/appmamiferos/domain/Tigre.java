package udemy.tarea.appmamiferos.domain;

import udemy.tarea.appmamiferos.clasesabstractas.Felino;

public class Tigre extends Felino {

	private String especie;

	public Tigre(String habitat, String nombreCientifico, double altura, double largo, double peso,
			double tamanioGarras, int velocidad, String especie) {
		super(habitat, nombreCientifico, altura, largo, peso, tamanioGarras, velocidad);
		this.especie = especie;
	}

	public String getEspecie() {
		return especie;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTigre [especie=" + especie + "]";
	}

	@Override
	public String comer() {
		return "El tigre caza con su fuerte arañazo, sus garras miden " + tamanioGarras + "cm";
	}

	@Override
	public String dormir() {
		return "El tigre duerme en la " + habitat;
	}

	@Override
	public String correr() {
		return "El tigre puede correr a una velocidad de " + velocidad + " km/h";
	}

	@Override
	public String comunicarse() {
		return "Los tigres se comunican con los de su misma especie: " + especie;
	}

}

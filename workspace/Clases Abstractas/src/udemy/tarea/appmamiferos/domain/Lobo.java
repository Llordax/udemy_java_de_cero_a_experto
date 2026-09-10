package udemy.tarea.appmamiferos.domain;

import udemy.tarea.appmamiferos.clasesabstractas.Canino;

public class Lobo extends Canino {

		private int numCamada;
		private String especie;

	public Lobo(String habitat, String nombreCientifico, double altura, double largo, double peso, String color,
			double tamanioColmillos, int numCamada, String especie) {
		super(habitat, nombreCientifico, altura, largo, peso, color, tamanioColmillos);
		this.numCamada = numCamada;
		this.especie = especie;
	}

	public int getNumCamada() {
		return numCamada;
	}

	public String getEspecie() {
		return especie;
	}

	@Override
	public String toString() {
		return super.toString() +  "\nLobo [numCamada=" + numCamada + ", especie=" + especie + "]";
	}

	@Override
	public String comer() {
		return "El lobo caza y desgarra a sus presas con unos colmillos de " + tamanioColmillos + "cm";
	}

	@Override
	public String dormir() {
		return "El lobo duerme junto a sus " + numCamada + " crias";
	}

	@Override
	public String correr() {
		return "El lobo " + color + " corre";
	}

	@Override
	public String comunicarse() {
		return "El lobo se comunica en el " + habitat;
	}

}

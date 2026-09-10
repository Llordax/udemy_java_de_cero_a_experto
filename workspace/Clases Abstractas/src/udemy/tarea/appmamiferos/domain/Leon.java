package udemy.tarea.appmamiferos.domain;

import udemy.tarea.appmamiferos.clasesabstractas.Felino;

public class Leon extends Felino {

	private int numManada;
	private double potenciaRugido;

	public Leon(String habitat, String nombreCientifico, double altura, double largo, double peso, double tamanioGarras,
			int velocidad, int numManada, double potenciaRugido) {
		super(habitat, nombreCientifico, altura, largo, peso, tamanioGarras, velocidad);
		this.numManada = numManada;
		this.potenciaRugido = potenciaRugido;
	}

	public int getNumManada() {
		return numManada;
	}

	public double getPotenciaRugido() {
		return potenciaRugido;
	}

	@Override
	public String toString() {
		return super.toString() + "\nLeon [numManada=" + numManada + ", potenciaRugido=" + potenciaRugido + "]";
	}

	@Override
	public String comer() {
		return "El león caza junsto a su grupo de " + numManada + " individuos en las llanuras africanas";
	}

	@Override
	public String dormir() {
		return "El león duerme en la sombra de la " + habitat;
	}

	@Override
	public String correr() {
		return "El león no es tan veloz, solo corre a una velocidad de " + velocidad + "km/h, ya que es un "
					+ "animal pesado de " + peso + "kg";
	}

	@Override
	public String comunicarse() {
		return "El león se comunica con una potencia de rugido de " + potenciaRugido + "db";
	}

}

package udemy.tarea.appmamiferos.domain;

import udemy.tarea.appmamiferos.clasesabstractas.Canino;

public class Perro extends Canino {

	private int fuerzaMordida;

	public Perro(String habitat, String nombreCientifico, double altura, double largo, double peso, String color,
			double tamanioColmillos, int fuerzaMordida) {
		super(habitat, nombreCientifico, altura, largo, peso, color, tamanioColmillos);
		this.fuerzaMordida = fuerzaMordida;
	}

	public int getFuerzaMordida() {
		return fuerzaMordida;
	}

	@Override
	public String toString() {
		return super.toString() + "\nPerro [fuerzaMordida=" + fuerzaMordida + "]";
	}

	@Override
	public String comer() {
		return "El perro come con una fuerza de mordida de " + fuerzaMordida + "psi";
	}

	@Override
	public String dormir() {
		return "El perro duerme en mi " + habitat;
	}

	@Override
	public String correr() {
		return "Mi perro no corre mucho ya que pesa casi el doble de lo que debería: " + peso + "kg";
	}

	@Override
	public String comunicarse() {
		return "El perro ladra demasiado cuando está con gente";
	}

}

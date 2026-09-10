package udemy.tarea.appmamiferos.clasesabstractas;

public abstract class Felino extends Mamifero {

	protected double tamanioGarras;
	protected int velocidad;
	
	public Felino(String habitat, String nombreCientifico, double altura, double largo, double peso, double tamanioGarras, int velocidad) {
		super(habitat, nombreCientifico, altura, largo, peso);
		this.tamanioGarras = tamanioGarras;
		this.velocidad = velocidad;
	}

	public double getTamanioGarras() {
		return tamanioGarras;
	}

	public int getVelocidad() {
		return velocidad;
	}

	@Override
	public String toString() {
		return super.toString() + "\nFelino [tamanioGarras=" + tamanioGarras + ", velocidad=" + velocidad + "]";
	}

}

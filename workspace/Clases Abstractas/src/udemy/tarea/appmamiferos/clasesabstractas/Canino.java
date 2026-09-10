package udemy.tarea.appmamiferos.clasesabstractas;

public abstract class Canino extends Mamifero {

	protected String color;
	protected double tamanioColmillos;
	
	public Canino(String habitat, String nombreCientifico, double altura, double largo, double peso, String color, double tamanioColmillos) {
		super(habitat, nombreCientifico, altura, largo, peso);
		this.color = color;
		this.tamanioColmillos = tamanioColmillos;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCanino [color=" + color + ", tamanioColmillos=" + tamanioColmillos + "]";
	}

	public double getTamanioColmillos() {
		return tamanioColmillos;
	}

}

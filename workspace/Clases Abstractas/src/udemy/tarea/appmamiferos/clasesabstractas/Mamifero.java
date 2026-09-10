package udemy.tarea.appmamiferos.clasesabstractas;

public abstract class Mamifero {
	
	protected String habitat, nombreCientifico;
	protected double altura, largo, peso;
	
	public Mamifero(String habitat, String nombreCientifico, double altura, double largo, double peso) {
		this.habitat = habitat;
		this.nombreCientifico = nombreCientifico;
		this.altura = altura;
		this.largo = largo;
		this.peso = peso;
	}

	public String getHabitat() {
		return habitat;
	}
	
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double getLargo() {
		return largo;
	}
	
	public double getPeso() {
		return peso;
	}
	
	@Override
	public String toString() {
		return "\nMamifero [habitat=" + habitat + ", nombreCientifico=" + nombreCientifico + ", altura=" + altura
				+ ", largo=" + largo + ", peso=" + peso + "]";
	}

	public abstract String comer();
	
	public abstract String dormir();
	
	public abstract String correr();
	
	public abstract String comunicarse();

}

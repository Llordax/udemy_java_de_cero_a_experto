package udemy.tarea.domain;

public class Comics extends Libro {
	
	private String personaje;

	public Comics(String autor, String titulo, String editorial, int precio, String personaje) {
		super(autor, titulo, editorial, precio);
		this.personaje = personaje;
	}

	public String getPersonaje() {
		return personaje;
	}
	
	@Override
	public double getPrecioVenta() {
		return precio * 0.85;
	}

}

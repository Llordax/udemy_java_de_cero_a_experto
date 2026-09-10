package udemy.tarea.domain;

import java.util.Date;

import udemy.tarea.clasesabstractas.Producto;
import udemy.tarea.interfaces.ILibro;

public class Libro extends Producto implements ILibro {

	private Date fechaPublicacion;
	private String autor, titulo, editorial;
	
	public Libro(String autor, String titulo, String editorial, int precio) {
		super(precio);
		this.autor = autor;
		this.titulo = titulo;
		this.editorial = editorial;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	@Override
	public double getPrecioVenta() {
		return precio * 0.95;
	}

}

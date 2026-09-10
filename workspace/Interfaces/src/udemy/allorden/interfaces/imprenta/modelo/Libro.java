package udemy.allorden.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{

	private Persona autor;
	private String titulo;
	private Genero genero;
	private List<Imprimible> paginas = new ArrayList<>();
	
	public Libro(Persona autor, String titulo, Genero genero) {
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
	}
	
	public Libro addPagina(Imprimible pagina) {
		paginas.add(pagina);
		return this;
	}
	
	@Override
	public String imprimir() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(titulo).append("\n")
			.append("Autor: ").append(autor).append("\n")
			.append("Género: ").append(genero).append("\n");
		
		for(Imprimible pag : paginas)
			sb.append(pag.imprimir()).append("\n");
		
		return sb.toString();
	}
	
}

package udemy.allorden.optional.ejemplo;

import java.util.Optional;

import udemy.allorden.optional.ejemplo.models.Computador;
import udemy.allorden.repositorio.ComputadorRepositorio;
import udemy.allorden.repositorio.Repositorio;

public class EjemploRepositorioMetodosOrElseThrow {
	
	public static void main(String[] args) {
		
		Repositorio<Computador> repositorio = new ComputadorRepositorio();
		
		Computador pc = repositorio.filtrar("rog").orElseThrow(IllegalStateException::new);
		
		System.out.println(pc);
		
		String archivo = "documento.pdf";
		
		String extension = Optional.ofNullable(archivo)
				.filter(a -> a.contains("."))
				.map(a -> a.substring(archivo.lastIndexOf(".") + 1))
				.orElseThrow();
		
		System.out.println(extension);
	}
}

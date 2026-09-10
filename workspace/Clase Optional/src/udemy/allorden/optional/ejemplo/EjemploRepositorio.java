package udemy.allorden.optional.ejemplo;

import java.util.Optional;

import udemy.allorden.optional.ejemplo.models.Computador;
import udemy.allorden.repositorio.ComputadorRepositorio;
import udemy.allorden.repositorio.Repositorio;

public class EjemploRepositorio {
	
	public static void main(String[] args) {
		
		Repositorio<Computador> repositorio = new ComputadorRepositorio();
		
		repositorio.filtrar("asus").ifPresentOrElse(System.out::println,
				() -> System.out.println("No se encontró"));
		
		//Optional<Computador> pc = repositorio.filtrar("asus rog");
		
		/*
		if (pc.isPresent()) 
			System.out.println(pc.get());
		
		else 
			System.out.println("No se encontró");
		*/
		
		
	}
}

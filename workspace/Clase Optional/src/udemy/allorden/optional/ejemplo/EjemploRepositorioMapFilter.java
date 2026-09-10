package udemy.allorden.optional.ejemplo;

import java.util.Optional;

import udemy.allorden.optional.ejemplo.models.Computador;
import udemy.allorden.optional.ejemplo.models.Fabricante;
import udemy.allorden.optional.ejemplo.models.Procesador;
import udemy.allorden.repositorio.ComputadorRepositorio;
import udemy.allorden.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
	
	public static void main(String[] args) {
		
		Repositorio<Computador> repositorio = new ComputadorRepositorio();
		
		String f = repositorio.filtrar("macbook")
				.flatMap(Computador::getProcesador)
				.flatMap(Procesador::getFabricante)
				.filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
				.map(Fabricante::getNombre)
				.orElse("Desconocido");
		
		System.out.println(f);
		
		f = repositorio.filtrar("macbook")
				.flatMap(Computador::getProcesador)
				.flatMap(Procesador::getFabricante)
				.filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
				.map(Fabricante::getNombre)
				.orElse("Desconocido");
		
		System.out.println(f);
	}
}

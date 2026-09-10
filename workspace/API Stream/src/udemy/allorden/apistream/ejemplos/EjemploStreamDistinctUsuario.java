package udemy.allorden.apistream.ejemplos;

import java.util.stream.Stream;

import udemy.allorden.apistream.ejemplos.models.Usuario;

public class EjemploStreamDistinctUsuario {

	public static void main(String[] args) {
		
		Stream<Usuario> nombres = Stream
				.of("Aaron Rodríguez", "Nacho Robles", "Iker Jiménez", "Antonio Montilla",
						"Pablo Roblas", "Aaron Rodríguez", "Aaron Rodríguez")
	
				.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.distinct();
		
		nombres.forEach(System.out::println);
	}
}

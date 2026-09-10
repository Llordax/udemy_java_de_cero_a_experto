package udemy.allorden.apistream.ejemplos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import udemy.allorden.apistream.ejemplos.models.Usuario;

public class EjemploStreamFilter {

	public static void main(String[] args) {
		
		Stream<Usuario> nombres = Stream
				.of("Aaron Rodríguez", "Nacho Robles", "Iker Jiménez", "Antonio Montilla",
						"Pablo Roblas")
				.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.filter(u -> u.getNombre().equals("Pablo"))
				.peek(System.out::println);
				
		
		List<Usuario> lista = nombres.collect(Collectors.toList());
		lista.forEach(System.out::println);
		
		//nombres.forEach(System.out::println);
		
	}

}

package udemy.allorden.apistream.ejemplos;

import java.util.stream.Stream;

import udemy.allorden.apistream.ejemplos.models.Usuario;

public class EjemploStreamFilterSingle2 {

	public static void main(String[] args) {
		
		Usuario usuario = Stream
				.of("Aaron Rodríguez", "Nacho Robles", "Iker Jiménez", "Antonio Montilla",
						"Pablo Roblas")
				.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.peek(System.out::println)
				.filter(u -> u.getId().equals(5))
				.findFirst().orElseGet(() -> new Usuario("Marta", "Gadea"));
	
		System.out.println(usuario);
		
		//nombres.forEach(System.out::println);
	}
}

package udemy.allorden.apistream.ejemplos;

import java.util.stream.Stream;

import udemy.allorden.apistream.ejemplos.models.Usuario;

public class EjemploStreamFlatMap {

	public static void main(String[] args) {
		
		Stream<Usuario> nombres = Stream
				.of("Aaron Rodríguez", "Nacho Robles", "Iker Jiménez", "Antonio Montilla",
						"Pablo Roblas", "Pablo López")
				.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.flatMap(u ->  {
					if(u.getNombre().equalsIgnoreCase("Pablo"))
						return Stream.of(u);
								
					return Stream.empty();
				})
				.peek(System.out::println);
		
		//nombres.forEach(System.out::println);
		System.out.println(nombres.count());
		
	}

}

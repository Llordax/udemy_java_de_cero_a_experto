package udemy.allorden.apistream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamDistinct {

	public static void main(String[] args) {
		
		Stream<String> nombres = Stream.of("Aaron Rodríguez", "Nacho Robles", "Iker Jiménez", "Antonio Montilla",
						"Pablo Roblas", "Iker Jiménez", "Iker Jiménez", "Iker Jiménez")
				.distinct();		
		
		nombres.forEach(System.out::println);
	}
}

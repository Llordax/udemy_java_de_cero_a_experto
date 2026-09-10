package udemy.allorden.apistream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {

	public static void main(String[] args) {
		
		Stream<String> nombres = Stream.of("Aaron Rodríguez", "Nacho Robles", "Iker Jiménez", "Antonio Montilla",
						"Pablo Roblas", "Iker Jiménez", "Iker Jiménez", "Iker Jiménez")
				.distinct();		
		
		String resultado = nombres.reduce("resultado concatenación ", (a, b) -> a + "# " + b);
		System.out.println(resultado);
	}
}

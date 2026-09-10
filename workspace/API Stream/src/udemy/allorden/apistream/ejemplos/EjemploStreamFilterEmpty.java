package udemy.allorden.apistream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {

	public static void main(String[] args) {
		
		Long count = Stream
				.of("Aaron Rodríguez", "Nacho Robles", "", "Antonio Montilla",
						"")
				.filter(String::isEmpty)
				.peek(System.out::println)
				.count();
		
		System.out.println("count = " + count);
	
		
		
	}

}

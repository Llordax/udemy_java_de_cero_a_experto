package udemy.allorden.apistream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {

	public static void main(String[] args) {
		
		Stream<String> nombres = Stream.of("Aaron", "Nacho", "Iker", "Antonio");
		nombres.forEach(System.out::println);
		
		System.out.println();
		
		String[] array = {"Aaron", "Nacho", "Iker", "Antonio"};
		Stream<String>nombres2 = Arrays.stream(array);
		nombres2.forEach(System.out::println);
		
		System.out.println();
		
		Stream<String> nombres3 = Stream.<String>builder()
				.add("Aaron")
				.add("Nacho")
				.add("Iker")
				.add("Antonio")
				.build();
		nombres3.forEach(System.out::println);
		
		System.out.println();
		
		List<String> lista = new ArrayList<>();
		lista.add("Aaron");
		lista.add("Nacho");
		lista.add("Iker");
		lista.add("Antonio");
		
		Stream<String> nombres4 = lista.stream();
		nombres4.forEach(System.out::println);
		
		System.out.println();
		
		lista.stream().forEach(System.out::println);
		
	}

}

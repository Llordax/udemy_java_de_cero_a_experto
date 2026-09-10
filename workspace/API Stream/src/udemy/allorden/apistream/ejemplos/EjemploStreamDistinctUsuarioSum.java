package udemy.allorden.apistream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import udemy.allorden.apistream.ejemplos.models.Usuario;

public class EjemploStreamDistinctUsuarioSum {

	public static void main(String[] args) {
		
		IntStream largoNombres = Stream
				.of("Aaron Rodríguez", "Nacho Robles", "Iker Jiménez", "Antonio Montilla",
						"Pablo Roblas", "Aaron Rodríguez", "Aaron Rodríguez")
				.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.distinct()
				.mapToInt(u -> u.toString().length())
				.peek(System.out::println);
		
		//largoNombres.forEach(System.out::println);
		IntSummaryStatistics stats = largoNombres.summaryStatistics();
		System.out.println("total: " + stats.getSum());
		System.out.println("max: " + stats.getMax());
		System.out.println("min: " + stats.getMin());
		System.out.println("promedio: " + stats.getAverage());
	}
}

package udemy.allorden.apistream.ejemplos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import udemy.allorden.apistream.ejemplos.models.Usuario;

public class EjemploStreamMap {

	public static void main(String[] args) {
		
		Stream<Usuario> nombres = Stream
				.of("Aaron Rodríguez", "Nacho Robles", "Iker Jiménez", "Antonio Montilla")
				.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.peek(System.out::println)
				.map(usuario -> {
					String nombre = usuario.getNombre().toUpperCase();
					usuario.setNombre(nombre);
					return usuario;
				});
				
		
		List<Usuario> lista = nombres.collect(Collectors.toList());
		lista.forEach(System.out::println);
		
		//nombres.forEach(System.out::println);
		
		/*
		System.out.println();
		
		Stream.of("Aaron", "Nacho", "Iker", "Antonio")
				.map(nombre -> {
			return nombre.toUpperCase();
		}).forEach(System.out::println);
		*/
		
	}

}

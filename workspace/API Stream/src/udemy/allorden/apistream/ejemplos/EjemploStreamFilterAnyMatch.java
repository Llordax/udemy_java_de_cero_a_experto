package udemy.allorden.apistream.ejemplos;

import java.util.stream.Stream;

import udemy.allorden.apistream.ejemplos.models.Usuario;

public class EjemploStreamFilterAnyMatch {

	public static void main(String[] args) {
		
		boolean existe = Stream
				.of("Aaron Rodríguez", "Nacho Robles", "Iker Jiménez", "Antonio Montilla",
						"Pablo Roblas")
				.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.peek(System.out::println)
				.anyMatch(u -> u.getId().equals(5));
	
		System.out.println(existe);
		
		/*
		List<Usuario> lista = Arrays.asList(new Usuario("Aaron", "Rodríguez"),
				new Usuario("Nacho", "Robles"),
				new Usuario("Iker", "Jiménez"), 
				new Usuario("Antonio", "Montilla"),
				new Usuario("Pablo", "Roblas"));
		
		boolean resultado = false;
		for(Usuario u : lista) {
			if(u.getId().equals(3)) {
				resultado = true;
				break;
			}
		}
		
		System.out.println(resultado);
		*/
	}

}

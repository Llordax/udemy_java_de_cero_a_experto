package udemy.allorden.apistream.ejemplos;

import java.util.Optional;
import java.util.stream.Stream;

import udemy.allorden.apistream.ejemplos.models.Usuario;

public class EjemploStreamFilterSingle {

	public static void main(String[] args) {
		
		Stream<Usuario> nombres = Stream
				.of("Aaron Rodríguez", "Nacho Robles", "Iker Jiménez", "Antonio Montilla",
						"Pablo Roblas")
				.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.filter(u -> u.getNombre().equals("Pablo"))
				.peek(System.out::println);
	
		Optional<Usuario> usuario = nombres.findFirst();
		//System.out.println(usuario.orElse(new Usuario("Marta", "Gadea")).getNombre());
		//System.out.println(usuario.orElseGet(() -> new Usuario("Marta", "Gadea")).getNombre());
		
		if(usuario.isPresent()) 
			System.out.println(usuario.get().getNombre());
		
		else
			System.out.println("No se encontró el objeto");
		
		//System.out.println(usuario.get());
		//nombres.forEach(System.out::println);
		
		
	}

}

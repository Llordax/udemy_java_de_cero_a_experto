package udemy.allorden.apistream.ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import udemy.allorden.apistream.ejemplos.models.Usuario;

public class EjemploStreamListToStream {
	
	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		lista.add(new Usuario("Diego", "García"));
		lista.add(new Usuario("Pablo", "Roblas"));
		lista.add(new Usuario("Aaron", "Rodríguez"));
		lista.add(new Usuario("Chaimae", "Boulben"));
		lista.add(new Usuario("Irene", "González"));
		lista.add(new Usuario("Paula", "Dominguez"));
		lista.add(new Usuario("Alex", "Canseco"));
		lista.add(new Usuario("Alex", "Gómez"));
		
		Stream<String> nombres = lista.stream()
				.map(u -> u.getNombre().toUpperCase()
				.concat(" ")
				.concat(u.getApellido().toUpperCase()))
				.flatMap(nombre -> {
					if(nombre.contains("alex".toUpperCase()))
						return Stream.of(nombre);
					
					return Stream.empty();
				})
				.map(String::toLowerCase)
				.peek(System.out::println);
		
		System.out.println(nombres.count());
	
	}

}

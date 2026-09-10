package udemy.allorden.apistream.ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import udemy.allorden.apistream.ejemplos.models.Usuario;

public class EjemploStreamParallel {
	
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
		
		long t1 = System.currentTimeMillis();
		String resultado = lista.stream()
				.parallel()
				.map(u -> u.toString().toUpperCase())
				.peek(n -> {
					System.out.println("Nombre Thread: " + Thread.currentThread().getName()
							+ " - " + n);
				})
				.flatMap(nombre -> {
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(nombre.contains("alex".toUpperCase()))
						return Stream.of(nombre);
					
					return Stream.empty();
				})
				.findAny().orElse("");
		
		long t2 = System.currentTimeMillis();
		System.out.println("Tiempo total: " + (t2 - t1));
		
		System.out.println(resultado);
	}
}

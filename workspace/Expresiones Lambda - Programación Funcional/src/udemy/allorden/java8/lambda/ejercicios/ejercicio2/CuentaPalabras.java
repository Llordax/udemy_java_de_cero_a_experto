package udemy.allorden.java8.lambda.ejercicios.ejercicio2;

import java.util.Map;

@FunctionalInterface
public interface CuentaPalabras {
	Map<String,Integer> contarPalabras(String frase);
}

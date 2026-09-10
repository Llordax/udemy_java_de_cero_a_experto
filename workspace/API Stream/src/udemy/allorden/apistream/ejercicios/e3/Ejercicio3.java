package udemy.allorden.apistream.ejercicios.e3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercicio3 {

	/**
	 * El siguiente ejercicio es aplanar un arreglo bidimensional 
	 * en un nivel y eliminar repetidos usando el api stream.
	 * 
	 * Aplanar un arreglo significa quitar los elementos del arreglo 
	 * anidado y dejarlos en el arreglo de primer nivel.
	 * 
	 * Por ejemplo, para el arreglo:
	 * String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
	 * debería quedar:
	 *		
	 *			{"java", "groovy", "php", "c#", "python", "javascript", "kotlin"};
	 */
	
	/**
	 * Método main para arrancar el programa.
	 * 
	 * @param args pasado como argumento para arrancar el programa
	 * con una configuración determinada por los parámetros que
	 * configure el usuario.
	 */
	public static void main(String[] args) {
		 String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
	        
	        Function<String[][], List<String>> flatten = array ->  Arrays.stream(array)
	        		.flatMap(a -> Arrays.stream(a))
	                .distinct()
	                .collect(Collectors.toList());
	        
	        flatten.apply(lenguajes).forEach(e -> System.out.println(e));
	}
}

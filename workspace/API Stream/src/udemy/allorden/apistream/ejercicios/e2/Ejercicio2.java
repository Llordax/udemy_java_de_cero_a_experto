package udemy.allorden.apistream.ejercicios.e2;

import java.util.Arrays;
import java.util.function.Function;

public class Ejercicio2 {
	
	/**
	 * El siguiente ejercicio es obtener el numero mayor de un array 
	 * pero utilizando programación funcional, implementando la expresión 
	 * lambda Function<T,R> (que viene predefinida) con el api stream 
	 * y operador reduce.
	 */

	/**
	 * Método main de arranque del programa.
	 * 
	 * @param args pasado como argumento para arrancar el programa
	 * utilizando una configuración con parámetros por consola.
	 */
	public static void main(String[] args) {
		Function<Integer[], Integer> max = array -> Arrays.stream(array)
				.reduce(0, (ac, e) -> ac > e? ac: e);

        int resultado = max.apply(new Integer[]{1, 78, -1700, 2500, 0, 2000, 54, 2});
        System.out.println(resultado);

	}

}

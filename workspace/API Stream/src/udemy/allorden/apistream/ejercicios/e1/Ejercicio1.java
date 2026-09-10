package udemy.allorden.apistream.ejercicios.e1;

import java.util.Arrays;

public class Ejercicio1 {
	
	/**
	 * Como desafió consiste en un arreglo de 100 elementos del 1 al 100, 
	 * del tipo int, utilizando el api stream se pide eliminar los 
	 * divisibles en 10, luego convertir los elementos restante del flujo 
	 * en tipo double y dividirlos en 2, para finalmente devolver la suma 
	 * total de todos ellos usando el operador terminal reduce. El resultado 
	 * debería ser 2250.0
	 */
	
	/**
	 * Método main de arranque del programa.
	 * 
	 * @param args pasado como argumento para arrancar el programa
	 * dentro de la configuración de la consola aplicándole parámetros.
	 */
	public static void main(String[] args) {
		// Crea un array de enteros con una longitud de 100 elementos.
		int[] array = new int[100];
		
		// Llena el array con valores consecutivos comenzando desde 1 hasta 100.
		for (int i = 0; i < array.length; i++) 
			array[i] = i + 1;
		
		// Utiliza Streams para realizar una serie de operaciones en los elementos del array.
		double total = Arrays.stream(array)
				.filter(e -> e % 10 != 0) // Filtra los elementos que no son múltiplos de 10.
				.mapToDouble(e -> (double) e / 2) // Mapea los elementos a valores decimales dividiéndolos por 2.
				.reduce(0, (ac, e) -> ac + e); // Reduce los elementos sumándolos.
		
		//Imprimo el resultado en consola
		System.out.println(total);
	}
}

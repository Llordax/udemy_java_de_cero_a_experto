package udemy.allorden.apistream.ejercicios.e4;

import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {
	
	/**
	 * El siguiente requerimiento es para una lista de productos 
	 * List<Producto> , de 3 a 5 elementos, se pide calcular el 
	 * importe (precio por cantidad) y sumarlos.
	 * 
	 * La clase Producto debe tener el atributo precio del tipo double 
	 * y cantidad int, entonces utilizando stream convertir la lista de 
	 * productos en el gran total del tipo double.
	 */
	
	/**
	 * Método main para arrancar el programa
	 * 
	 * @param args pasado como argumento para iniciar el programa
	 * con una configuración determinada por los parámetros introducidos
	 * por el usuario en consola.
	 */
	public static void main(String[] args) {
		List<Producto> facturas = Arrays.asList(
				new Producto(9.99, 1), 
				new Producto(19.99, 1.5), 
				new Producto(4.99, 2)
				);

        double suma = facturas.stream()
                .mapToDouble(x -> x.getCantidad() * x.getPrecio()) 
                .sum();
	}
}

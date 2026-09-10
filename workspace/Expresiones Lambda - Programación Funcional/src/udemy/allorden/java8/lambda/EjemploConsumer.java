package udemy.allorden.java8.lambda;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import udemy.allorden.java8.lambda.models.Usuario;

public class EjemploConsumer {

	public static void main(String[] args) {
		
		Consumer<Date> consumidor = fecha -> {
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(fecha);
		};
		consumidor.accept(new Date());
		
		/**
		 * Si tiene dos argumentos hay que utilizar paréntesis
		 * y como sólo tiene una sentencia dentro del método no
		 * es necesario utilizar las llaves.
		 */
		BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> 
			System.out.println(nombre + " tiene " + edad + " años!");
		
		consumidorBi.accept("Pepe", 20);
		
		/**
		 * En este caso como el método sólo tiene un argumento
		 * y tiene una única sentencia dentro, el código se puede
		 * simplificar más quedando de esta manera:
		 */
		Consumer<String> consumidor2 =  System.out::println;
		consumidor2.accept("Hola mundo lambda!");
		
		List<String> nombres = Arrays.asList("Andrés", "Pepe", "Luz", "Francisco");
		nombres.forEach(consumidor2);
		
		/**
		 * Por otro lado tenemos la expresión Supplier, que devuelve
		 * un valor y que no tiene argumentos o parámetros.
		 */
		Supplier<Usuario> creaUsuario = Usuario::new; 
		
		Usuario usuario = creaUsuario.get();
		
		/**
		 * En este caso ya que solo tenemos una sentencia podemos 
		 * simplificar el código ya que en este caso tiene un único
		 * argumento que va a devolver: el nombre del usuario.
		 */
		BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
		
		asignarNombre.accept(usuario, "Andrés");
		System.out.println("Nombre usuario: " + usuario.getNombre());
		
		Supplier<String> proveedor = () -> 
			"Hola mundo lambda supplier";
		
		System.out.println(proveedor.get());
	}

}

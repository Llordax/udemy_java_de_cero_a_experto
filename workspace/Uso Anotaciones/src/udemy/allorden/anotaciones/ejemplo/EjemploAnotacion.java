package udemy.allorden.anotaciones.ejemplo;

import java.time.LocalDate;

import udemy.allorden.anotaciones.ejemplo.procesador.JsonSerializador;
import udemy.allorden.anotaciones.models.Producto;

public class EjemploAnotacion {
	public static void main(String[] args) {
		
		Producto p = new Producto();
		p.setFecha(LocalDate.now());
		p.setNombre("mesa centro roble");
		p.setPrecio(1000L);
		
		System.out.println("json = " + JsonSerializador.convertirJson(p));
	}
}

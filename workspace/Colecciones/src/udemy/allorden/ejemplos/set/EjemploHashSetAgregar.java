package udemy.allorden.ejemplos.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjemploHashSetAgregar {
	
	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<>();
		
		System.out.println(hs.add("Pablo")); 
		System.out.println(hs.add("Aaron"));
		System.out.println(hs.add("Elizeu")); 
		System.out.println(hs.add("Marta")); 
		System.out.println(hs.add("Antonio")); 
		
		System.out.println(hs);
		/**
		 * El método add devuelve un boolean, en este caso
		 * devuelve false ya que el siguiente elemento que
		 * se añade se encuentra duplicado.
		 */
		boolean b = hs.add("Elizeu"); 
		System.out.println("¿Permite elementos duplicados? " + b);
		
		System.out.println(hs);
		
		/**
		 * Ya que los set no permiten ordenación puedo convertir
		 * el set en una lista para sí poder ordenarla llamando 
		 * a Collections
		 */
		List<String> miLista = new ArrayList<>(hs);
		Collections.sort(miLista);
		
		System.out.println(miLista);
		
		
	}

}

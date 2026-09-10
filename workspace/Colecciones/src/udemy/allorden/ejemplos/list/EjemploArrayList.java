package udemy.allorden.ejemplos.list;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.List;

import udemy.allorden.ejemplos.modelo.Alumno;

public class EjemploArrayList {
	
	public static void main(String[] args) {
		
		//Set<Alumno> sa = new HashSet<>();
		List<Alumno> al = new ArrayList<>();
		//List<Alumno> sa = new LinkedList<>();
		
		System.out.println(al + ", size = " + al.size());
		System.out.println("Está vacía = " + al.isEmpty());
				
		al.add(new Alumno("Antonio", 7));
		al.add(new Alumno("Pablo", 5));
		al.add(new Alumno("Aaron", 8));
		al.add(new Alumno("Elizeu", 4));
		al.add(3, new Alumno("Marta", 2));
		al.add(new Alumno("Diego", 2));
		al.set(2, new Alumno("Diego", 1));
		
		/**
		 * El método add asigna la posición y desplaza el anterior,
		 * en cambio el método set modifica la posición borrando
		 * al anterior en lugar de desplazarlo.
		 */
				
		System.out.println(al + ", size = " + al.size());
		
		//BORRAMOS POR ÍNDICE
		al.remove(new Alumno("Pablo", 5));
		
		//BORRAMOS POR INSTANCIA
		//al.remove(1);
		
		System.out.println(al + ", size = " + al.size());
		
		boolean b = al.contains(new Alumno("Pablo", 5));
		System.out.println("La lista contiene a Pablo = " + b);
		
		Object[] a = al.toArray();
		
		for(int i = 0; i < a.length; i++)
			System.out.println("Desde el arreglo = " + a[i]);
		
	}

}

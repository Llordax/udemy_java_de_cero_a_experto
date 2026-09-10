package udemy.allorden.ejemplos.list;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator.comparing;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import udemy.allorden.ejemplos.modelo.Alumno;

public class EjemploListComparableComparator {
	
	public static void main(String[] args) {
		
		//Set<Alumno> sa = new HashSet<>();
		//List<Alumno> sa = new ArrayList<>();
		List<Alumno> sa = new LinkedList<>();
		
		sa.add(new Alumno("Antonio", 7));
		sa.add(new Alumno("Pablo", 5));
		sa.add(new Alumno("Aaron", 8));
		sa.add(new Alumno("Elizeu", 4));
		sa.add(new Alumno("Marta", 2));
		sa.add(new Alumno("Diego", 2));
		sa.add(new Alumno("Diego", 1));
		
		// Hay diferentes formas de ordenar las listas:
		
		//CLASE HELPER Collections
		//Collections.sort(sa, (a, b) -> b.getNota().compareTo(a.getNota()));
		//sa.sort((a, b) -> b.getNota().compareTo(a.getNota()));
		//sa.sort(Comparator.comparing((Alumno a) -> a.getNota()).reversed());
		sa.sort(comparing(Alumno::getNota));
		sa.sort(comparing(Alumno::getNota).reversed());
		sa.sort(comparing(Alumno::getNombre));
		sa.sort(comparing(Alumno::getNombre).reversed());
		
		System.out.println(sa);
		
		System.out.println("Iterando usando Stream foreach");
		
		//sa.forEach(a -> System.out.println(a.getNombre()));
		//Optimizando código se quedaría en:
		
		sa.forEach(System.out::println);
		
	}

}

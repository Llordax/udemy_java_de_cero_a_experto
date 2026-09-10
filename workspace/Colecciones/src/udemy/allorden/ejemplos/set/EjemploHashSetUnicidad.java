package udemy.allorden.ejemplos.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import udemy.allorden.ejemplos.modelo.Alumno;

public class EjemploHashSetUnicidad {
	
	public static void main(String[] args) {
		
		Set<Alumno> sa = new HashSet<>();
		//List<Alumno> sa = new ArrayList<>();
		//List<Alumno> sa = new LinkedList<>();
		
		sa.add(new Alumno("Antonio", 7));
		sa.add(new Alumno("Pablo", 5));
		sa.add(new Alumno("Aaron", 8));
		sa.add(new Alumno("Elizeu", 4));
		sa.add(new Alumno("Marta", 2));
		sa.add(new Alumno("Diego", 2));
		sa.add(new Alumno("Diego", 1));
		
		System.out.println(sa);
		
		/**
		 * Gracias a los métodos HashCode e equals
		 * de la clase Alumno podemos duplicar el 
		 * nombre o la nota del alumno siempre y 
		 * cuando ambos campos(nombre y nota) no 
		 * sean iguales simultánemente y que por
		 * tanto la consola imprima a todos los 
		 * alumnos.
		 */
		 
		//MÉTODO SOLO PARA LISTAS
		/*
		System.out.println("Utilizando el for iterado para listas");
		
		for(int i = 0; i < sa.size(); i++)
			System.out.println(sa.get(i));
		*/
		
		System.out.println("Iterando usando foreach");
		
		for(Alumno a : sa)
			System.out.println(a.getNombre());
		
		System.out.println("Iterando usando while e iterator");
		
		Iterator<Alumno> it = sa.iterator();
		while(it.hasNext()) {
			Alumno a = it.next();
			System.out.println(a.getNombre());
		}
		
		System.out.println("Iterando usando Stream foreach");
		
		//sa.forEach(a -> System.out.println(a.getNombre()));
		//Optimizando código se quedaría en:
		
		sa.forEach(System.out::println);
		
	}

}

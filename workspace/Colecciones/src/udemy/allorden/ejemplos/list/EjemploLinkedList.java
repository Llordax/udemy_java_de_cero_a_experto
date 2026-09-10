package udemy.allorden.ejemplos.list;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import udemy.allorden.ejemplos.modelo.Alumno;

public class EjemploLinkedList {
	
	public static void main(String[] args) {
		
		//Set<Alumno> sa = new HashSet<>();
		LinkedList<Alumno> ll = new LinkedList<>();
		//List<Alumno> sa = new LinkedList<>();
		
		System.out.println(ll + ", size = " + ll.size());
		System.out.println("Está vacía = " + ll.isEmpty());
				
		ll.add(new Alumno("Antonio", 7));
		ll.add(new Alumno("Pablo", 5));
		ll.add(new Alumno("Aaron", 8));
		ll.add(new Alumno("Elizeu", 4));
		ll.add(new Alumno("Marta", 2));
		ll.add(new Alumno("Diego", 2));
				
		System.out.println(ll + ", size = " + ll.size());
		
		ll.addFirst(new Alumno("Nacho", 9));
		ll.addLast(new Alumno("Adrián", 6));
		
		System.out.println(ll + ", size = " + ll.size());
		
		System.out.println("Primero = " + ll.getFirst());
		System.out.println("Primero = " + ll.peekFirst());
		System.out.println("Último = " + ll.getLast());
		System.out.println("Último = " + ll.peekLast());
		System.out.println("Índice 2 = " + ll.get(2));
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println(ll + ", size = " + ll.size());
		
		ll.remove(new Alumno("Elizeu", 4));
		
		System.out.println(ll + ", size = " + ll.size());
		
		Alumno a = new Alumno("Ari", 10);
		ll.addLast(a);
		
		System.out.println(ll + ", size = " + ll.size());
		System.out.println("Índice de de Ari = " + ll.indexOf(a));
	
		ll.remove(2);
		System.out.println(ll + ", size = " + ll.size());
		
		ll.set(3, new Alumno("Pedro", 8));
		System.out.println(ll + ", size = " + ll.size());
		
		ListIterator<Alumno> li = ll.listIterator();
		while(li.hasNext()) {
			Alumno alumno = li.next();
			System.out.println(alumno);
		}
		
		System.out.println("********************************************************");
		
		while(li.hasPrevious()) {
			Alumno alumno = li.previous();
			System.out.println(alumno);
		}
		
	}

}

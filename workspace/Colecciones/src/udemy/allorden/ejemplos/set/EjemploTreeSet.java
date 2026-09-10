package udemy.allorden.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
	
	public static void main(String[] args) {
		
		/**
		 * Si queremos ordenar de mayor a menor hay que utilizar
		 * la interfaz Comparator.
		 * 
		 * Podemos hacerlo de varios modos:
		 */
		
		//1er modo: CLASE ANÓNIMA
		Set<String> ts = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				
				return b.compareTo(a);
			}
		});
		
		//2do modo: EXPRESIÓN LAMBDA
		/*
		Set<String> ts2 = new TreeSet<>((a, b) -> {

				return b.compareTo(a);
			
		});
		/*
		
		/**
		 * Como hay solo una expresión que se retorna el
		 * código se puede optimizar más:
		 */
		Set<String> ts2 = new TreeSet<>((a, b) -> b.compareTo(a));
		
		//3er modo: MÉTODO REVERSEORDER
		Set<String> ts3 = new TreeSet<>(Comparator.reverseOrder());
		
		ts.add("Antonio");
		ts.add("Elizeu");
		ts.add("Marta");
		ts.add("Aaron");
		ts.add("Pablo");
		ts.add("Antonio");
		
		System.out.println("ts = " + ts);
		
		Set<Integer> numeros = new TreeSet<>();
		
		numeros.add(1);
		numeros.add(5);
		numeros.add(4);
		numeros.add(2);
		numeros.add(3);
		numeros.add(10);
		
		System.out.println("numeros = " + numeros);
	}

}

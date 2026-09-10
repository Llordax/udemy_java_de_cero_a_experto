package udemy.allorden.ejemplos.set;

import static java.util.Comparator.comparing;
import java.util.Set;
import java.util.TreeSet;

import udemy.allorden.ejemplos.modelo.Alumno;

public class EjemploTreeSetComparable {
	
	public static void main(String[] args) {
		
		//Set<Alumno> sa = new TreeSet<>((a, b) -> b.getNota().compareTo(a.getNota()));
		Set<Alumno> sa = new TreeSet<>(comparing(Alumno::getNota).reversed());
		
		sa.add(new Alumno("Antonio", 7));
		sa.add(new Alumno("Pablo", 5));
		sa.add(new Alumno("Aaron", 8));
		sa.add(new Alumno("Elizeu", 4));
		sa.add(new Alumno("Marta", 2));
		sa.add(new Alumno("Diego", 3));
		
		System.out.println(sa);
		
	}

}

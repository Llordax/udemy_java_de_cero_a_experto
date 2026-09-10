package udemy.allorden.ejemplo;

import udemy.allorden.herencia.*;

public class EjemploHerencia {

	public static void main(String[] args) {
		
		System.out.println("========== Creando la isntancia de la clase Alumno ==========");
		Alumno alumno = new Alumno();
		alumno.setNombre("Alejandro");
		alumno.setApellido("Llordén");
		((Alumno)alumno).setCentroEducativo("Instituo Nacional");
		alumno.setNotaLengua(7);
		alumno.setNotaHistoria(8.1);
		alumno.setNotaMatematicas(9.5);
		
		System.out.println("========== Creando la isntancia de la clase AlumnoInternacional ==========");
		AlumnoInternacional alumnoInt= new AlumnoInternacional();
		alumnoInt.setNombre("Pablo");
		alumnoInt.setApellido("Roblas");
		alumnoInt.setPais("Francia");
		alumnoInt.setEdad(23);
		alumnoInt.setCentroEducativo("Instituto Nacional");
		alumnoInt.setNotaIdiomas(6.8);
		alumnoInt.setNotaHistoria(8.9);
		alumnoInt.setNotaLengua(6);
		alumnoInt.setNotaMatematicas(8.75);
		
		System.out.println("========== Creando la isntancia de la clase Profesor ==========");
		Profesor profesor = new Profesor();
		profesor.setNombre("Aaron");
		profesor.setApellido("Rodríguez");
		profesor.setAsignatura("Matemáticas");
		
		System.out.println("************************************************************************************************************************");
		System.out.println("Alumno: " + alumno.getNombre() + " " 
				+ alumno.getApellido() + " "
				+ ((Alumno)alumno).getCentroEducativo());
		
		System.out.println("Profesor " + profesor.getAsignatura() + ": " 
				+ profesor.getNombre() + " " + profesor.getApellido());
		
		System.out.println("Alumno Internacional: " + alumnoInt.getNombre() + " " 
				+ alumnoInt.getApellido() + " " + alumnoInt.getCentroEducativo() + " "
				+ alumnoInt.getPais());
		
		Class claseAlumnoInt = alumnoInt.getClass();
		
		while(claseAlumnoInt.getSuperclass() != null) {
			String subclase = claseAlumnoInt.getName();
			String superclase = claseAlumnoInt.getSuperclass().getCanonicalName();
			
			System.out.println(subclase + " es una subclase de la superclase " + superclase);
			claseAlumnoInt = claseAlumnoInt.getSuperclass();
		}
	
	}

}

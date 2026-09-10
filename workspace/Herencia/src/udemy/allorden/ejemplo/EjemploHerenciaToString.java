package udemy.allorden.ejemplo;

import udemy.allorden.herencia.Alumno;
import udemy.allorden.herencia.AlumnoInternacional;
import udemy.allorden.herencia.Persona;
import udemy.allorden.herencia.Profesor;

public class EjemploHerenciaToString {

	public static void main(String[] args) {
		
		System.out.println("========== Creando la isntancia de la clase Alumno ==========");
		Alumno alumno = new Alumno("Alejandro", "Llordén", 25, "Instituo Nacional");
		alumno.setNotaLengua(7);
		alumno.setNotaHistoria(8.1);
		alumno.setNotaMatematicas(9.5);
		alumno.setEmail("allorden98@gmail.com");
		
		System.out.println("========== Creando la isntancia de la clase AlumnoInternacional ==========");
		AlumnoInternacional alumnoInt= new AlumnoInternacional("Pablo", "Roblas", "Francia");
		alumnoInt.setEdad(23);
		alumnoInt.setCentroEducativo("Instituto Nacional");
		alumnoInt.setNotaIdiomas(6.8);
		alumnoInt.setNotaHistoria(8.9);
		alumnoInt.setNotaLengua(6);
		alumnoInt.setNotaMatematicas(8.75);
		alumnoInt.setEmail("problas20@gmail.com");
		
		System.out.println("========== Creando la isntancia de la clase Profesor ==========");
		Profesor profesor = new Profesor("Aaron", "Rodríguez", "Matemáticas");
		profesor.setEdad(38);
		profesor.setEmail("a.rodriguez21@gmail.com");
		
		System.out.println("***************************************************************************");
		
		imprimir(alumno);
		imprimir(alumnoInt);
		imprimir(profesor);

	}
	
	public static void imprimir(Persona persona) {
		System.out.println("***************************************************************************");
		System.out.println(persona);

	}

}

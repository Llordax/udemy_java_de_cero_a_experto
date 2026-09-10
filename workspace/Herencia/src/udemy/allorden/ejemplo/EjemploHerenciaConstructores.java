package udemy.allorden.ejemplo;

import udemy.allorden.herencia.*;

public class EjemploHerenciaConstructores {

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
		System.out.println("Imprimiendo los datos en común del tipo Persona");
		System.out.println("nombre: " + persona.getNombre() 
				+ ", apellido: " + persona.getApellido() 
				+ ", edad: " + persona.getEdad()
				+ ", email: " + persona.getEmail());
		
		if(persona instanceof Alumno) {
			System.out.println("Imprimiendo los datos del tipo Alumno:");
			System.out.println("Centro educativo: " + ((Alumno)persona).getCentroEducativo());
			System.out.println("Nota de matemáticas: " + ((Alumno)persona).getNotaMatematicas());
			System.out.println("Nota de historia: " + ((Alumno)persona).getNotaHistoria());
			System.out.println("Nota de lengua: " + ((Alumno)persona).getNotaLengua());
			
			if(persona instanceof AlumnoInternacional) {
				System.out.println("Imprimiendo los datos del tipo Alumno Internacional");
				System.out.println("Nota idiomas: " + ((AlumnoInternacional)persona).getNotaIdiomas());
				System.out.println("País: " + ((AlumnoInternacional)persona).getPais());
			}
			
			System.out.println("**************************** sobreescritura promedio notas ***********************************************");
			System.out.println("Promedio: " + ((Alumno)persona).calcularPromedio());
			System.out.println("**************************** sobreescritura promedio notas ***********************************************");
		}
		
		if(persona instanceof Profesor) {
			System.out.println("Imprimiendo los datos del tipo profesor: ");
			System.out.println("Asignatura: " + ((Profesor)persona).getAsignatura());
		}
		
		System.out.println("**************************** sobreescritura saludar ***********************************************");
	
		System.out.println(persona.saludar());
		
		System.out.println("***************************************************************************");
	}

}

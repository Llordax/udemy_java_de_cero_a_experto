package manejoArrays;
import java.util.Scanner;

public class EjemploArraysNotasAlumno {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double[] claseMatematicas, claseHistoria, claseLengua;
		double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLengua = 0;
		claseMatematicas = new double[7];
		claseHistoria = new double[7];
		claseLengua = new double[7];
		
		System.out.println("Ingrese 7 notas de estudiantes para matemáticas:");
		for(int i = 0; i < claseMatematicas.length; i++) 
			claseMatematicas[i] = scanner.nextDouble();
		
		System.out.println("Ingrese 7 notas de estudiantes para historia:");
		for(int i = 0; i < claseHistoria.length; i++) 
			claseHistoria[i] = scanner.nextDouble();
		
		System.out.println("Ingrese 7 notas de estudiantes para lengua:");
		for(int i = 0; i < claseLengua.length; i++) 
			claseLengua[i] = scanner.nextDouble();
		
		for(int i = 0; i < 7; i++) {
			sumNotasMatematicas += claseMatematicas[i];
			sumNotasHistoria += claseHistoria[i];
			sumNotasLengua += claseLengua[i];
		}
		double promedioMatematicas = sumNotasMatematicas / claseMatematicas.length;
		double promedioHistoria = sumNotasHistoria / claseHistoria.length;
		double promedioLengua = sumNotasLengua / claseLengua.length;
		System.out.println("Promedio clase matemáticas: " + promedioMatematicas);
		System.out.println("Promedio clase matemáticas: " + promedioHistoria);
		System.out.println("Promedio clase matemáticas: " + promedioLengua);
		System.out.println("Promedio total del curso: " + (promedioMatematicas 
				+ promedioHistoria + promedioLengua) / 3);
		
		System.out.println("Ingrese el identificador del alumno (de 0 - 6):");
		int id = scanner.nextInt();
		double promedioAlumno = claseHistoria[id] + claseLengua[id] + claseMatematicas[id];
		System.out.println("Promedio alumno nº " + id + ": " + promedioAlumno);
	}

}

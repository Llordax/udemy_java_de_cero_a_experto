package tarea;

import java.util.Scanner;

public class BuscarNumeroMenor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[3];
		int longitud = numeros.length;
		int numeroMin = 0;
		
		//Rellenamos los números
		numeroMin = numeros[0];
		for(int i = 0; i < longitud; i++) {
			System.out.println("Introduzca numero " + (i + 1));
			numeros[i] = scanner.nextInt();
	
		}
		//Buscamos el numero menor
		numeroMin = numeros[0];
		
		for(int i = 0; i < longitud; i++) {
			if(numeros[i] < numeroMin) 
				numeroMin = numeros[i];
			
		}
		
		if(numeroMin < 10) 
			System.out.println("El número menor " + numeroMin + " es menor que 10!");
			
		else 
			System.out.println("El número menor " + numeroMin + " es igual o mayor que 10!");
		
	}

}

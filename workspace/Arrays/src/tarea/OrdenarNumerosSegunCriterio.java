package tarea;

import java.util.Scanner;

public class OrdenarNumerosSegunCriterio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] numeros = new int[10];
		int longitud = numeros.length;
		
		for(int i = 0; i < longitud; i++) {
			System.out.print("nº posición " + (i) + ": ");
			numeros[i] = scan.nextInt();
		}
		
		for(int i = 0; i <= (longitud - 1) / 2; i++) {
			System.out.println(numeros[longitud - 1 - i]);
			System.out.println(numeros[i]);
		}
		
	}

}

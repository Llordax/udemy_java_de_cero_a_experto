package tarea;

import java.util.Scanner;

public class ImprimirNumeroConMasOcurrencias {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[5];
		int length = numbers.length;
		
		for(int i = 0; i < length; i++) {
			System.out.print("nº " + i + ": ");
			numbers[i] = scan.nextInt();
		}
		int[] aux = new int[length];
		
		for(int i = 0; i < length; i++) {
			int cont = 0;
			for(int j = 0; j < length; j++)
				if(numbers[i] == numbers[j])
					cont++;
			
			aux[i] = cont;
			
		}
		int posicion = 0;
		int max = 0;
		
		for(int i = 0; i < length; i++) 
			if(max < aux[i]) {
				max = aux[i];
				posicion = i;
			}
		
		System.out.println("La mayor ocurrencia es " + max);
		System.out.println("El elemento que más se repite es " + numbers[posicion]);
			
	}

}

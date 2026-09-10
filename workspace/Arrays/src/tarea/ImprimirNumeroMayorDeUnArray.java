package tarea;

import java.util.Scanner;

public class ImprimirNumeroMayorDeUnArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[7];
		int length = numbers.length;
		
		for(int i = 0; i < length; i++) {
			System.out.print("nº" + i + " (0-99):");
			numbers[i] = scan.nextInt();
		}
		
		int max = numbers[0];
		for(int i = 0; i < length; i++) {
			if(numbers[i] > max)
				max = numbers[i];
		}
		System.out.println("max = " + max);

	}

}

package tarea;

import java.util.Scanner;

public class PromedioDeNumeros {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[7];
		int length = numbers.length;
		
		double contPos = 0, contNeg = 0;
		int contZero = 0;
		double promedioPos = 0, promedioNeg = 0;
		
		
		for(int i = 0; i < length; i++) {
			System.out.print("nº" + i + ":");
			numbers[i] = scan.nextInt();
			
			if(numbers[i] == 0)
				contZero++;
			
			if(numbers[i] > 0) {
				contPos++;
				promedioPos = (contPos/length) * 100;
			}
			
			if(numbers[i] < 0) {
				contNeg++;
				promedioNeg = (contNeg/length) * 100;
			}
			
		}
		System.out.println("Promedio de positivos = " + promedioPos + "%");
		System.out.println("Promedio de negativos = " + promedioNeg + "%");
		System.out.println("Cantidad de ceros = " + contZero);

	}

}

package manejoArrays;

import java.util.Scanner;

public class EjemploArraysDetectarOrden {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] a = new int[7];
		
		System.out.println("Ingrese 7 números:");
		for(int i = 0; i < a.length; i++) 
			a[i] = scanner.nextInt();
		
		boolean ascendente = false;
		boolean descendente = false;
		
		for(int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i+1])
				descendente = true;
			
			if (a[i] < a[i+1])
				ascendente = true;
				
		}
		
		if(ascendente && descendente)
			System.out.println("Array = desordenado");
		
		if(!ascendente && !descendente)
			System.out.println("Array = todos son iguales");
		
		if(ascendente && !descendente)
			System.out.println("Array = ordenado de forma ascendente");
		
		if(!ascendente && descendente)
			System.out.println("Array = ordenado de forma descendente");
		

	}

}

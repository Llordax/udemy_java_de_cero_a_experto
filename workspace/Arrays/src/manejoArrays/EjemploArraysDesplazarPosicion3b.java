package manejoArrays;

import java.util.Scanner;

public class EjemploArraysDesplazarPosicion3b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] a = new int[7];
		int numero, posicion, ultimo;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Ingrese un número");
			a[i] = scanner.nextInt();
		}
		System.out.println();
		
		System.out.println("Ingrese un número a insertar:");
		numero = scanner.nextInt();
		
		ultimo = a[a.length - 1];
		posicion = 0;
		while(posicion < 6 && numero > a[posicion]) 
			posicion++;
		
		for(int i = a.length - 2; i >= posicion; i--) 
			a[i+1] = a[i];
		
		int[] b = new int[a.length + 1];
		System.arraycopy(a, 0, b, 0, a.length);
		
		if(numero > ultimo)
			b[b.length - 1] = numero;
		
		else {
			b[b.length - 1] = ultimo;
			b[posicion] = numero;
		}
		
		System.out.println("El nuevo array ordenado:");
		for(int i = 0; i < b.length; i++)
			System.out.println(i + " => " + b[i]);
	}

}

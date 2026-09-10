package Operadores;

import java.util.Scanner;

public class OperadoresTernariosNumeroMayor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int max = 0;
		
		System.out.println("Ingrese un número");
		int n1 = scanner.nextInt();
		
		System.out.println("Ingrese un segundo número");
		int n2 = scanner.nextInt();
		
		System.out.println("Ingrese un tercer número");
		int n3 = scanner.nextInt();
		
		System.out.println("Ingrese un cuarto número");
		int n4 = scanner.nextInt();
		
		max = n1 > n2 ? n1 : n2;
		max = max > n3 ? max : n3;
		max = max > n4 ? max : n4;
		
		System.out.println("n = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);
		System.out.println("n4 = " + n4);
		System.out.println("El número mayor es: " + max);
		
	}

}

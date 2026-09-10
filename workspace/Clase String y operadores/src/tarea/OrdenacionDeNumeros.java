package tarea;

import java.util.Scanner;

public class OrdenacionDeNumeros {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca nº1:");
		int n1 = scanner.nextInt();
		
		System.out.println("Introduzca nº2:");
		int n2 = scanner.nextInt();
		
		String mensaje = "";
		
		String resultado = (n1 > n2) ? n1 + " y " + n2 : n2 + " y " + n1;
		
		System.out.println(resultado);
	}

}

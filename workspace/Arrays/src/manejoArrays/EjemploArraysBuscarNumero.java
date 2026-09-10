package manejoArrays;
import java.util.Scanner;

public class EjemploArraysBuscarNumero {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Ingrese un número: ");
			a[i] = scanner.nextInt();
		}
		System.out.println("\r\nIngrese un número a buscar:");
		
		int num = scanner.nextInt();
		int i = 0;
		
		/*
		while(i < a.length && a[i] != num) 
			i++;
		*/
		
		for(; i < a.length && a[i] != num; i++)
		
		if(i == a.length)
			System.out.println("Número no encontrado");
		
		else if(a[i] == num)
			System.out.println("Encontrado en la posición " + i);

	}

}

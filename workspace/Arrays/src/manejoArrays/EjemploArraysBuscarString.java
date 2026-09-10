package manejoArrays;
import java.util.Scanner;

public class EjemploArraysBuscarString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] a = new String[10];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Ingrese un nombre: ");
			a[i] = scanner.next();
		}
		System.out.println("\r\nIngrese un nombre a buscar:");
		
		String nombre = scanner.next();
		int i = 0;
		
		/*
		while(i < a.length && a[i] != num) 
			i++;
		*/
		
		for(; i < a.length && !a[i].equalsIgnoreCase(nombre); i++) {}
		
		if(i == a.length)
			System.out.println("Nombre no encontrado");
		
		else if(a[i].equalsIgnoreCase(nombre))
			System.out.println("Encontrado en la posición " + i);
		
		//También podemos usar el metodo compareTo()
		/*
		else if(a[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0)
			System.out.println("Encontrado en la posición " + i);
		*/
	}

}

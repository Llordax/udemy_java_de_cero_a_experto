package tarea;

import java.util.Scanner;

public class ProgramaManejoDeNombres {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce primer nombre");
		String nombre1 = scanner.nextLine();
		String modificacion1 = nombre1.toUpperCase().charAt(1) 
				+ "." + nombre1.substring(nombre1.length() - 2);
		
		System.out.println("Introduce segundo nombre");
		String nombre2 = scanner.nextLine();
		String modificacion2 = nombre2.toUpperCase().charAt(1) 
				+ "." + nombre2.substring(nombre2.length() - 2);
		
		System.out.println("Introduce tercer nombre");
		String nombre3 = scanner.nextLine();
		String modificacion3 = nombre3.toUpperCase().charAt(1) 
				+ "." + nombre3.substring(nombre3.length() - 2);
		
		String resultado = modificacion1 + "_" + modificacion2 + "_" + modificacion3;
		
		System.out.println(resultado);
		
	}
}

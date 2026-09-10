package tarea4;

import java.util.Scanner;

public class AppCombustible {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cantidad actual del depósito:");
		double cantidad = scanner.nextDouble();
		
		if(cantidad > 70)
			System.out.println("Has superado capacidad máxima, reinicie el programa e introduzca cantidad actual");
		
		if(cantidad == 70)
			System.out.println("Estanque lleno");
		
		if(cantidad >= 60 && cantidad < 70)
			System.out.println("Estanque casi lleno");
		
		if(cantidad >= 40 && cantidad < 60)
			System.out.println("Estanque 3/4");
		
		if(cantidad >= 35 && cantidad < 40)
			System.out.println("Medio estanque");
		
		if(cantidad >= 20 && cantidad < 35)
			System.out.println("Suficiente");
		
		if(cantidad >= 1 && cantidad < 20)
			System.out.println("Insuficiente");
		
	}
}

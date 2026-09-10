package Operadores;

import java.util.Scanner;

public class OperadoresTernarios {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String variable = 7 == 5 ? "es verdadero" : "es falso";
		System.out.println(variable);
		
		String estado = "";
		double promedio = 0;
		
		double matematicas = 0;
		double ciencias = 0;
		double historia = 0;
		
		System.out.println("Nota matemáticas");
		matematicas = scanner.nextDouble();
		
		System.out.println("Nota ciencias");
		ciencias = scanner.nextDouble();
		
		System.out.println("Nota historia");
		historia = scanner.nextDouble();
		
		promedio = (matematicas + ciencias + historia) / 3;
		
		System.out.println(promedio);
		
		estado = promedio >= 5 ? "Aprobado" : "Suspenso";
		System.out.println("estado = " + estado);
		
		/*if(promedio >= 5)
			estado = "Aprobado";
		else
			estado = "Suspenso";*/
		
		
	}

}

package switch_Case;

import java.util.Scanner;

public class IndicarNombreDelMes {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca el número del mes");
		int mes = scanner.nextInt();
		
		String nombreMes = null;
		
		switch(mes) {
			case 1:
				nombreMes = "enero";
				break;
			case 2:
				nombreMes = "febrero";
				break;
			case 3:
				nombreMes = "marzo";
				break;
			case 4:
				nombreMes = "abril";
				break;
			case 5:
				nombreMes = "mayo";
				break;
			case 6:
				nombreMes = "junio";
				break;
			case 7:
				nombreMes = "julio";
				break;
			case 8:
				nombreMes = "agosto";
				break;
			case 9:
				nombreMes = "septiembre";
				break;
			case 10:
				nombreMes = "octubre";
				break;
			case 11:
				nombreMes = "noviembre";
				break;
			case 12:
				nombreMes = "diciembre";
				break;
				
			default:
				System.out.println("Indefinido");
		}
		
		System.out.println("Nombre del mes = " + nombreMes);
		
		char num = '2';
		
		switch(num) {
			case '0':
				System.out.println("El número es 0");
				break;
				
			case '1':
				System.out.println("El número es 1");
				break;
				
			case '2':
				System.out.println("El número es 2");
				break;
				
			case '3':
				System.out.println("El número es 3");
				break;
				
			case 'a':
				System.out.println("El carácter es a");
				break;
				
			default:
				System.out.println("Incorrecto");
		}

		String nombre = "andres";
		
		switch(nombre) {
			case "admin":
				System.out.println("Hola Admin, bienvenido.");
				break;
				
			case "andres":
				System.out.println("Hola Andrés, bienvenido.");
				break;
				
			case "Eduardo":
				System.out.println("Hola Eduardo, bienvenido.");
				break;
				
			default:
				System.out.println("Usuario desconocido");
		}
		
	}

}

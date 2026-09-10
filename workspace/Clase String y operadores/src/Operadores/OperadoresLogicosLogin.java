package Operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*String[] usernames = new String[3];
		String[] passwords = new String[3];
		
		usernames[0] = "andres";
		passwords[0] = "12345";
		
		usernames[1] = "admin";
		passwords[1] = "12345";
		
		usernames[2] = "felipe";
		passwords[2] = "12345";*/
		
		String[] usernames = {"andres", "admin", "felipe"};
		String[] passwords = {"123", "1234", "12345"};
		
		System.out.println("Ingrese username");
		String u = scanner.next();
		
		System.out.println("Intrdozuca password");
		String p = scanner.next();
		
		boolean esAutenticado = false;
		
		for(int i = 0; i < usernames.length; i++) 
			if(usernames[i].equals(u) && passwords[i].equals(p)) 
				esAutenticado = true;
	
		if(esAutenticado) 
			System.out.println("Bienvenido usuario ".concat(u).concat("!"));
		else {
			System.out.println("¡Username o contraseña incorrecto!");
			System.out.println("Lo siento, requiere autenticación");
		}
	}

}

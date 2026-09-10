package switch_Case;

public class SwitchCase {

	public static void main(String[] args) {
		
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

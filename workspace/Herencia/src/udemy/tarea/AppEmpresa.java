package udemy.tarea;

import java.util.Scanner;

import udemy.tarea.domain.*;

public class AppEmpresa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce los datos del gerente en el siguiente orden:"
				+ "\n1. Nombre."
				+ "\n2. Apellido."
				+ "\n3. Número de identificación fiscal (texto)."
				+ "\n4. Dirección."
				+ "\n5. Remuneración. (formato decimal)"
				+ "\n6. Nº de identificación del empleado (formato entero)."
				+ "\n7. Prespuesto (formato decimal).");
		
		Gerente gerente = new Gerente(scanner.nextLine(), scanner.nextLine()
				, scanner.nextLine(), scanner.nextLine(), scanner.nextDouble()
				, scanner.nextInt(), scanner.nextDouble());
		
		System.out.println("¿Qué porcentaje de aumento le vamos a aplicar al empleado?");
		int porcentaje = scanner.nextInt();
		
		System.out.println("********** Imprimiendo datos del gerente antes de su aumento **********");
		System.out.println(gerente.toString());
		
		System.out.println("********** Imprimiendo sueldo del gerente después de su aumento **********");
		System.out.println("Sueldo actual: " + gerente.aumentarRemuneracion(porcentaje) + " euros.");
	
	}

}

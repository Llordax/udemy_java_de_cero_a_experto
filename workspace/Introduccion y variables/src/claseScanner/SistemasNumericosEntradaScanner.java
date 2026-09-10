package claseScanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un número entero");
		
		int numeroDecimal = 0;
		
		//usamos el bloque try-catch para capturar la excepción en el caso de que introduzcamos un valor no numérico.
		try {
			numeroDecimal = scanner.nextInt(); 
			
		}catch(InputMismatchException ex) {
			System.out.println("error, debe ingresar un n�mero entero");
			main(args); //Método recursivo porque en caso de entrar en la excepción vuelve a llamar al método main recursivamente.
			return;
			//podemos usar return ya que el método devuelve void o llamamos al método exit de la clase system.
			//System.exit(0); poner 0 en el parámetro significa que capturas la excepción y sales del bloque catch.
		}
		
		String resultadoDecimal = "n�mero decimal = " + numeroDecimal;
		
		String resultadoBinario = "n�mero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
		
		String resultadoOctal = "n�mero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
		
		String resultadoHexadecimal = "n�mero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
		
		String mensaje = resultadoDecimal;
		mensaje += "\n" + resultadoBinario;
		mensaje += "\n" + resultadoOctal;
		mensaje += "\n" + resultadoHexadecimal;
		
		System.out.println(mensaje);
	}
}

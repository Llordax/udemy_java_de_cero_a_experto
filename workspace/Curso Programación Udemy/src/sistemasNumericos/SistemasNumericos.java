package sistemasNumericos;

import javax.swing.JOptionPane;

public class SistemasNumericos {

	public static void main(String[] args) {
		
		String numeroString= JOptionPane.showInputDialog(null, "Ingrese un n�mero entero");
		
		int numeroDecimal = 0;
		
		//usamos el bloque try-catch para capturar la excepción en el caso de que introduzcamos un valor no numérico.
		try {
			numeroDecimal = Integer.parseInt(numeroString);
		
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "error, debe ingresar un n�mero entero");
			main(args); //Método recursivo porque en caso de entrar en la excepción vuelve a llamar al método main recursivamente.
			return;
			//podemos usar return ya que el método devuelve void o llamamos al método exit de la clase system.
			//System.exit(0); poner 0 en el parámetro significa que capturas la excepción y sales del bloque catch.
		}
		
		
		System.out.println(numeroDecimal);
		
		String resultadoBinario = "n�mero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
		System.out.println(resultadoBinario);
		
		int numeroBinario = 0b11110;
		
		/**
		 * Al poner el '0b' delante del número java entiende
		 * que el número está escrito en binario.
		 */
		
		System.out.println(numeroBinario);
		
		String resultadoOctal = "n�mero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
		System.out.println(resultadoOctal);
		int numeroOctal = 036;
		
		/**
		 * Al poner el '0' delante del número java entiende
		 * que el número está escrito en octal.
		 */
		
		System.out.println(numeroOctal);
		
		String resultadoHexadecimal = "n�mero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
		System.out.println(resultadoHexadecimal);
		int numeroHexadecimal = 0x1e;
		
		/**
		 * Al poner el '0x' delante del úmero java entiende
		 * que el número está escrito en hexadecimal.
		 */
		
		System.out.println(numeroHexadecimal);
		
		String mensaje = resultadoBinario;
		mensaje += "\n" + resultadoOctal;
		mensaje += "\n" + resultadoHexadecimal;
		
		JOptionPane.showMessageDialog(null, mensaje);
	
	}
}

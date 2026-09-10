package udemy.allorden.excepciones.ejemplo;

import javax.swing.JOptionPane;

public class EjemploExcepciones {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		String dividendo = JOptionPane.showInputDialog("Ingrese un dividendo");
		String divisor = JOptionPane.showInputDialog("Ingrese un divisor");
		
		try {
			
			double division2 = c.dividir(dividendo, divisor);
			System.out.println(division2);
		
		}catch(DivisionPorZeroException dpze) {
			System.out.println("Capturamos la excepción en tiempo "
					+ "de ejecución: " + dpze.getMessage());
			
			main(args);
			
		}catch (FormatoNumeroException fne) {
			System.out.println("Se detectó una excepción: ingrese "
					+ "un número válido " + fne.getMessage());
			
			fne.printStackTrace(System.out);
			
			main(args);
			
		}finally {
			System.out.println("Es opcional, pero se ejecuta siempre "
					+ "con o sin excepción");
		}
		System.out.println("Continua con el flujo de nuestra "
				+ "aplicación");
	}
	
}

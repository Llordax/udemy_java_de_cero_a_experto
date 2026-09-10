package Operadores;

import javax.swing.JOptionPane;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int i = 5, j = 4; 
		int suma = i + j;
		int resta = i - j;
		int producto = i * j;
		int division = i / j;
		float division2 = (float)i / j;
		int resto = i % j;
		
		System.out.println("i + j = " + suma); 
		System.out.println("i - j = " + resta);
		System.out.println("i * j = " + producto);
		System.out.println("i / j = " + division);
		System.out.println("i / j = " + division2);
		System.out.println("resto = " + resto);
		
		resto = 8 % 5;
		System.out.println("resto = " + resto);
		
		int numero  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
		
		if(numero % 2 == 0) 
			JOptionPane.showMessageDialog(null, "El número es par");
			
		else
			JOptionPane.showMessageDialog(null, "El número es impar");
		
	}
}

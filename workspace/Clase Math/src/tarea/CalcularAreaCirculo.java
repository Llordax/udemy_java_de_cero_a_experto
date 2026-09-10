package tarea;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalcularAreaCirculo {

	public static void main(String[] args) {
		
		//Con clase Scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Determine radio de la circunferencia");
		double radio = scanner.nextDouble();
		
		double area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("area = " + area);
		
		//Con ventana JOptionPane
		/*
		String radioStr = JOptionPane.showInputDialog("Ingrese el radio del círculo:");
		double radio = Double.parseDouble(radioStr);
		
		double area = Math.PI * Math.pow(radio, 2);
		JOptionPane.showMessageDialog(null, "area = " + area);
		*/
	}

}

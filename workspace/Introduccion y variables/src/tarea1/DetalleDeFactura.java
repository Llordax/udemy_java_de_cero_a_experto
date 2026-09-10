package tarea1;

import java.util.Scanner;

public class DetalleDeFactura {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Indique descripción de la factura");
		String descFactura = scanner.nextLine();
		
		System.out.println("Indique el primer precio");
		double precio = scanner.nextDouble();
		
		System.out.println("Indique el segundo precio");
		double precio2 = scanner.nextDouble();
		
		final double impuesto = 19;
		double totalBruto = precio + precio2;
		double totalNeto = totalBruto + ((totalBruto * impuesto)) / 100;
		
		String detalleFactura = "La factura " + descFactura + " tiene un total bruto de " 
				+ totalBruto + ", con un impuesto de " + impuesto + " y el monto " 
				+ "después de impuesto es de " + totalNeto;
		
		System.out.println(detalleFactura);
		
	}

}

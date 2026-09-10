package udemy.allorden.appfacturas;

import java.util.Scanner;

import udemy.allorden.appfacturas.domain.*;

public class EjemploFactura {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		cliente.setNif("5555-5");
		cliente.setNombre("Andrés");
		
		System.out.print("Ingrese una descripción de la factura: ");
		Factura factura = new Factura(scanner.nextLine(), cliente);
		
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			Producto producto = new Producto();
			
			System.out.print("Ingrese producto nº " + producto.getCodigo() + ": ");
			producto.setNombre(scanner.nextLine());
			
			System.out.print("Ingrese el precio: ");
			producto.setPrecio(scanner.nextFloat());
			
			System.out.print("Ingrese la cantidad: ");
			factura.addItemFactura(new ItemFactura(scanner.nextInt(), producto));
			
			System.out.println();
			scanner.nextLine();
		}
		System.out.println(factura);

	}

}

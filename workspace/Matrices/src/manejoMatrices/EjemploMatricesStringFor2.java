package manejoMatrices;

public class EjemploMatricesStringFor2 {

	public static void main(String[] args) {

		String[][] nombres = {
				{"Pepe", "Pepa"}, 
				{"Josefa", "Paco"}, 
				{"Lucas", "Pancha"}
		};
		
		System.out.println("Iterando con for: ");
		for(int i = 0; i < nombres.length; i++) {
			for(int j = 0; j < nombres[i].length; j++)
				System.out.print(nombres[i][j] + "\t");
			
			System.out.println();
		
		}
		System.out.println("Iterando con foreach: ");
		for(String[] fila : nombres) {
			for(String nombre : fila) 
				System.out.print(nombre + "\t");
			
			System.out.println();
			
		}

	}

}

package manejoArrays;
import java.util.Arrays;

public class EjemploArraysForInverso {

	public static void main(String[] args) {
		
		//String[] productos = new String[7];
		String[]productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
							"Disco Duro SSD Samsung Externo", "Asus Notebook",
							"Macbook Aitr", "Chromecast 4ta generación",
							"Bicicleta Connor"};
		
		int longitud = productos.length;
		
		/*
		productos[0] = "Kingston Pendrive 64GB";
		productos[1] = "Samsung Galaxy";
		productos[2] = "Disco Duro SSD Samsung Externo";
		productos[3] = "Asus Notebook";
		productos[4] = "Macbook Air";
		productos[5] = "Chromecast 4ta generación";
		productos[6] = "Bicicleta Connor";
		*/
		
		Arrays.sort(productos); //Para ordenar de forma alfabética
		
		System.out.println("========== Usando for ==========");
		
		for(int i = 0; i < longitud; i++)
			System.out.println("Para índice " + i + ": " + productos[i]);
		
		System.out.println("========== Usando for inverso ==========");
		
		for(int i = 0; i < longitud; i++) 
			System.out.println("para i = " + (longitud - 1 - i) + " valor: " + productos[longitud - 1 - i]);
		
		System.out.println("========== Usando for inverso2 ==========");
		
		for(int i = longitud - 1; i >= 0; i--) 
			System.out.println("para i = " + i + " valor: " + productos[i]);
		
		
	}

}

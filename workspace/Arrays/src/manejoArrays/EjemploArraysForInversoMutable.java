package manejoArrays;
import java.util.Arrays;
import java.util.Collections;

public class EjemploArraysForInversoMutable {
	
	public static void arrayInverso(String[] array) {
		
		int longitud2 = array.length;
		int longitud = array.length;
		
		for(int i = 0; i < longitud2; i++) { 
			String actual = array[i];
			String inverso = array[longitud - 1 - i];
			array[i] = inverso;
			array[longitud - 1 - i] = actual;
			longitud--;
		}
	}
	
	public static void main(String[] args) {
		
		//String[] productos = new String[7];
		String[]productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
							"Disco Duro SSD Samsung Externo", "Asus Notebook",
							"Macbook Air", "Chromecast 4ta generación",
							"Bicicleta Connor"};
				
		int longitud = productos.length;
				
		Arrays.sort(productos); //Para ordenar de forma alfabética
		
		arrayInverso(productos);
		
		//Collections.reverse(Arrays.asList(productos));
		
		System.out.println("========== Usando for ==========");
				
		for(int i = 0; i < longitud; i++)
			System.out.println("Para índice " + i + ": " + productos[i]);
				
		/**
		 *Se divide entre dos para que a la mitad deje de invertir 
		 *ya que sino revierte lo invertido y no hace nada.
		 */
		
		//int longitud2 = productos.length;
		
		/*
		for(int i = 0; i < longitud2 / 2; i++) { 
			String actual = productos[i];
			String inverso = productos[longitud - 1 - i];
			productos[i] = inverso;
			productos[longitud - 1 - i] = actual;
			longitud2--;
		}
		*/
		
		

	}

}

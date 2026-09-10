package manejoArrays;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArraysOrdenamientoBurbuja {

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
		
		public static void sortBurbuja(Object[] array) {
			
			int longitud = array.length;
			int cont = 0;
			
			for(int i = 0; i < longitud - 1; i++) {
				for(int j = 0; j < longitud - 1 - i; j++) {
					if(((Comparable)array[j + 1]).compareTo(array[j]) < 0) {
						Object aux = array[j];
						array[j] = array[j + 1];
						array[j + 1] = aux;
					}
					cont++;
				}
			}
			System.out.println("cont = "+ cont);
		}
		
		public static void sortBurbujaInverso(Object[] array) {
			
			int longitud = array.length;
			int cont = 0;
			
			for(int i = 0; i < longitud - 1; i++) {
				for(int j = 0; j < longitud - 1 - i; j++) {
					if(((Comparable)array[j + 1]).compareTo(array[j]) > 0) {
						Object aux = array[j];
						array[j] = array[j + 1];
						array[j + 1] = aux;
					}
					cont++;
				}
			}
			System.out.println("cont = "+ cont);
		}
		
		public static void main(String[] args) {
				
			//String[] productos = new String[7];
			String[]productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
								"Disco Duro SSD Samsung Externo", "Asus Notebook",
								"Macbook Air", "Chromecast 4ta generación",
								"Bicicleta Connor"};
						
			int longitud = productos.length;
			
			sortBurbuja(productos);
			
			//int cont = 0;
			
			//Algoritmo Burbuja
			/*
			for(int i = 0; i < longitud; i++) {
				for(int j = 0; j < longitud; j++) {
					if(productos[i].compareTo(productos[j]) < 0) {
						String aux = productos[i];
						productos[i] = productos[j];
						productos[j] = aux;
					}
					cont++;
				}
			}
			*/
			
			//Algoritmo Burbuja optimizado
			/*
			for(int i = 0; i < longitud - 1; i++) {
				for(int j = 0; j < longitud - 1 - i; j++) {
					if(productos[j + 1].compareTo(productos[j]) < 0) {
						String aux = productos[j];
						productos[j] = productos[j + 1];
						productos[j + 1] = aux;
					}
					cont++;
				}
			}
			System.out.println("cont = " + cont);
			*/
			
			
			//Arrays.sort(productos); //Para ordenar de forma alfabética
				
			//arrayInverso(productos);
				
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
			
			Integer[] numeros = new Integer[4];
			
			numeros[0] = 10;
			numeros[1] = Integer.valueOf("7");
			numeros[2] = 35;
			numeros[3] = -1;
			
			sortBurbuja(numeros);
			
			for(int i = 0; i < numeros.length; i++)
				System.out.println("i = " + i + ": " + numeros[i]);
	}

}

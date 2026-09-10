package manejoArrays;
import java.util.Arrays;

public class EjemploArraysFor {

	public static void main(String[] args) {
		
		String[] productos = new String[7];
		
		int longitud = productos.length;
		
		productos[0] = "Kingston Pendrive 64GB";
		productos[1] = "Samsung Galaxy";
		productos[2] = "Disco Duro SSD Samsung Externo";
		productos[3] = "Asus Notebook";
		productos[4] = "Macbook Ait";
		productos[5] = "Chromecast 4ta generación";
		productos[6] = "Bicicleta Connor";
		
		Arrays.sort(productos); //Para ordenar de forma alfabética
		
		System.out.println("========== Usando for ==========");
		
		for(int i = 0; i < longitud; i++)
			System.out.println("Para índice " + i + ": " + productos[i]);
		
		System.out.println("========== Usando foreach ==========");
		
		for(String prod : productos)
			System.out.println("prod = " + prod);
		
		System.out.println("========== Usando while ==========");
		
		int cont = 0;
		
		while(cont < longitud) {
			System.out.println("Para índice " + cont + ": " + productos[cont]);
			cont++;
		}

		System.out.println("========== Usando do while ==========");
		
		int cont2 = 0;
		
		do {
			System.out.println("Para índice " + cont2 + ": " + productos[cont2]);
			cont2++;
		
		}while(cont2 < longitud);
		
		
		int[] numeros = new int[10];
		
		int longitud2 = numeros.length;
		
		for(int j = 0; j < longitud2; j++)
			numeros[j] = j * 3;
		
		for(int j = 0; j < longitud2; j++)
			System.out.println("numeros = " + numeros[j]);

	}

}

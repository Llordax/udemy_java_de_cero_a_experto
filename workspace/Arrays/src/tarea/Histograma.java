package tarea;

import java.util.Scanner;

public class Histograma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
		int[] array = new int[12];
        int lengthInt = array.length;

        //Introducimos los elementos del array
        for (int i = 0; i < lengthInt; i++) {
            System.out.println("Ingrese un numero de 1 a 6: ");
            array[i] = scan.nextInt();
        }
        
        /**
         * Creamos un segundo aray de lngitud 6 y 
         * Por cada número del 1 al 6 contiene su 
         * histograma con la representación gráfica
         * de las veces qsue se repite cada número
         * en el aray principal. 
         */
        String[] arrayHistograma = new String[6];
        int lengthString = arrayHistograma.length;
        
        //Rellenamos este segundo array con el histograma
        for (int i = 0; i < lengthString; i++) {
            int aux = i + 1;
            String histograma = aux + ": ";
            for (int j = 0; j < lengthInt; j++) 
                if (aux == array[j]) 
                    histograma += "*";
              
            arrayHistograma[i] = histograma;
        }

        for (int i = 0; i < lengthString; i++) 
            System.out.println(arrayHistograma[i]);

	}

}

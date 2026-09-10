package tarea;

import java.util.Scanner;

public class MultiplicacionSinOperadorMultiplicar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Primer factor: ");
        int factor1 = scanner.nextInt();
        
        System.out.println("Segundo factor: ");
        int factor2 = scanner.nextInt();
        
        int resultado = 0;
       
        /**
         * Primero tenemos que comprobar los signos
         * de ambos factores
         */
        boolean positivoFactor2 = factor2 > -1;
        boolean positivoFactor1 = factor1 > -1;
        
        /**
         * Después sacamos el valor absoluto de factor1
         */
        int absolutoFactor1 = positivoFactor1? factor1: -factor1; // equivalente a Math.abs(factor1);
        
        /**
         * Luego sumamos tantas veces el valor de factor2
         * según el valor del factor 1
         */
        for(int i = 0; i < absolutoFactor1; i++){
            resultado = resultado + factor2;    
        }
        
       /**
        * Si ambos valores de los factores son negativos
        * o si solo factor1 es negativo revertimos el signo.
        */
        if((!positivoFactor1 && !positivoFactor2) || !positivoFactor1){
            resultado = -resultado;
        }

        System.out.println("resultado = " + resultado);
		
	}

}

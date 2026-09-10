package tarea;

import java.util.Scanner;

public class ListadoNotas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double[] notas = new double[3];
		int longitud = notas.length;
		
		double contNotasMayorA5 = 0;
		double contNotasMenorA4 = 0;
		double contNotasIgualA1 = 0;
		
		double sumaMayorA5 = 0;
		double sumaMenorA4 = 0;
		double sumaIgualA1 = 0;
		
		
		double promedioMayorA5 = 0;
		double promedioMenorA4 = 0;
		double promedioIgualA1 = 0;
		double promedioTotal = 0;
		
		boolean error = false;
		
		for(int i = 0; i < longitud; i++) {
			System.out.println("Nota " + (i +1) + " (de 1 a 7):");
			notas[i] = scanner.nextDouble();
			
			if(notas[i] == 0) { 
				error = true;
				break;
			}	
			if(notas[i] == 1) {
				contNotasIgualA1++;
				sumaIgualA1 += notas[i];
				promedioIgualA1 = (sumaIgualA1 / longitud) * 100;
				
			}
			
			if(notas[i] < 4) {
				contNotasMenorA4++;
				sumaMenorA4 += notas[i];
				promedioMenorA4 = (sumaMenorA4 / longitud) * 100;
			
			}
			
			if(notas[i] > 5) {
				contNotasMayorA5++;
				sumaMayorA5 += notas[i];
				promedioMayorA5 = (sumaMayorA5 / longitud) * 100;
			}
			
			promedioTotal = (promedioIgualA1 + promedioMenorA4 + promedioMayorA5);
	
		}
		
		if(error)
			System.out.println("Error, finalizando programa");
		
		System.out.println("Promedio notas mayores a 5: " + promedioMayorA5 + "%" + "\n" + 
					"Promedio notas menores a 4: " + promedioMenorA4 + "%" + "\n" +  
					"Cantidad de notas iguales a 1: " + contNotasIgualA1);
		
		System.out.println("El promedio total: " + promedioTotal);
		
		
	}
	
}

package udemy.allorden.hilos.ejemplos;

import udemy.allorden.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
	
	public static void main(String[] args) {
		
		new Thread(new ViajeTarea("New York")).start();
		new Thread(new ViajeTarea("Praga")).start();
		new Thread(new ViajeTarea("Madrid")).start();
		new Thread(new ViajeTarea("Tokyo")).start();
	}
}

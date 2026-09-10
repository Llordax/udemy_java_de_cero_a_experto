package udemy.allorden.hilos.ejemplos;

import udemy.allorden.hilos.threads.NombreThread;

public class EjemploExtenderThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread hilo = new NombreThread("John Doe");
		hilo.start();
		//Thread.sleep(10);
		
		Thread hilo2 = new NombreThread("María López");
		hilo2.start();
		
		Thread hilo3 = new NombreThread("Pepe Lotudo");
		hilo3.start();
		
		System.out.println(hilo.getState());
	}

}

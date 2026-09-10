package udemy.allorden.hilos.ejemplosync;

import udemy.allorden.hilos.ejemplosync.runnable.Consumidor;
import udemy.allorden.hilos.ejemplosync.runnable.Panadero;

public class EjemploProductorConsumidor {

	public static void main(String[] args) {
		
		Panaderia p = new Panaderia();
		
		new Thread(new Panadero(p)).start();
		new Thread(new Consumidor(p)).start();
		
	}
}

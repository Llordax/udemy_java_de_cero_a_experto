package udemy.allorden.hilos.ejemplosync;

import java.util.concurrent.ThreadLocalRandom;

import udemy.allorden.hilos.ejemplosync.runnable.Consumidor;
import udemy.allorden.hilos.ejemplosync.runnable.Panadero;

public class EjemploProductorConsumidorFuncional {

	public static void main(String[] args) {
		
		Panaderia p = new Panaderia();
		
		new Thread(() -> {
			for(int i = 0; i < 10; i++) {
				p.hornear("Pan nº: " + i);
				
				try {
					Thread.sleep(ThreadLocalRandom.current().nextInt(500,2000));
				
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		
		new Thread(() -> {
			for(int i = 0; i < 10; i++) {
				p.consumir();
			}
		}).start();
		
	}
}

package udemy.allorden.hilos.ejemplosync.runnable;

import java.util.concurrent.ThreadLocalRandom;

import udemy.allorden.hilos.ejemplosync.Panaderia;

public class Panadero implements Runnable {
	
	private Panaderia panaderia;
	
	public Panadero(Panaderia panaderia) {
		this.panaderia = panaderia;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			panaderia.hornear("Pan nº: " + i);
			
			try {
				Thread.sleep(ThreadLocalRandom.current().nextInt(500,2000));
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} 

}

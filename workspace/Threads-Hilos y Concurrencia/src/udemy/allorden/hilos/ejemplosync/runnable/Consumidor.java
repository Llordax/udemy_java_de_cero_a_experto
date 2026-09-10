package udemy.allorden.hilos.ejemplosync.runnable;

import udemy.allorden.hilos.ejemplosync.Panaderia;

public class Consumidor implements Runnable {
	
	private Panaderia panaderia;
	
	public Consumidor(Panaderia panaderia) {
		this.panaderia = panaderia;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			panaderia.consumir();
		}
	}

}

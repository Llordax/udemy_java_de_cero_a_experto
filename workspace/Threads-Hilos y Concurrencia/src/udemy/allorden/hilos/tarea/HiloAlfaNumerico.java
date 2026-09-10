package udemy.allorden.hilos.tarea;

import java.util.concurrent.TimeUnit;

public class HiloAlfaNumerico implements Runnable {

	private Tipo tipo;
	
	public HiloAlfaNumerico(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public void run() {
		try {
			if(tipo == Tipo.NUMERO) 
				for(int i = 1; i < 10; i++) {
					System.out.println(i);
					Thread.sleep(500);
                }
		
			else 
				for (char c = 'A'; c <= 'Z'; c++) {
					System.out.println(c); 
					Thread.sleep(500);
				}
			
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
	}

}

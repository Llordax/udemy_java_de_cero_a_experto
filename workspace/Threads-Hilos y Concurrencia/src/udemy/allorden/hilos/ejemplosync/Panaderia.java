package udemy.allorden.hilos.ejemplosync;

public class Panaderia {
	
	private String pan;
	private boolean disponible;
	
	public synchronized void hornear(String masa) {
		while(disponible) {
			
			try {
				wait();
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		pan = masa;
		System.out.println("Panadero hornea: " + pan);
		disponible = true;
		notify();
	}
	
	public synchronized String consumir() {
		while(!disponible) {
			
			try {
				wait();
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Cliente consume: " + pan);
		disponible = false;
		notify();
		
		return pan;
	}
	

}

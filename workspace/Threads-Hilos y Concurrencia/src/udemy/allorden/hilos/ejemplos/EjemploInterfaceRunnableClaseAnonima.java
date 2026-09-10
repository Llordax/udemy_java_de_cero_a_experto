package udemy.allorden.hilos.ejemplos;

public class EjemploInterfaceRunnableClaseAnonima {
	
	public static void main(String[] args) {
		
		Runnable viaje = new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println(i + " - " + Thread.currentThread().getName());
					
					try {
						Thread.sleep((long)(Math.random() * 1000));
					
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Finalmente me voy de viaje a: " + Thread.currentThread().getName());
				
			}
		};
		
		new Thread(viaje, "New York").start();
		new Thread(viaje, "Praga").start();
		new Thread(viaje, "Madrid").start();
		new Thread(viaje, "Tokyo").start();
	}
}

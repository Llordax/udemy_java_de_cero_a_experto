package udemy.allorden.hilos.ejemplos.executor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploScheduledExecutorServicePeriodo {

	public static void main(String[] args) throws InterruptedException {
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
		
		System.out.println("Alguna tarea en el main ...");
		
		AtomicInteger cont = new AtomicInteger(5);
		//CountDownLatch lock = new CountDownLatch(5);
		
		Future<?> future = executor.scheduleAtFixedRate(() -> {
			System.out.println("Hola mundo tarea ...");
			
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
				//lock.countDown();
				cont.getAndDecrement();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}, 1000, 2000, TimeUnit.MILLISECONDS);
		
		//lock.await();
		//future.cancel(true);
		//TimeUnit.SECONDS.sleep(10);
		while(cont.get() >= 0) {
			if(cont.get() == 0) {
				future.cancel(true);
				cont.getAndDecrement();
			}
		}
		
		System.out.println("Alguna otra tarea en el main ...");
		executor.shutdown();
	}

}

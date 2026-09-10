package udemy.allorden.hilos.ejemplos.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class EjemploExecutorFuture {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		Runnable tarea = () -> {
			System.out.println("Inicio de la tarea ...");
			
			try {
				System.out.println("Nombre del thread " + Thread.currentThread().getName());
				TimeUnit.SECONDS.sleep(3);
			
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
			
			System.out.println("Finaliza la tarea ...");
		};
		
		Future<?> resultado = executor.submit(tarea);
		executor.shutdown();
		System.out.println("Continuando con la ejecución del main 1");
		
		/*
		System.out.println(resultado.isDone());
		System.out.println(resultado.get(5, TimeUnit.SECONDS));
		System.out.println(resultado.isDone());
		*/
		
		while(!resultado.isDone()) {
			System.out.println("ejecutando tarea ...");
			TimeUnit.MILLISECONDS.sleep(1500);
		}
		
		System.out.println("Obtenemos resultado de la tarea: " + resultado.get(5, TimeUnit.SECONDS));
		System.out.println("Finaliza la tarea: " + resultado.isDone());
	}

}

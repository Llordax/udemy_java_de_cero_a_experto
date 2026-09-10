package udemy.allorden.hilos.ejemplos.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import udemy.allorden.hilos.ejemplosync.Panaderia;
import udemy.allorden.hilos.ejemplosync.runnable.Consumidor;
import udemy.allorden.hilos.ejemplosync.runnable.Panadero;

public class EjemploExecutorFutureCallable4 {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);
		
		System.out.println("Tamaño del pool: " + executor.getPoolSize());
		System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());
		
		Panaderia p = new Panaderia();
		
		Runnable productor = new Panadero(p);
		Runnable consumidor = new Consumidor(p);
		
		Future<?> futuro = executor.submit(productor);
		Future<?> futuro2 = executor.submit(consumidor);
		
		System.out.println("Tamaño del pool: " + executor.getPoolSize());
		System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());
		
		executor.shutdown();
		System.out.println("Continuando con la ejecución del main 1");
		
		
	}

}

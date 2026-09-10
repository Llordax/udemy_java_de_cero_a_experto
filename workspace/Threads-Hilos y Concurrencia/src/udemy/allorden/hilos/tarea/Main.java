package udemy.allorden.hilos.tarea;

public class Main {
	
	public static void main(String[] args) {
		Thread threadNumero = new Thread(new HiloAlfaNumerico(Tipo.NUMERO));
        Thread threadLetra = new Thread(new HiloAlfaNumerico(Tipo.LETRA));

        threadNumero.start();
        threadLetra.start();
	}

}

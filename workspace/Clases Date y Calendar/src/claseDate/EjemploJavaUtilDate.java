package claseDate;

import java.util.Date;
import java.text.SimpleDateFormat;

public class EjemploJavaUtilDate {

	public static void main(String[] args) {
		
		Date fecha = new Date();
		
		System.out.println("fecha = " + fecha);
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String fechaString = df.format(fecha);
		
		long j = 0;
		for(int i = 0; i < 10000000; i++)
			j += i;
		
		Date fecha2 = new Date();
		long tiempoFinal = fecha2.getTime() - fecha.getTime();
		
		System.out.println("Tiempo transcurrido en el for = " + tiempoFinal + " ms.");
		
		System.out.println("j = " + j);
		
		System.out.println("fechaString = " + fechaString);
	}

}

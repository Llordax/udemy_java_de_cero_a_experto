package udemy.allorden.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
	
	public static void main(String[] args) {
		
		LocalDateTime fechaTiempo = LocalDateTime.now();
		System.out.println(fechaTiempo);
		
		fechaTiempo = LocalDateTime.of(2020, Month.DECEMBER, 24, 20, 45, 59);
		System.out.println("fechaTiempo = " + fechaTiempo);
		
		fechaTiempo = LocalDateTime.parse("2023-11-20T15:54:41.728987");
		System.out.println(fechaTiempo);
		
		LocalDateTime fechaTiempo2 = fechaTiempo.plusDays(1).plusHours(3);
		System.out.println("fechaTiempo2 = " + fechaTiempo2);
		System.out.println("fechaTiempo = " + fechaTiempo);
		System.out.println("fechaTiempo3 = " + fechaTiempo.minusHours(5));
		
		Month mes = fechaTiempo.getMonth();
		System.out.println("mes = " + mes);
		
		int dia = fechaTiempo.getDayOfMonth();
		System.out.println("dia = " + dia);
		
		int anio = fechaTiempo.getYear();
		System.out.println("anio = " + anio);
		
		String formato1 = fechaTiempo.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("formato1 = " + formato1);
		
		String formato2 = fechaTiempo.format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a"));
		System.out.println("formato2 = " + formato2);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
		String formato2Format = fechaTiempo.format(df);
		System.out.println("formato2 = " + formato2Format);
		
		String formato3 = df.format(fechaTiempo);
		System.out.println("formato3 = " + formato3);
	}
}

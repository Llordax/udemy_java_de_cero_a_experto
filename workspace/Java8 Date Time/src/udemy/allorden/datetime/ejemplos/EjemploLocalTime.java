package udemy.allorden.datetime.ejemplos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {
	
	public static void main(String[] args) {
		
		LocalTime ahora = LocalTime.now();
		System.out.println(ahora);
		System.out.println("Hora: " + ahora.getHour());
		System.out.println("Minutos: " + ahora.getMinute());
		System.out.println("Seg: " + ahora.getSecond());
		
		LocalTime seisConTreinta = LocalTime.of(6, 30);
		System.out.println(seisConTreinta);
		seisConTreinta = LocalTime.parse("18:30");
		
		System.out.println("seisConTreinta = " + seisConTreinta);
		LocalTime sieteConTreinta = LocalTime.of(6, 30).plus(1, ChronoUnit.HOURS);
		System.out.println("sieteConTreinta = " + sieteConTreinta);
		
		boolean esAnterior = LocalTime.of(6, 30).isBefore(LocalTime.parse("07:30"));
		System.out.println("esAnterior = " + esAnterior);
		
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
		String ahoraFormat = ahora.format(df);
		System.out.println(ahoraFormat);
		
		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("hh:mm:ss a");
		String seisConTreintaFormat = seisConTreinta.format(df2);
		System.out.println(seisConTreintaFormat);
		
		ahoraFormat = df.format(ahora);
		System.out.println(ahoraFormat);
		
		LocalTime max = LocalTime.MAX;
		LocalTime min = LocalTime.MIN;
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}

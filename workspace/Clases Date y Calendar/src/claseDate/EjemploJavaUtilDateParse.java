package claseDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Ingrese una fecha con formato 'dd/MM/yyyy'");
		
		try {
			Date fecha = format.parse(scanner.next());
			System.out.println("fecha = " + fecha);
			System.out.println("format = " + format.format(fecha));
		
			Date fecha2 = new Date();
			System.out.println("fecha2 = " + fecha2);
			
			if(fecha.after(fecha2))
				System.out.println("fecha del usuario es después que fecha2");
			
			else if(fecha.before(fecha2))
				System.out.println("fecha del usuario es anterior que fecha2");
			
			else if(fecha.equals(fecha2))
				System.out.println("fecha es igual a Fecha2");
			
			//También se puede hacer con el método compareTo() para comparar las fechas
			
			if(fecha.compareTo(fecha2) > 0)
				System.out.println("fecha del usuario es después que fecha2");
			
			else if(fecha.compareTo(fecha2) < 0)
				System.out.println("fecha del usuario es anterior que fecha2");
			
			else if(fecha.compareTo(fecha2) == 0)
				System.out.println("fecha es igual a Fecha2");
			
		} catch (ParseException ex) {
			//ex.printStackTrace();
			System.err.println("La fecha tiene un formato incorrecto: " + ex.getMessage());
			System.err.println("El formato debe ser 'dd/MM/yyyy'");
			//System.exit(1);
			main(args);
			
		}

	}

}

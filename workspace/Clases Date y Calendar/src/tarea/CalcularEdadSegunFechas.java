package tarea;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.DateFormat;

public class CalcularEdadSegunFechas {

	public static void main(String[] args) throws ParseException  {
	
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Ingrese un fecha de nacimiento con formato yyyy/MM/dd:");
        String fechaString = scanner.next();

        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = formato.parse(fechaString);
        Date actual = new Date();

        // creamos un patron de fecha numérico con el año mes y día
        formato = new SimpleDateFormat("yyyyMMdd");

        // luego convertimos ambas fechas la actual y la fecha de nacimiento
        // en enteros que contiene el año mes y día
        int desde = Integer.parseInt(formato.format(fechaNacimiento));
        int hasta = Integer.parseInt(formato.format(actual));
        
        // luego restamos ambas fechas y dividimos en 10000 para quitar decimales y 
        // dejar la fecha en decenas o centenas
        int edad = (hasta - desde) / 10000;
        
        System.out.println("La edad es: " + edad);
        
        System.out.println();
        
        System.out.println(hasta);
        System.out.println(desde);
        System.out.println(hasta - desde); 
	}

}

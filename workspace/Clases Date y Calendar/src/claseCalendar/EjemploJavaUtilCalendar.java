package claseCalendar;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class EjemploJavaUtilCalendar {

	public static void main(String[] args) {
		
		/**
		 * La clase Calendar es abstracta por lo que
		 * no se puede instanciar un objeto de esta clase
		 * con la palabra reservada 'new' sino que se ha
		 * de invocar al método estático get.Instance()
		 * el cual por dentro crea a su vez una instancia
		 * de GregorianCalendar.
		 */
		
		Calendar calendario = Calendar.getInstance();
		//calendario.set(2023, 11, 25, 18, 20, 10);
		/*calendario.set(Calendar.YEAR, 2023);
		calendario.set(Calendar.MONTH, Calendar.JULY);
		calendario.set(Calendar.DAY_OF_MONTH, 25);
		calendario.set(Calendar.HOUR_OF_DAY, 21);*/
		calendario.set(Calendar.HOUR, 7);
		calendario.set(Calendar.AM_PM, Calendar.PM);
		calendario.set(Calendar.MINUTE, 20);
		calendario.set(Calendar.SECOND, 10);
		calendario.set(Calendar.MILLISECOND, 125);
		
		Date fecha = calendario.getTime();
		System.out.println("Fecha sin formato = " + fecha);
		
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss:SSS a");
		String fechaConFormato = formato.format(fecha);
		System.out.println("Fecha con formato = " + fechaConFormato);
	
		Calendar calendarioActual = Calendar.getInstance();
		Date fecha2 = calendarioActual.getTime();
		
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
		
	}

}

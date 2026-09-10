package conversionDeTipos;

public class ConversionDeTipos {
	
	public static void main(String[] args) {
		
		String numeroString = "58";
		int numeroInt = Integer.parseInt(numeroString);
		System.out.println(numeroInt);
		
		String realString = "98765.43";
		double realDouble = Double.parseDouble(realString);
		System.out.println(realDouble);
		
		String logicoString = "true";
		boolean logicoBoolean = Boolean.parseBoolean(logicoString);
		System.out.println(logicoBoolean);
		
		int otroNumeroInt = 100;
		System.out.println(otroNumeroInt);
		
		String otroNumeroString = Integer.toString(otroNumeroInt);
		System.out.println(otroNumeroString);
		
		otroNumeroString = String.valueOf(otroNumeroInt + 10);
		System.out.println(otroNumeroString);
		
		double otroRealDouble = 1.23456;
		String otroRealString = Double.toString(otroRealDouble);
		System.out.println(otroRealString);
		
		otroRealString = String.valueOf(1.23456f);
		System.out.println(otroRealString);
		
		int i = 10000;
		short s = (short)i;
		/**
		 * Cuando convertir una variable a otra supone perder información
		 * ya que en este caso el entero introducido es deamasiado grande 
		 * como para convertirlo a short el único método es forzar esa
		 * conversión aunque se pierdan datos. Eso se hace con un casting.
		 */
		
		System.out.println(s);
		
		int j = 10000;
		long l = j;
		/**
		 * En este caso no te obliga a realizarle un casting a la variable
		 * j ya que el dato long si que guarda el número int introducido.
		 */
		
		System.out.println(l);
		
		System.out.println(Short.MAX_VALUE);
		
		char b = (char) i;
		System.out.println(b);
		
		float f = (float) i;
		System.out.println(f);
		
	}

}

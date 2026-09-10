package datosPrimitivos;

public class PrimitivosEnteros {
	
	public static void main(String[] args) {
		
		byte numeroByte = 127;
		
		System.out.println(numeroByte);
		System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
		System.out.println("tipo byte corresponde en bits a " + Byte.SIZE);
		System.out.println("valor máximo de un byte: " + Byte.MAX_VALUE);
		System.out.println("valor mínimo de un byte: " + Byte.MIN_VALUE);
	
		System.out.println();
		
		short numeroShort = 30000;
		
		System.out.println(numeroShort);
		System.out.println("tipo short corresponde en byte a " + Short.BYTES);
		System.out.println("tipo short corresponde en bits a " + Short.SIZE);
		System.out.println("valor máximo de un short: " + Short.MAX_VALUE);
		System.out.println("valor mínimo de un short: " + Short.MIN_VALUE);
	
		System.out.println();
		
		int numeroInt = 32768;
		
		System.out.println(numeroShort);
		System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
		System.out.println("tipo int corresponde en bits a " + Integer.SIZE);
		System.out.println("valor máximo de un int: " + Integer.MAX_VALUE);
		System.out.println("valor mínimo de un int: " + Integer.MIN_VALUE);
		
		System.out.println();
		
		long numeroLong = 2147483648L;
		
		System.out.println(numeroShort);
		System.out.println("tipo long corresponde en byte a " + Long.BYTES);
		System.out.println("tipo long corresponde en bits a " + Long.SIZE);
		System.out.println("valor máximo de un long: " + Long.MAX_VALUE);
		System.out.println("valor mínimo de un long: " + Long.MIN_VALUE);
	
		System.out.println();
		
		var numeroVar = 127; 
		
		/**
		 * Si el valor de var es numérico toma por defecto el entero (Integer)
		 * excepto si nos salimos de su rango por lo tanto habrá que indicarlo
		 * en la variable. Por ejemplo:
		 * 
		 * var numeroVar = 9223372036854775807L
		 */
		
	}

}

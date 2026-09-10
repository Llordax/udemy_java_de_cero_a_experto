package datosPrimitivos;

public class PrimitivosCaracteres {
	
	public static void main(String[] args) {
		
		char caracter = '\u0040'; //por Unicode
		char simbolo = '@'; //caracter
		char decimal = 64; //por caracter decimal
		
		var caracter2 = '\u0040';
		
		System.out.println(caracter);
		System.out.println(simbolo);
		System.out.println(decimal);
		System.out.println(caracter == decimal);
		System.out.println(caracter == simbolo);
		System.out.println(decimal == caracter2);
		
		char espacio = ' '; // char espacio = '\u0020';
		
		char retroceso = '\b'; //Retrocede un caracter a la izquierda.
		char tabulador = '\t'; //Hace una tabulación.
		char nuevaLinea = '\n'; //Hace un salto de línea.
		char retornoCarro = '\r'; //Parecido al \n pero depende del Sistema Operativo.
		
		System.out.println("char corresponde en \t byte a " + System.getProperty("line.separator") + Character.BYTES);
		System.out.println("char corresponde en bits a " + Character.SIZE);
		System.out.println("valor máximo en char: " + Character.MAX_VALUE);
		System.out.println("valor mínimo en char " + Character.MIN_VALUE);
	
	}

}

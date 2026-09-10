package claseString;

public class EjemploStringMetodosArrays {
	
	public static void main(String[] args) {
		
		String trabalenguas = "trabalenguas";
		System.out.println(trabalenguas.length());
		System.out.println(trabalenguas.toCharArray());
		
		char[] array = trabalenguas.toCharArray();
		int largo = array.length;
		
		System.out.println(largo);
		
		for(int i = 0; i < largo; i++) 
			System.out.print(array[i]);
		
		System.out.println();
		System.out.println(trabalenguas.split("a"));
		
		String[] array2 = trabalenguas.split("a");
		int largo2 = array2.length;
		
		for(int j = 0; j < largo2; j++)
			System.out.println(array2[j]);
		
		String archivo = "alguna.imagen.pdf";
		String[] archivoArray = archivo.split("\\.");
		/**
		 * Hay que poner \\ antes del . porque en este método
		 * el . no lo entiende como carácter sino como expresión
		 * regular por lo que con la \\ java ya si que entiende 
		 * que es el carácter. También en lugar de usar \\ se
		 * puede usar [].
		 */
		
		largo2 = archivoArray.length;
		
		for(int j = 0; j < largo2; j++)
			System.out.println(archivoArray[j]);
		
		System.out.println(archivoArray[largo2 - 1]);
		
	}

}

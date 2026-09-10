package claseString;

public class EjemploStringConcatenacion {
	
	public static void main(String[] args) {
		
		String curso = "Programación Java";
		String profesor = "Andrés Guzmán";
		
		String detalle = curso + " con el instructor " + profesor;
	
		System.out.println(detalle);
		
		int numeroA = 10;
		int numeroB = 5;
		
		System.out.println(detalle + " " + (numeroA + numeroB));
		System.out.println(numeroA + numeroB + " " + detalle);
		
		String detalle2 = curso.concat(" con ").concat(profesor);
		System.out.println(detalle2);
		
		/**
		 * El método concat() es mas eficiente que usar el operador
		 * de suma para concatenar ya que si usamos el operador suma
		 * en el background se crea una instancia del StringBuilder que 
		 * permite concatenar pero se utiliza más espacio en memoria RAM.
		 */
	}

}

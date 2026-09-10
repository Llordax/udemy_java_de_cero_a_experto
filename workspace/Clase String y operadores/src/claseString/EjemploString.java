package claseString;

public class EjemploString {

	public static void main(String[] args) {
		
		String curso = "Programación Java"; //Creación del objeto String de la forma recomendable.
		String curso2 = new String("Programación Java");
		
		boolean esIgual = curso == curso2; //comparamos por objeto para ver si son el mismo objeto
		System.out.println(esIgual);
		
		/**
		 * En este caso curso no es igual a curso2 porque
		 * tanto curso como curso2 se han creado de manera
		 * distinta.
		 */
		
		esIgual = curso.equals(curso2); //comparamos por valor para ver si ambos tienen el mismo contenido.
		System.out.println(esIgual);
		
		String curso3 = "Programación Java";
		esIgual = curso == curso3;
		System.out.println(esIgual);
		
		/**
		 * Aquí si que son iguales por objeto porque tanto 
		 * curso como curso3 se han creado de la misma forma.
		 */

	}

}

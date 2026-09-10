package claseString;

public class EjemploStringValidar {
	
	public static void main(String[] args) {
		
		String curso = null;
		
		boolean esNulo = curso == null;
		
		System.out.println(esNulo);
		
		if(esNulo) 
			curso = " "; //"Programación Java";
		
		boolean esVacio = curso.length() == 0;
		System.out.println(esVacio);
		
		boolean esVacio2 = curso.isEmpty();
		System.out.println(esVacio2);
		
		boolean esBlanco = curso.isBlank();
		
		/*if(!esVacio2) {
			System.out.println("Bienvenido al curso ".concat(curso));
			System.out.println(curso.toUpperCase());
		}*/
		
		if(!esBlanco) {
			System.out.println("Bienvenido al curso ".concat(curso));
			System.out.println(curso.toUpperCase());
		}
		
	}
}

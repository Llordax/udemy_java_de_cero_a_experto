package holaMundo;

public class HolaMundo {
	
	public static void main(String[] args) {
		
		String saludar = "Hola mundo desde Java";
		System.out.println(saludar);
		System.out.println(saludar.toUpperCase()); // para cambiar todo a mayúscula
	
		int numero = 11;
		boolean valor = true;
		int numero2 = 5;
		
		if(valor) {
			System.out.println(numero);
			numero2 = 8;
		}
		
		System.out.println(numero2);
		
		var numero3 = "15"; 
		
		/**
		 *var es una variable dinámica es decir en función
		 *de la igual que le demos java asigna el tipo de dato
		 *a la variable.
		 */
		
		String nombre;
		nombre = "Diego";
		
		if(numero > 10)
			nombre = "Juan";
		
		System.out.println(nombre);
		
		int edadPersona = 5;
	}

}

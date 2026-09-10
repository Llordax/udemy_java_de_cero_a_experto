package bucleWhileYDoWhile;

public class sentenciaWhileYDoWhile {

	public static void main(String[] args) {
		
		int cont = 0;
		
		while(cont < 5) {
			System.out.println("cont = " + cont);
			cont++;
		}
		
		cont = 0;
		boolean prueba = true;
		
		while(prueba) {
			
			if(cont == 7)
				prueba = false;
			
			System.out.println("cont = " + cont);
			cont++;
		}
		
		prueba = false;
		
		while(prueba)
			System.out.println("Nunca se ejecuta");
		
		do
			System.out.println("Se ejecuta al menos una vez");
		
		while(prueba);
		
		prueba = true;
		cont = 0;
		
		do {
			if(cont == 10)
				prueba = false;
			
			System.out.println("cont = " + cont);
			cont++;
			
		}while(prueba);

	}

}

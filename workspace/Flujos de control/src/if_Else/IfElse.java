package if_Else;

public class IfElse {

	public static void main(String[] args) {
		
		float promedio = 6.8f;
		
		if(promedio >= 6.5) 
			System.out.println("Excelente promedio");
		
		else if(promedio >= 6)
			System.out.println("Muy buen promedio");
		
		else if(promedio >= 5.5)
			System.out.println("Buen promedio");
		
		else if(promedio >= 5)
			System.out.println("Regular, necesitas esforzarte un poco más");
		
		else if(promedio >= 4)
			System.out.println("Insuficiente");
		
		else
			System.out.println("Rechazado");
		
		System.out.println("Tu promedio es " + promedio);
	}

}

package bucleForEach;

public class SentenciaForEach {

	public static void main(String[] args) {
		
		int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
		
		for(int n: numeros)
			System.out.println("num = " + n);
		
		String[] nombres = 
			{"Andres","Maria", 
			"Marta", "Jorge", 
			"Nacho", "Aaron", 
			"Pablo", "Diego"};
		
		for(String n : nombres)
			System.out.println("nombre = " + n);

	}

}

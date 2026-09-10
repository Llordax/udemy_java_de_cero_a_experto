package udemy.allorden.java8.lambda.ejercicios.ejercicio1;

public class Main {
	
	public static void main(String[] args) {
		
		ModificarFrase format = frase -> {
            return frase.replace(".", "")
                    .replace(",", "").replace(" ", "")
                    .toUpperCase();
        };
        
        String resultado = format.eliminarYModificar("Pablito clavó un clavito, ¿qué clavito clavó Pablito?");
        System.out.println(resultado);
	}

}

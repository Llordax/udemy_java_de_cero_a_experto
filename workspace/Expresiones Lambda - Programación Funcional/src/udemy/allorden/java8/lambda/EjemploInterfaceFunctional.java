package udemy.allorden.java8.lambda;

import udemy.allorden.java8.lambda.aritmetica.Aritmetica;
import udemy.allorden.java8.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFunctional {
	
	public static void main(String[] args) {
		
		Aritmetica suma = (a, b) -> a + b;
		Aritmetica resta = (a, b) -> a - b;
		
		Calculadora c = new Calculadora();
		
		System.out.println(c.computar(10, 5, suma));
		System.out.println(c.computar(10, 5, resta));
		System.out.println(c.computar(10, 5, (a, b) -> a * b));
		
		System.out.println(c.computarConBiFunction(10, 5, (a, b) -> a + b));
	}

}

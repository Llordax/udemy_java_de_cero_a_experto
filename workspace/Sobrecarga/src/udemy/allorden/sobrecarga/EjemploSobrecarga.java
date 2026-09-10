package udemy.allorden.sobrecarga;

import static udemy.allorden.sobrecarga.Calculadora.*;

public class EjemploSobrecarga {

	public static void main(String[] args) {
		
		System.out.println("suma int: " + sumar(10, 5));
		System.out.println("suma float: " + sumar(10.0f, 5f));
		System.out.println("suma float-int: " + sumar(10f, 5));
		System.out.println("suma int-float: " + sumar(10, 5.0f));
		System.out.println("suma double: " + sumar(10.0, 5.0));
		System.out.println("suma String: " + sumar("10", "5"));
		System.out.println("sumar tres int: " + sumar(10, 5, 3));
		System.out.println("sumar cuatro int: " + sumar(10, 5, 3, 4));
		System.out.println("sumar seis int: " + sumar(10, 5, 3, 4, 5, 6));
		System.out.println("sumar float + n int: " + sumar(10.5f, 5, 9, 15));
		System.out.println("sumar cuatros double: " + sumar(10.0, 5.0, 3.5, 5.4));
		
		System.out.println("suma long: " + sumar(10L, 5L));
		System.out.println("suma int: " + sumar(10, '@'));
		System.out.println("suma float-int: " + sumar(10f, '@'));

	}

}

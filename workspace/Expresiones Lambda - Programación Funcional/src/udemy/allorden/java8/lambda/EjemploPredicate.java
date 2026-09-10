package udemy.allorden.java8.lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import udemy.allorden.java8.lambda.models.Usuario;

public class EjemploPredicate {
	
	public static void main(String[] args) {
		
		Predicate<Integer> test = num -> num > 10;
		boolean resultado = test.test(11);
		System.out.println(resultado);
		
		Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
		System.out.println(test2.test("ROLE_ADMIN"));
		
		BiPredicate<String, String> test3 = String::equals; //(a, b) -> a.equals(b);
		System.out.println(test3.test("andres", "andres"));
		
		BiPredicate<Integer, Integer> test4 = (i, j) -> j > i;
		boolean resultado2 = test4.test(5, 10);
		System.out.println(resultado2);
		
		Usuario a = new Usuario();
		Usuario b = new Usuario();
		a.setNombre("María");
		b.setNombre("Cata");
		
		BiPredicate<Usuario, Usuario> test5 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
		System.out.println(test5.test(a, b));
	}

}

package udemy.allorden.genericos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import udemy.allorden.interfaces.modelo.Cliente;
import udemy.allorden.interfaces.modelo.ClientePremium;

public class EjemploGenericos {

	public static void main(String[] args) {
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente("Andrés", "Guzmán"));
		
		Cliente andres = clientes.iterator().next();
		
		Cliente[] clientesArray = {new Cliente("Andrés", "Guzmán"),
				new Cliente("Lucía", "Nieto")};
		
		Integer[] enterosArray = {1,2,3};
		
		List<Cliente> clientesLista = fromArrayToList(clientesArray);
		List<Integer> enterosLista = fromArrayToList(enterosArray);
		
		clientesLista.forEach(System.out::println);
		enterosLista.forEach(System.out::println);
		
		List<String> nombres = fromArrayToList(new String[]{"Andrés", "Pepe", 
			"Luci", "Bea", "John"}, enterosArray);
		
		nombres.forEach(System.out::println);
		
		List<ClientePremium> clientesPremiumLista = fromArrayToList(
				new ClientePremium[] {new ClientePremium("Paco", "Fernández")});
		
		imprimirClientes(clientes);
		imprimirClientes(clientesLista);
		imprimirClientes(clientesPremiumLista);
		
		System.out.println("Máximo de 1, 9 y 4 es: " + maximo(1,9,4));
		System.out.println("Máximo de 3.9, 11.6 y 7.78 es: " + maximo(3.9, 11.6, 7.78));
		System.out.println("Máximo de zanahoria, arándano y manzana es: " 
				+ maximo("zanahoria", "arándano", "manzana"));
	}
	
	public static <T> List<T> fromArrayToList(T[] c){
		return Arrays.asList(c);
	}
	
	public static <T extends Number> List<T> fromArrayToList(T[] c){
		return Arrays.asList(c);
	}
	
	public static <T extends Cliente & Comparable> List<T> fromArrayToList(T[] c){
		return Arrays.asList(c);
	}
	
	public static <T,G> List<T> fromArrayToList(T[] c, G[] x){
		for(G elemento: x)
			System.out.println(elemento);
			
		return Arrays.asList(c);
	}
	
	public static void imprimirClientes(List<? extends Cliente> clientes) {
		clientes.forEach(System.out::println);
	}
	
	public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
		T max = a;
		if(b.compareTo(max) > 0)
			max = b;
		
		if(c.compareTo(max) > 0)
			max = c;
		
		return max;
	}

}

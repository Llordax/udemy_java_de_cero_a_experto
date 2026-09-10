package claseString;

public class EjemploStringMetodos {

	public static void main(String[] args) {
		
		String nombre = "Andres";
		
		System.out.println(nombre.length());
		System.out.println(nombre.toUpperCase());
		System.out.println(nombre.toLowerCase());
		System.out.println(nombre.equals("Andres"));
		System.out.println(nombre.equals("andres"));
		System.out.println(nombre.equalsIgnoreCase("andres"));
		System.out.println(nombre.compareTo("Andres"));
		System.out.println(nombre.compareTo("Aaron"));
		System.out.println(nombre.charAt(0));
		System.out.println(nombre.charAt(1));
		System.out.println(nombre.charAt(5));
		System.out.println(nombre.charAt(nombre.length() - 1));
		
		System.out.println(nombre.substring(1));
		System.out.println(nombre.substring(1, 4));
		System.out.println(nombre.substring(nombre.length() - 2));
		
		String trabalenguas = "trabalenguas";
		System.out.println(trabalenguas.replace("a", "."));
		System.out.println(trabalenguas);
		System.out.println(trabalenguas.indexOf('a'));
		System.out.println(trabalenguas.lastIndexOf('a'));
		System.out.println(trabalenguas.indexOf("lenguas"));
		System.out.println(trabalenguas.contains("lenguas"));
		System.out.println(trabalenguas.startsWith("lenguas"));
		System.out.println(trabalenguas.endsWith("lenguas"));
		System.out.println("  trabalenguas  ");
		System.out.println("  trabalenguas  ".trim());
		
	}
}

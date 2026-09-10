package claseString;

public class EjemploStringExtensionArchivo {

	public static void main(String[] args) {
		
		String archivo = "alguna.imagen.jpeg";
		int i = archivo.lastIndexOf(".");
		
		System.out.println(archivo.length());
		System.out.println(archivo.substring(archivo.length() - 4));
		System.out.println(archivo.substring(i + 1));
		
	}

}

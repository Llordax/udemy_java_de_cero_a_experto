package udemy.allorden.archivos.ejemplos;

import udemy.allorden.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploLeerArchivo {

	public static void main(String[] args) {
		
		String nombreArchivo = "C:\\Users\\alex_\\Desktop\\Curso de Java\\MisArchivosCurso\\file.txt";
		ArchivoServicio service = new ArchivoServicio();
		
		System.out.println(service.leerArchivo2(nombreArchivo));
	}
}

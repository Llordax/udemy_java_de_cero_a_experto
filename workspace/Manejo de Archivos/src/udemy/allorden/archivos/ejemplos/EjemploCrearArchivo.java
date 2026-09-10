package udemy.allorden.archivos.ejemplos;

import udemy.allorden.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivo {

	public static void main(String[] args) {
		
		String nombreArchivo = "C:\\Users\\alex_\\Desktop\\Curso de Java\\MisArchivosCurso\\file.txt";
		ArchivoServicio service = new ArchivoServicio();
		
		service.crearArchivo2(nombreArchivo);
	}
}

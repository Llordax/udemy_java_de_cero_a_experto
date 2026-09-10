package udemy.allorden.patrones.composite.ejemplo;

import udemy.allorden.patrones.composite.Archivo;
import udemy.allorden.patrones.composite.Directorio;

public class EjemploCompositeBuscar {
	
	public static void main(String[] args) {
		
		Directorio doc = new Directorio("Documento");
		Directorio java = new Directorio("Java");
		
		java.addComponente(new Archivo("patron-composite.docx"));
		Directorio stream = new Directorio("Api stream");
		stream.addComponente(new Archivo("stream-map.docx"));
		
		java.addComponente(stream);
		
		doc.addComponente(java);
		doc.addComponente(new Archivo("cv.docx"));
		doc.addComponente(new Archivo("logo.jpeg"));
		
		boolean encontrado = doc.buscar("patron-composite.docx");
		System.out.println("Econtrado \"patron-composite.docx\": " + encontrado);
		
		encontrado = doc.buscar("Api Stream");
		System.out.println("Econtrado \"Api Stream\": " + encontrado);
		
		encontrado = doc.buscar("cv.docx");
		System.out.println("Econtrado \"cv.docx\": " + encontrado);
	}
}

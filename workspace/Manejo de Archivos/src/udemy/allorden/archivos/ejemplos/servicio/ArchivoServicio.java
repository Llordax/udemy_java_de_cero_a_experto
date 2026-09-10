package udemy.allorden.archivos.ejemplos.servicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArchivoServicio {

	public void crearArchivo(String nombre) {
		
		File file = new File(nombre);
		
		try (BufferedWriter buffer = new BufferedWriter(new FileWriter(file, true))){
			buffer.append("¡Hola qué tal amigos!\n")
					.append("¿Todo bien? Yo estoy escribiendo un archivo...\n")
					.append("Hasta luego\n");
			
			System.out.println("El archivo se ha creado con éxito.");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void crearArchivo2(String nombre) {
		
		File file = new File(nombre);
		
		try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))){
			writer.println("¡Hola qué tal amigos!");
			writer.println("¿Todo bien? Yo estoy escribiendo un archivo...");
			writer.println("Hasta luego");
			
			System.out.println("El archivo se ha creado con éxito.");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String leerArchivo(String nombre) {
		StringBuilder sb = new StringBuilder();
		File file = new File(nombre);
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file))){
			String linea;
			
			while ((linea = reader.readLine()) != null)
				sb.append(linea).append("\n");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sb.toString();
	}
	
	public String leerArchivo2(String nombre) {
		StringBuilder sb = new StringBuilder();
		File file = new File(nombre);
		
		try (Scanner scanner = new Scanner(file)) {
			scanner.useDelimiter("\n");
			
			while (scanner.hasNext())
				sb.append(scanner.next()).append("\n");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sb.toString();
	}
}

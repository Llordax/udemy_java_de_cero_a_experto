package udemy.allorden.ejercicio;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CalculaEdad {
	
	public static void main(String[] args) {
		
		String fechaNacimiento = "20/12/1995";
		
		LocalDate dateNacimiento = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate ahora = LocalDate.now();
		
		Period edad = Period.between(dateNacimiento, ahora);
		
		System.out.println("Esta persona tiene actualmente " + edad);
	}
}
package udemy.allorden.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible {

	private Persona persona; 
	private String carrera;
	private List<String> experiencias = new ArrayList<>();
	
	public Curriculum(Persona persona, String carrera, String contenido) {
		super(contenido);
		this.persona = persona;
		this.carrera = carrera;
	}
	
	public Curriculum addExperiencia(String experiencia) {
		experiencias.add(experiencia);
		return this;
	}

	@Override
	public String imprimir() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(persona).append("\n")
			.append("Resumen: ").append(contenido)
			.append("\n").append("Profesión: ")
			.append(carrera).append("\n")
			.append("Experiencias: \n");
		
		for(String exp : experiencias)
			sb.append("- ").append(exp).append("\n");
		
		return sb.toString();
	}

}

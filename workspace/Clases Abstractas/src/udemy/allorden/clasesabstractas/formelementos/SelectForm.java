package udemy.allorden.clasesabstractas.formelementos;

import java.util.ArrayList;
import java.util.List;

import udemy.allorden.clasesabstractas.formelementos.select.Opcion;

public class SelectForm extends ElementoForm {

	private List<Opcion> opciones = new ArrayList<>();
	
	public SelectForm(String nombre) {
		super(nombre);
	}

	public SelectForm(String nombre, List<Opcion> opciones) {
		super(nombre);
		this.opciones = opciones;
	}

	public SelectForm addOpcion(Opcion opcion) {
		this.opciones.add(opcion);
		return this;
	}
	
	@Override
	public String dibujarHtml() {
		StringBuilder sb = new StringBuilder("<select ");
		
		sb.append("name='")
		.append(this.nombre)
		.append("'>");
		
		for(Opcion opcion : opciones) {
			sb.append("\n<option value='")
				.append(opcion.getValor())
				.append("'");
			
			if(opcion.isSelected()) {
				sb.append(" selected");
				this.valor = opcion.getValor();
			}
			sb.append(">").append(opcion.getNombre())
				.append("</option>");
			
		}
		sb.append("</select>");
		
		return sb.toString();
	}

}

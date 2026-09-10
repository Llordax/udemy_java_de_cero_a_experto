package udemy.allorden.clasesabstractas.formelementos;

import java.util.ArrayList;
import java.util.List;

import udemy.allorden.clasesabstractas.form.validador.LargoValidador;
import udemy.allorden.clasesabstractas.form.validador.Validador;
import udemy.allorden.clasesabstractas.form.validador.mensaje.MensajeFormateable;

public abstract class ElementoForm {
	
	protected String valor, nombre;

	private List<Validador> validadores = new ArrayList<>();
	private List<String> errores = new ArrayList<>();
	
	public ElementoForm() {}

	public ElementoForm(String nombre) {
		this();
		this.nombre = nombre;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public List<String> getErrores() {
		return errores;
	}

	public ElementoForm addValidador(Validador validador) {
		validadores.add(validador);
		return this;
	}
	
	public boolean esValido() {
		for(Validador v : validadores)
			if(!v.esValido(valor)) 
				if(v instanceof MensajeFormateable)
					errores.add(((MensajeFormateable)v).getMensajeFormateado(nombre));
				else
					errores.add(String.format(v.getMensaje(), nombre));
			
		return errores.isEmpty();
	}

	public abstract String dibujarHtml();
}

package udemy.allorden.patrones.decorator.decorador;

import udemy.allorden.patrones.decorator.Formateable;

public class ReemplazarEspaciosDecorador extends TextoDecorador {

	public ReemplazarEspaciosDecorador(Formateable texto) {
		super(texto);
	}

	@Override
	public String darFormato() {
		return texto.darFormato().replace(" ", "_");
	}
}

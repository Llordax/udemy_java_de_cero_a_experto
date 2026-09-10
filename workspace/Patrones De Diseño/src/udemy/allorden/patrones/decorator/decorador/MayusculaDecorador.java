package udemy.allorden.patrones.decorator.decorador;

import udemy.allorden.patrones.decorator.Formateable;

public class MayusculaDecorador extends TextoDecorador {

	public MayusculaDecorador(Formateable texto) {
		super(texto);
	}

	@Override
	public String darFormato() {
		return texto.darFormato().toUpperCase();
	}
}

package udemy.allorden.patrones.decorator.decorador;

import udemy.allorden.patrones.decorator.Formateable;

public abstract class TextoDecorador implements Formateable  {
	
	protected Formateable texto;

	public TextoDecorador(Formateable texto) {
		super();
		this.texto = texto;
	}
	
	
	
}

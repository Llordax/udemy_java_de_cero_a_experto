package udemy.allorden.patrones.decorator;

public class Texto implements Formateable {

	private String texto;
	
	public Texto(String texto) {
		super();
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	@Override
	public String darFormato() {
		return getTexto();
	}
}

package udemy.allorden.patrones.decorator2.decorador;

import udemy.allorden.patrones.decorator2.Configurable;

public abstract class CafeDecorador implements Configurable {
	
	protected Configurable cafe;

	public CafeDecorador(Configurable cafe) {
		super();
		this.cafe = cafe;
	}
}

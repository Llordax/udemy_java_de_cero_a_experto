package udemy.allorden.patrones.composite;

import java.util.Objects;

public abstract class Componente {
	
	protected String nombre;
	
	public Componente(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public abstract String mostrar(int nivel);
	public abstract boolean buscar(String nombre);

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Componente other = (Componente) obj;
		return Objects.equals(nombre, other.nombre);
	}
}

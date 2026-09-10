package udemy.allorden.recursividad.ejemplo.models;

import java.util.ArrayList;
import java.util.List;

public class Componente {
	
	private String nombre;
	private int nivel;
	private List<Componente> componentes;
	
	public Componente(String nombre) {
		super();
		this.nombre = nombre;
		this.componentes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public List<Componente> getComponentes() {
		return componentes;
	}

	public void setComponentes(List<Componente> componentes) {
		this.componentes = componentes;
	}
	
	public Componente addComponente(Componente componente) {
		this.componentes.add(componente);
		return this;
	}
	
	public boolean tieneComponentes() {
		return !this.componentes.isEmpty();
	}

}

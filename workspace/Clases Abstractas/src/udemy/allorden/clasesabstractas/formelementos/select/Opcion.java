package udemy.allorden.clasesabstractas.formelementos.select;

public class Opcion {

	private String valor, nombre;
	private boolean selected;
	
	public Opcion() {}

	public Opcion(String valor, String nombre) {
		this.valor = valor;
		this.nombre = nombre;
	}

	public Opcion(String valor, String nombre, boolean selected) {
		this.valor = valor;
		this.nombre = nombre;
		this.selected = selected;
	}

	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public Opcion setSelected() {
		this.selected = true;
		return this;
		
	}
	
}

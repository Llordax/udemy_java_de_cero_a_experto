package udemy.allorden.ejemplos.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
	
	private String nombre;
	private Integer nota;
	
	public Alumno(String nombre, Integer nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
	
	public Alumno() {}

	
	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Integer getNota() {
		return nota;
	}
	
	
	public void setNota(Integer nota) {
		this.nota = nota;
	}


	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", nota=" + nota + "]";
	}


	@Override
	public int compareTo(Alumno a) {
		//ORDENAR POR NOMBRE
		/*
		if(nombre == null)
			return 0;
		
		return nombre.compareTo(a.nombre);
		*/
		
		//ORDENAR POR NOTA
		if(nota == a.nota)
			return 0;
		
		if(nota > a.nota)
			return 1;
		
		else 
			return -1;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nombre, nota);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(nota, other.nota);
	}
	
	

}

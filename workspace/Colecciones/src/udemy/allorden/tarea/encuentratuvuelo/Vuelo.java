package udemy.allorden.tarea.encuentratuvuelo;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Vuelo {
	
	private String nombre, origen, destino;
	private Date fechaHora;
	private int pasajeros;
	
	public Vuelo(String nombre, String origen, String destino, Date fechaHora, int pasajeros) {
		this.nombre = nombre;
		this.origen = origen;
		this.destino = destino;
		this.fechaHora = fechaHora;
		this.pasajeros = pasajeros;
	}

	public Vuelo() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	@Override
	public String toString() {
		return "Vuelo [nombre=" + nombre + ", origen=" + origen + ", destino=" + destino + ", fechaHora=" + fechaHora
				+ ", pasajeros=" + pasajeros + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(fechaHora);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		return Objects.equals(fechaHora, other.fechaHora);
	}

	public Vuelo ultimoVuelo(List<Vuelo> vuelos) {
		
		/*
		vuelos.sort((v1, v2) -> v2.getFechaHora().compareTo(v1.getFechaHora()));
		
		for(Vuelo v : vuelos)
			System.out.println(v);
		
		Vuelo ultimoVuelo = vuelos.get(0);
		
		return ultimoVuelo;
		*/
		
		Comparator<Vuelo> comparadorPorFechaHora = new Comparator<Vuelo>() {
	        @Override
	        public int compare(Vuelo v1, Vuelo v2) {
	            return v2.getFechaHora().compareTo(v1.getFechaHora());
	        }
	    };

	    Collections.sort(vuelos, comparadorPorFechaHora);
	    
	    Vuelo ultimoVuelo = vuelos.get(0);
	    
	    return ultimoVuelo;
		
	}
	
	public Vuelo vueloConMenosPasajeros(List<Vuelo> vuelos) {
		
		Vuelo vueloMin = vuelos.get(0);
		
		for(int i = 0; i < vuelos.size(); i++) 
			if(vuelos.get(i).getPasajeros() < vueloMin.getPasajeros())
				vueloMin = vuelos.get(i);
		
		return vueloMin;
	}

}

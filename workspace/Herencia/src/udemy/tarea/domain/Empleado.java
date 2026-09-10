package udemy.tarea.domain;

public class Empleado extends Persona {

	private double remuneracion;
	private int empleadoId;
	
	public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion,
			int empleadoId) {
		super(nombre, apellido, numeroFiscal, direccion);
		this.remuneracion = remuneracion;
		this.empleadoId = empleadoId;
	}

	public double getRemuneracion() {
		return remuneracion;
	}
	
	public int getEmpleadoId() {
		return empleadoId;
	}
	
	public double aumentarRemuneracion(int porcentaje) {
		double remuneracionAumentada = remuneracion + ((remuneracion * porcentaje) / 100);
		return remuneracionAumentada;
		
	}

	@Override
	public String toString() {
		return super.toString() 
				+ "\nEmpleado [remuneracion=" + remuneracion 
				+ ", empleadoId=" + empleadoId + "]";
	}
	
	
	
}

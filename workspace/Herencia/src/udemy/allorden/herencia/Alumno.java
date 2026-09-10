package udemy.allorden.herencia;

public class Alumno extends Persona {
	
	private String centroEducativo;
	private double notaMatematicas, notaLengua, notaHistoria;
	
	public Alumno() {
		System.out.println("Alumno: inicializando constructor");
	}

	public Alumno(String nombre, String apellido) {
		super(nombre, apellido);
	}

	public Alumno(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
	}

	public Alumno(String nombre, String apellido, int edad, String centroEducativo) {
		super(nombre, apellido, edad);
		this.centroEducativo = centroEducativo;
	}

	public Alumno(String nombre, String apellido, int edad, String centroEducativo,
			double notaMatematicas, double notaLengua, double notaHistoria) {
		
		this(nombre, apellido, edad, centroEducativo);
		this.notaMatematicas = notaMatematicas;
		this.notaLengua = notaLengua;
		this.notaHistoria = notaHistoria;
	}
	
	public String getCentroEducativo() {
		return centroEducativo;
	}
	
	public void setCentroEducativo(String centroEducativo) {
		this.centroEducativo = centroEducativo;
	}
	
	public double getNotaMatematicas() {
		return notaMatematicas;
	}
	
	public void setNotaMatematicas(double notaMatemáticas) {
		this.notaMatematicas = notaMatemáticas;
	}
	
	public double getNotaLengua() {
		return notaLengua;
	}
	
	public void setNotaLengua(double notaLengua) {
		this.notaLengua = notaLengua;
	}
	
	public double getNotaHistoria() {
		return notaHistoria;
	}
	
	public void setNotaHistoria(double notaHistoria) {
		this.notaHistoria = notaHistoria;
	}

	@Override
	public String saludar() {
		String saludar = super.saludar(); 
		return saludar + " Soy alumno y mi nombre es " + getNombre();
	}
	
	public double calcularPromedio() {
		System.out.println("calcularPromedio " + Alumno.class.getCanonicalName());
		return (notaHistoria + notaLengua + notaMatematicas) / 3;
	}

	@Override
	public String toString() {
		return super.toString() + "\n[centroEducativo=" + centroEducativo + ", notaMatematicas=" + notaMatematicas + ", notaLengua="
				+ notaLengua + ", notaHistoria=" + notaHistoria + "]"
				+ " promedio " + this.calcularPromedio();
	}
	
	
}

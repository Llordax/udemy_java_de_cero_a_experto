package automovil2;

public class Rueda {
	
	private String fabricante;
	private int aro;
	private double ancho;
	
	public Rueda() {
		super();
	}

	public Rueda(String fabricante, int aro, double ancho) {
		super();
		this.fabricante = fabricante;
		this.aro = aro;
		this.ancho = ancho;
	}

	public String getFabricante() {
		return fabricante;
	}

	public int getAro() {
		return aro;
	}

	public double getAncho() {
		return ancho;
	}

}

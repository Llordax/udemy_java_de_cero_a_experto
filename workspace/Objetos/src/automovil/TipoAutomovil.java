package automovil;

public enum TipoAutomovil {
	
	SEDAN("Sedan", "Auto mediano", 4),
	STATION_WAGON("Station Wagon", "Auto grande", 5),
	HATCHBACK("Hatchback", "Auto compacto", 5),
	PICKUP("Pickup", "Camioneta", 4),
	COUPE("Coupé", "Auto pequeño", 2),
	CONVERTIBLE("Convertible", "Auto deportivo", 2),
	FURGON("Furgón", "Auto utilitario", 3),
	SUV("SUV", "Todo terreno deportivo", 5);
	
	
	private final String tipo, descripcion;
	private final int numeroPuertas;
	
	private TipoAutomovil(String tipo, String descripcion, int numeroPuertas) {
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.numeroPuertas = numeroPuertas;
	}

	public String getTipo() {
		return tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}
	
}

package automovil;

public enum ColoresEnum {
	
	ROJO("Rojo"),
	AMARILLO("Amarillo"),
	AZUL("Azul"),
	BLANCO("Blanco"),
	GRIS("Gris oscuro"),
	NARANJA("Naranja");
	
	private final String color;

	private ColoresEnum(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return "auto.color = " + color;
	}

}

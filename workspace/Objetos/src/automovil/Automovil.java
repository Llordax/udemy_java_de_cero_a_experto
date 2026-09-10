package automovil;

import java.util.Objects;

public class Automovil {
	
	//Atributos, propiedades o campos
	/*encapsulación*/private int id;
	/*encapsulación*/private String fabricante, modelo;
	/*encapsulación*/private double cilindrada;
	/*encapsulación*/private int deposito = 40;
	/*encapsulación*/private ColoresEnum color = ColoresEnum.GRIS;
	/*encapsulación*/private TipoAutomovil tipo;
	
	/*encapsulación*/private static ColoresEnum colorPatente = ColoresEnum.NARANJA; //Campo estático
	/*encapsulación*/private static int depositoEstatico = 30; //Campo estático
	/*encapsulación*/private static int ultimoId; //Campo estático
	
	public static final Integer VELOCIDAD_MAX_CARRETERA = 120; //Campo estático de tipo constante
	public static final Integer VELOCIDAD_MAX_CIUDAD = 50; //Campo estático de tipo constante
	
	public static final String COLOR_ROJO = "Rojo"; //Campo estático de tipo constante
	public static final String COLOR_AMARILLO = "Amarillo"; //Campo estático de tipo constante
	public static final String COLOR_AZUL = "Azul"; //Campo estático de tipo constante
	public static final String COLOR_BLANCO = "BLANCO"; //Campo estático de tipo constante
	public static final String COLOR_GRIS = "Gris oscuro"; //Campo estático de tipo constante
	
	//Métodos
	public Automovil() { //CONSTRUCTOR
		id = ++ultimoId;
	} 
	
	//Sobrecarga de constructores
	public Automovil(String fabricante, String modelo) { //CONSTRUCTOR
		this();
		this.fabricante = fabricante;
		this.modelo = modelo;
	}
	
	//Sobrecarga de constructores
	public Automovil(String fabricante, String modelo, ColoresEnum color) {
		this(fabricante, modelo);
		this.color = color;
	}
	
	
	//Sobrecarga de constructores
	public Automovil(String fabricante, String modelo, ColoresEnum color, double cilindrada) {
		this(fabricante, modelo, color);
		this.cilindrada = cilindrada;
	}
		
		//Sobrecarga de constructores
	public Automovil(String fabricante, String modelo, ColoresEnum color, double cilindrada, int deposito) {
		this(fabricante, modelo, color, cilindrada);
		this.deposito = deposito;
	}
	
	public static ColoresEnum getColorPatente() {
		return colorPatente;
	}

	public static void setColorPatente(ColoresEnum colorPatente) {
		Automovil.colorPatente = colorPatente;
	}
	
	public static int getDepositoEstatico() { //GETTER
		return depositoEstatico;
	}

	public static void setDepositoEstatico(int depositoEstatico) { //SETTER
		Automovil.depositoEstatico = depositoEstatico;
	}

	public String getFabricante() { //GETTER
		return fabricante;
	}
 
	public void setFabricante(String fabricante) { //SETTER
		this.fabricante = fabricante;
	}

	public String getModelo() { //GETTER
		return modelo;
	}

	public void setModelo(String modelo) { //SETTER
		this.modelo = modelo;
	}

	public ColoresEnum getColor() { //GETTER
		return color;
	}

	public void setColor(ColoresEnum color) { //SETTER
		this.color = color;
	}

	public double getCilindrada() { //GETTER
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) { //SETTER
		this.cilindrada = cilindrada;
	}

	public int getDeposito() { //GETTER
		return deposito;
	}

	public void setDeposito(int deposito) { //SETTER
		this.deposito = deposito;
	}
	
	public int getId() { //GETTER
		return id;
	}

	public void setId(int id) { //SETTER
		this.id = id;
	}

	public TipoAutomovil getTipo() {
		return tipo;
	}

	public void setTipo(TipoAutomovil tipo) {
		this.tipo = tipo;
	}

	public String verDetalle() {
		
		return  "auto.id = " + id +
				"\nauto.fabricante = " + fabricante +
				"\nauto.modelo = " + modelo +
				"\nauto.tipo = " + tipo +
				"\nauto.color = " + color.getColor() +
				"\nauto.colorPatente = " + colorPatente.getColor() +
				"\nauto.cilindrada = " + cilindrada;
		
	}

	public String acelerar(int rpm) {
		return "el auto " + fabricante + " acelerando a " + rpm + "rpm.";
	}
	
	public String frenar() {
		return fabricante + " " + modelo + " frenando.";
	}
	
	public String acelerarFrenar(int rpm) {
		String acelerar = this.acelerar(rpm);
		String frenar = this.frenar();
		return acelerar + "\n" + frenar;
	}
	
	public float calcularConsumo(int km, float porcentajeCombustible) {
		return km / (deposito * porcentajeCombustible);
	}
	
	public static float calcularConsumoEstatico(int km, int porcentajeCombustible) {
		return km / (depositoEstatico * (porcentajeCombustible / 100f));
	}
	
	//Sobrecarga de métodos
	public float calcularConsumo(int km, int porcentajeCombustible) {
		return km / (deposito * (porcentajeCombustible / 100f));
	}

	@Override
	public int hashCode() {
		return Objects.hash(fabricante, modelo);
	}

	@Override
	public boolean equals(Object obj) { //Pricipio de polimorfismo
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automovil other = (Automovil) obj;
		return Objects.equals(fabricante, other.fabricante) && Objects.equals(modelo, other.modelo);
	}

	@Override
	public String toString() {
		return "Automovil [fabricante=" + fabricante + ", modelo=" + modelo + ", color=" + color + ", cilindrada="
				+ cilindrada + ", deposito=" + deposito + ", id=" + id +"]";
	}
	
}

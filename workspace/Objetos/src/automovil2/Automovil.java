package automovil2;

import java.util.Objects;
import automovil.ColoresEnum;
import automovil.TipoAutomovil;

public class Automovil implements Comparable<Automovil>{
	
	//Atributos, propiedades o campos
	/*encapsulación*/private int id;
	/*encapsulación*/private String fabricante, modelo;
	/*encapsulación*/private Motor motor;
	/*encapsulación*/private Deposito deposito;
	/*encapsulación*/private ColoresEnum color = ColoresEnum.GRIS;
	/*encapsulación*/private TipoAutomovil tipo;
	/*encapsulación*/private Persona conductor;
	/*encapsulación*/private Rueda[] ruedas;
	/*encapsulación*/private int indiceRuedas;
	
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
		ruedas = new Rueda[5];
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
	public Automovil(String fabricante, String modelo, ColoresEnum color, Motor motor) {
		this(fabricante, modelo, color);
		this.motor = motor;
	}
		
	//Sobrecarga de constructores
	public Automovil(String fabricante, String modelo, ColoresEnum color, Motor motor, Deposito deposito) {
		this(fabricante, modelo, color, motor);
		this.deposito = deposito;
	}
	
	//Sobrecarga de constructores
	public Automovil(String fabricante, String modelo, Motor motor, Deposito deposito, ColoresEnum color,
			Persona conductor, Rueda[] ruedas) {
		this(fabricante, modelo, color, motor, deposito);
		this.conductor = conductor;
		this.ruedas = ruedas;
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

	public Motor getMotor() { //GETTER
		return motor;
	}

	public void setMotor(Motor motor) { //SETTER
		this.motor = motor;
	}

	public Deposito getDeposito() { //GETTER
		if(deposito == null)
			deposito = new Deposito();
		
		return deposito;
	}

	public void setDeposito(Deposito deposito) { //SETTER
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

	public Persona getConductor() {
		return conductor;
	}

	public void setConductor(Persona conductor) {
		this.conductor = conductor;
	}

	public Rueda[] getRuedas() {
		return ruedas;
	}

	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
	}

	public Automovil addRueda(Rueda rueda) { //ADD
		if(indiceRuedas < ruedas.length)
			this.ruedas[indiceRuedas++] = rueda;
		
		return this;
	}
	
	public String verDetalle() {
		
		String detalle = "auto.id = " + id +
				"\nauto.fabricante = " + fabricante +
				"\nauto.modelo = " + modelo;
		if(this.getTipo() != null)	
			detalle += "\nauto.tipo = " + this.getTipo().getDescripcion();
		
			detalle += "\nauto.color = " + color.getColor() +
				"\nauto.colorPatente = " + colorPatente.getColor();
			
			if(this.motor != null)
				detalle += "\nauto.motor = " + motor.getCilindrada();
			
			if(conductor != null)
				detalle += "\nConductor subaru: " + this.getConductor();
			
			if(getRuedas() != null) {
				detalle += "Ruedas del automóvil:";
				for(Rueda r : getRuedas())
					detalle += "\nFabricante: " + r.getFabricante() + "\nAro: " + r.getAro() + "\nAncho: " + r.getAncho();
			}
			return detalle;
		
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
		return km / (this.getDeposito().getCapacidad() * porcentajeCombustible);
	}
	
	public static float calcularConsumoEstatico(int km, int porcentajeCombustible) {
		return km / (depositoEstatico * (porcentajeCombustible / 100f));
	}
	
	//Sobrecarga de métodos
	public float calcularConsumo(int km, int porcentajeCombustible) {
		return km / (this.getDeposito().getCapacidad() * (porcentajeCombustible / 100f));
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
				+ motor + ", deposito=" + deposito + ", id=" + id +"]";
	}

	@Override
	public int compareTo(Automovil a) {
		return fabricante.compareTo(a.fabricante);
	}

}

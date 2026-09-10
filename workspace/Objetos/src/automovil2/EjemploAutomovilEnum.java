package automovil2;

import automovil.ColoresEnum;
import automovil.TipoAutomovil;

public class EjemploAutomovilEnum {

	public static void main(String[] args) {
		
		Automovil.setDepositoEstatico(45);
		
		Automovil subaru = new Automovil("Subaru", "Impreza");
		subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA)); 
		subaru.setDeposito(new Deposito());
		subaru.setColor(ColoresEnum.BLANCO);
		subaru.setTipo(TipoAutomovil.HATCHBACK);
		
		System.out.println("Velocidad máxima en carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA + "km/h");
		System.out.println("Velocidad máxima en ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD + "km/h");
		
		Automovil mazda = new Automovil("Mazda", "BT-50", ColoresEnum.ROJO, new Motor(3.0, TipoMotor.DIESEL));
		mazda.setDeposito(new Deposito(45));
		mazda.setTipo(TipoAutomovil.PICKUP);
		System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

		TipoAutomovil tipo = subaru.getTipo();
		System.out.println("tipo subaru: " + tipo.getTipo());
		System.out.println("tipo subaru: " + tipo.getDescripcion());
		
		tipo = mazda.getTipo();
		switch(tipo) { //SWITCH MEJORADO, NO HACE FALTA UTILIZAR EL BREAK YA QUE LO HACE AUTOMÁTICAMENTE
			case CONVERTIBLE ->
				System.out.println("El auto es deportivo y descapotable de dos puertas");
				
			case COUPE ->
				System.out.println("Es un automóvil pequeño de dos puertas y típicamente deportivo");
				
			case FURGON ->
				System.out.println("Es un automóvil utilitario de transporte, de empresas");
				
			case HATCHBACK ->
				System.out.println("Es un automóvil mediano compacto, aspecto deportivo");
				
			case PICKUP ->
				System.out.println("Es un automóvil de doble cabina o camioneta");
				
			case SEDAN ->
				System.out.println("Es un automóvil mediano");
				
			case STATION_WAGON ->
				System.out.println("Es un automóvil más grande, con maletero grande...");
				
		}
		
		TipoAutomovil[] tipos = TipoAutomovil.values();
		for(TipoAutomovil ta: tipos) {
			System.out.print(ta + " -> " + ta.name() + ", " +
					ta.getDescripcion() + ", " + 
					ta.getNumeroPuertas());
			System.out.println();
		}

	}

}

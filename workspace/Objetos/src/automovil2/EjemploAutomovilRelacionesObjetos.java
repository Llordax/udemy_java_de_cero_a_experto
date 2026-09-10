package automovil2;

import automovil.ColoresEnum;
import automovil.TipoAutomovil;

public class EjemploAutomovilRelacionesObjetos {

	public static void main(String[] args) {
		
		Persona conductorSubaru = new Persona("Luci", "Martínez");
		
		Automovil.setDepositoEstatico(45);
		
		Automovil subaru = new Automovil("Subaru", "Impreza");
		subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
		subaru.setDeposito(new Deposito());
		subaru.setColor(ColoresEnum.BLANCO);
		subaru.setTipo(TipoAutomovil.HATCHBACK);
		subaru.setConductor(conductorSubaru);
		//subaru.setRuedas(ruedasSubaru);
		
		Rueda[] ruedasSubaru = new Rueda[5];
		
		for(int i = 0; i < ruedasSubaru.length; i++)
			subaru.addRueda(new Rueda("Yokohama", 16, 7.5)); 
		
		
		
		System.out.println("Velocidad máxima en carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA + "km/h");
		System.out.println("Velocidad máxima en ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD + "km/h");
							  
		Persona conductorMazda = new Persona("Pato", "Rodríguez");
		
		Automovil mazda = new Automovil("Mazda", "BT-50", ColoresEnum.ROJO, new Motor(3.0, TipoMotor.DIESEL));
		mazda.setTipo(TipoAutomovil.PICKUP);
		mazda.setDeposito(new Deposito());
		mazda.setConductor(conductorMazda);
		//mazda.setRuedas(ruedasMazda);
		
		Rueda[] ruedasMazda = new Rueda[5];
		
		for(int i = 0; i < ruedasMazda.length; i++) 
			mazda.addRueda(new Rueda("Michelin", 18, 10.5)); 
		
		Persona conductorNissan = new Persona("Bea", "González");
		
		Automovil nissan = new Automovil("Nissan", "Navara", ColoresEnum.AZUL, new Motor(4.0, TipoMotor.DIESEL), new Deposito(50));
		nissan.setConductor(conductorNissan);
		nissan.setTipo(TipoAutomovil.PICKUP);
		
		nissan.addRueda(new Rueda("Pirelli", 20, 11.5))
				.addRueda(new Rueda("Pirelli", 20, 11.5))
				.addRueda(new Rueda("Pirelli", 20, 11.5))
				.addRueda(new Rueda("Pirelli", 20, 11.5))
				.addRueda(new Rueda("Pirelli", 20, 11.5));
		
		Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 20, 11.5),
								new Rueda("Pirelli", 20, 11.5),
								new Rueda("Pirelli", 20, 11.5),
								new Rueda("Pirelli", 20, 11.5),
								new Rueda("Pirelli", 20, 11.5)};
		
		Persona conductorNissan2 = new Persona("Lalo", "Mena");
		
		Automovil nissan2 = new Automovil("Nissan", "Navara", new Motor(3.5, TipoMotor.GASOLINA), new Deposito(50), ColoresEnum.AMARILLO, conductorNissan2, ruedasNissan2);
		nissan2.setTipo(TipoAutomovil.PICKUP);
		
		Automovil.setColorPatente(ColoresEnum.AZUL); 
		
		Automovil auto = new Automovil();
		
		System.out.println(subaru.verDetalle());
		System.out.println(mazda.verDetalle());
		System.out.println(nissan.verDetalle());
		System.out.println(nissan2.verDetalle());
		
		/*
		System.out.println("Conductor subaru: " + subaru.getConductor());
		System.out.println("Ruedas subaru:");
		for(Rueda r : subaru.getRuedas())
			System.out.println("Fabricante: " + r.getFabricante() + "\nAro: " + r.getAro() + "\nAncho: " + r.getAncho());
		*/
		

	}

}

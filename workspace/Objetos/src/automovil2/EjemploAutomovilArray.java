package automovil2;

import java.util.Arrays;

import automovil.ColoresEnum;
import automovil.TipoAutomovil;

public class EjemploAutomovilArray {

	public static void main(String[] args) {
		
		Persona conductorSubaru = new Persona("Luci", "Martínez");
		
		Automovil.setDepositoEstatico(45);
		
		Automovil subaru = new Automovil("Subaru", "Impreza");
		subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
		subaru.setDeposito(new Deposito());
		subaru.setColor(ColoresEnum.BLANCO);
		subaru.setTipo(TipoAutomovil.HATCHBACK);
		subaru.setConductor(conductorSubaru);
		
		System.out.println("Velocidad máxima en carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA + "km/h");
		System.out.println("Velocidad máxima en ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD + "km/h");
							  
		Persona conductorMazda = new Persona("Pato", "Rodríguez");
		
		Automovil mazda = new Automovil("Mazda", "BT-50", ColoresEnum.ROJO, new Motor(3.0, TipoMotor.DIESEL));
		mazda.setTipo(TipoAutomovil.PICKUP);
		mazda.setDeposito(new Deposito());
		mazda.setConductor(conductorMazda);
		
		Persona conductorNissan = new Persona("Bea", "González");
		
		Automovil nissan = new Automovil("Nissan", "Navara", ColoresEnum.AZUL, new Motor(4.0, TipoMotor.DIESEL), new Deposito(50));
		nissan.setConductor(conductorNissan);
		nissan.setTipo(TipoAutomovil.PICKUP);
		
		Persona conductorSuzuki = new Persona("Lalo", "Mena");
		
		Automovil suzuki = new Automovil("Suzuki", "Vitara", ColoresEnum.AMARILLO, new Motor(1.6, TipoMotor.GASOLINA), new Deposito(50));
		suzuki.setConductor(conductorSuzuki);
		suzuki.setTipo(TipoAutomovil.SUV);
		
		Automovil.setColorPatente(ColoresEnum.AZUL); 
		
		Persona conductorAudi = new Persona("Jano", "Pérez");
		
		Automovil audi = new Automovil("Audi", "A3");
		
		Automovil[] autos = new Automovil[5];
		autos[0] = subaru;
		autos[1] = mazda;
		autos[2] = nissan;
		autos[3] = suzuki;
		autos[4] = audi;
		
		Arrays.sort(autos);
		for(Automovil auto : autos) 
			System.out.println(auto.toString());
		
	}

}

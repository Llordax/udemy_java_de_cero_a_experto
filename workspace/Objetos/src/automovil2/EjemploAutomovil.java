package automovil2;

import java.util.Date;
import automovil.ColoresEnum;

public class EjemploAutomovil {

	public static void main(String[] args) {
		
		Motor motorSubaru = new Motor(2.0, TipoMotor.GASOLINA);
		Automovil subaru = new Automovil("Subaru", "Impreza");
		
		subaru.setMotor(motorSubaru);
		subaru.setDeposito(new Deposito());
		subaru.setColor(ColoresEnum.BLANCO);
		
		Motor motormazda = new Motor(3.0, TipoMotor.DIESEL);
		Automovil mazda = new Automovil("Mazda", "BT-50", ColoresEnum.ROJO, motormazda);
		mazda.setDeposito(new Deposito(45));
		System.out.println("mazda.getFabricante() = " + mazda.getFabricante());
		
		Automovil nissan = new Automovil("Nissan", "Navara", ColoresEnum.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Deposito(50));
		Automovil nissan2 = new Automovil("Nissan", "Navara", ColoresEnum.AZUL, new Motor(3.5, TipoMotor.GASOLINA), new Deposito(50));
		Automovil auto = new Automovil();
		
		Date fecha = new Date();
		
		System.out.print("¿Son iguales? " + (nissan == nissan2) + "\n");
		System.out.print("¿Son iguales? " + (nissan.equals(nissan2)));
		
		System.out.println(nissan.verDetalle());
		System.out.println(subaru.verDetalle());
		System.out.println(mazda.verDetalle());
		
		System.out.println(auto.equals(fecha));
		System.out.println(nissan.toString());
		System.out.println(auto.equals(nissan));
		
		System.out.println();
		
		System.out.println(subaru.acelerar(3000));
		System.out.println(subaru.frenar());
		System.out.println(mazda.acelerarFrenar(3500));
		
		System.out.println();
		
		System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 0.6f));
		System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 60));
		System.out.println("Kilómetros por litro " + nissan.calcularConsumo(300, 60));

	}

}

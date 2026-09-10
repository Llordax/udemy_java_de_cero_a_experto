package automovil;

import java.util.Date;

public class EjemploAutomovil {

	public static void main(String[] args) {
		
		Automovil subaru = new Automovil("Subaru", "Impreza");
		
		subaru.setCilindrada(2.0); 
		subaru.setColor(ColoresEnum.BLANCO);
		
		Automovil mazda = new Automovil("Mazda", "BT-50");
		
		mazda.setCilindrada(3.0);
		mazda.setColor(ColoresEnum.ROJO);
		System.out.println(mazda.getFabricante());
		
		Automovil nissan = new Automovil("Nissan", "Navara", ColoresEnum.AMARILLO, 3.5, 50);
		Automovil nissan2 = new Automovil("Nissan", "Navara", ColoresEnum.AZUL, 3.5, 50);
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

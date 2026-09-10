package automovil;

public class EjemploAutomovilEstatico {

	public static void main(String[] args) {
		
		Automovil.setDepositoEstatico(45);
		
		Automovil subaru = new Automovil("Subaru", "Impreza");
		
		subaru.setCilindrada(2.0); 
		subaru.setColor(ColoresEnum.BLANCO);
		subaru.setTipo(TipoAutomovil.HATCHBACK);
		
		System.out.println("Velocidad máxima en carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA + "km/h");
		System.out.println("Velocidad máxima en ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD + "km/h");
		
		Automovil mazda = new Automovil("Mazda", "BT-50", ColoresEnum.ROJO, 3.0);
		mazda.setTipo(TipoAutomovil.PICKUP);
		
		System.out.println("mazda.getFabricante() = " + mazda.getFabricante());
		
		Automovil nissan = new Automovil("Nissan", "Navara", ColoresEnum.GRIS, 3.5, 50);
		nissan.setTipo(TipoAutomovil.PICKUP);
		
		Automovil nissan2 = new Automovil("Nissan", "Navara", ColoresEnum.AMARILLO, 3.5, 50);
		nissan2.setTipo(TipoAutomovil.PICKUP);
		nissan2.setColor(ColoresEnum.AMARILLO);
		
		Automovil.setColorPatente(ColoresEnum.AZUL); 
		
		Automovil auto = new Automovil();
		
		System.out.println(subaru.verDetalle());
		System.out.println(mazda.verDetalle());
		System.out.println(nissan.verDetalle());
		System.out.println(nissan2.verDetalle());
		
		System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
		
		System.out.println("kilómetros por litro = " + Automovil.calcularConsumoEstatico(300, 60));

		TipoAutomovil tipoSubaru = subaru.getTipo();
		System.out.println("tipo subaru: " + tipoSubaru.getTipo());
		System.out.println("tipo subaru: " + tipoSubaru.getDescripcion());
	}

}

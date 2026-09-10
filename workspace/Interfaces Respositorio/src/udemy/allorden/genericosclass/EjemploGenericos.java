package udemy.allorden.genericosclass;

public class EjemploGenericos {

	public static void main(String[] args) {
		
		Camion<Animal> transporteCaballos = new Camion<>(5);
		
		transporteCaballos.add(new Animal("Joker", "Caballo"));
		transporteCaballos.add(new Animal("Keidi", "Caballo"));
		transporteCaballos.add(new Animal("Sugus", "Caballo"));
		transporteCaballos.add(new Animal("Rober", "Caballo"));
		transporteCaballos.add(new Animal("Chacho", "Caballo"));
		
		imprimirCamion(transporteCaballos);
		
		Camion<Maquinaria> transporteMaquinas = new Camion<>(3);
		
		transporteMaquinas.add(new Maquinaria("Bulldozer"));
		transporteMaquinas.add(new Maquinaria("Grúa Horquilla"));
		transporteMaquinas.add(new Maquinaria("Perforadora"));
		
		imprimirCamion(transporteMaquinas);
		
		Camion<Automovil> transporteAuto = new Camion<>(3);
		
		transporteAuto.add(new Automovil("Toyota"));
		transporteAuto.add(new Automovil("Mitsubishi"));
		transporteAuto.add(new Automovil("Chevrolet"));
		
		imprimirCamion(transporteAuto);
		
	}
	
	public static <T> void imprimirCamion(Camion<T> camion) {
		for(T a : camion) {
			if(a instanceof Animal)
				System.out.println(((Animal)a).getNombre() + " tipo: " + ((Animal)a).getTipo());
		
			else if(a instanceof Maquinaria)
				System.out.println(((Maquinaria)a).getTipo());
			
			else if(a instanceof Automovil)
				System.out.println(((Automovil)a).getMarca());
		}
	}

}

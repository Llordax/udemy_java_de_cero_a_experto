class Persona{
	
	private String nombre;
	
	public void modificarNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public String leerNombre() { //GETTER
		return nombre;
	}
}

public class PasarPorReferencia2 {

	public static void main(String[] args) {

		Persona persona = new Persona();
		persona.modificarNombre("Andres");
		
		System.out.println("Iniciamos el método main");
		
		System.out.println("persona.nombre = " + persona.leerNombre());
		
		System.out.println("Antes de llamar al método test");
		test(persona);
		System.out.println("Después de llamar al método test");
		
		System.out.println("persona.nombre = " + persona.leerNombre());
		
	}
	
	public static void test(Persona persona) {
		System.out.println("Iniciamos el método test");
		persona.modificarNombre("Aaron");
		System.out.println("Finaliza el método test");

	}

}

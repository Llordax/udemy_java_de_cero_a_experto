public class PasarPorReferencia {

	public static void main(String[] args) {
		
		int[] edad = {10, 11, 12};
		
		System.out.println("iniciamos el método main");
		
		for(int i = 0; i < edad.length; i++) 
			System.out.println("edad = " + edad[i]);
		
		System.out.println("Antes de llamar al método test");
		test(edad);
		System.out.println("Después de llamar al método test");
		
		for(int i = 0; i < edad.length; i++) 
			System.out.println("edad = " + edad[i]);
		
	}
	
	public static void test(int[] edadArray) {
		System.out.println("Iniciamos el método test");
		
		for(int i = 0; i < edadArray.length; i++) 
			edadArray[i] = edadArray[i] + 20;

	}
}
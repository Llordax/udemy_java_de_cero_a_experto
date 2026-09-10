package datosPrimitivos;

public class PrimitivosFloat {
	
	static float varFlotante;
	
	public static void main(String[] args) {
		
		float realFloat = 1.5e-10f; //0.00000000015f ; //1.5e4f; //15000f; //2.12e3f; //2120f;
		
		System.out.println(realFloat);
		System.out.println("float corresponde en byte a " + Float.BYTES);
		System.out.println("float corresponde en bits a " + Float.SIZE);
		System.out.println("máximo valor para float: " + Float.MAX_VALUE);
		System.out.println("mínimo valor para float: " + Float.MIN_VALUE);
		
		System.out.println();
		
		double realDouble = 3.4028235E38;
		
		System.out.println(realFloat);
		System.out.println("double corresponde en byte a " + Double.BYTES);
		System.out.println("double corresponde en bits a " + Double.SIZE);
		System.out.println("máximo valor para double: " + Double.MAX_VALUE);
		System.out.println("mínimo valor para double: " + Double.MIN_VALUE);
	
		System.out.println();
		
		var varFlotante = 3.1416f;
		System.out.println(varFlotante);
	
	}

}

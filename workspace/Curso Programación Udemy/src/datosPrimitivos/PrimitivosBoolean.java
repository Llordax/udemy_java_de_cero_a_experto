package datosPrimitivos;

public class PrimitivosBoolean {
	
	public static void main(String[] args) {
		
		boolean datoLogico = false;
		//boolean datoLogico = Boolean.FALSE.booleanValue();
		System.out.println(datoLogico);
		
		double d = 98765.43e-3; //98.76543
		System.out.println(d);
		
		float f = 1.2345e2f; // 123.45
		System.out.println(f);
		
		datoLogico = d > f;
		System.out.println(datoLogico);
		
		boolean esIgual = (3 - 2 == 1);
		System.out.println(esIgual);
		
	}

}

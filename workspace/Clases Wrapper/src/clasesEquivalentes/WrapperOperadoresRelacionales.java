package clasesEquivalentes;

public class WrapperOperadoresRelacionales {

	public static void main(String[] args) {
		
		Integer num1 = Integer.valueOf(1000);
		Integer num2 = num1;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		System.out.println("¿Son el mismo objeto? " + (num1 == num2));
		//true porque son el mismo objeto y tienen el mismo valor
		//y este operador compara por objeto
		num2 = 1000;

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		System.out.println("¿Son el mismo objeto? " + (num1 == num2));
		//false porque no son el mismo objeto aunque tengan el mismo valor
		//ya que se compara por objeto con este operador.
		
		System.out.println("¿Son el mismo objeto? " + (num1.equals(num2)));
		//true porque compara por el valor y ambos son iguales
		System.out.println("¿Son el mismo objeto? " + (num1.intValue() == num2.intValue()));
		//true también porque esta es otra forma de comparar por valor
		
		num2 = 500;
		
		boolean condicion = num1 > num2;
		System.out.println("condicion = " + condicion);
		
		boolean condicion2 = num1.intValue() > num2.intValue();
		System.out.println("condicion2 = " + condicion2);
	}

}

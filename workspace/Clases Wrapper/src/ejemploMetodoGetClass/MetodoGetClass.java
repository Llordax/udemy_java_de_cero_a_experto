package ejemploMetodoGetClass;

import java.lang.reflect.Method;

public class MetodoGetClass {

	public static void main(String[] args) {
		
		String texto = "Hola, ¿que tal?";
		
		Class stringClass = texto.getClass();
		System.out.println("stringClass = " + stringClass.getName());
		System.out.println("stringClass = " + stringClass.getSimpleName());
		System.out.println("stringClass = " + stringClass.getPackageName());
		System.out.println("stringClass = " + stringClass);
		
		for(Method m : stringClass.getMethods()) 
			System.out.println("m.getName() = " + m.getName());
		
		
		Integer num = 34;
		Class intClass = num.getClass();
		Class objClass = intClass.getSuperclass().getSuperclass();
		System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());
		System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());
		System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass().getSuperclass());
		
		for(Method m : objClass.getMethods()) 
			System.out.println("m.getName() = " + m.getName());
		
	}

}

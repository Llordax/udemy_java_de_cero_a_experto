package udemy.allorden.ejemplos.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EjemploTreeMap {

	public static void main(String[] args) {
		
		//Map<String, Object> persona = new TreeMap<>((a, b) -> b.compareTo(a));
		//Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder());
		//Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length));
		Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());
		
		persona.put("nombre", "Aaron");
		persona.put("apellido ", "Rodríguez");
		persona.put("apellido paterno", "Rodríguez");
		persona.put("email", "aaron@email.com");
		persona.put("edad", "22");
		
		Map<String, String> direccion = new HashMap<>();
		
		direccion.put("país", "USA");
		direccion.put("estado", "California");
		direccion.put("ciudad", "Santa Bárbara");
		direccion.put("calle", "One Street");
		direccion.put("número", "120");
		
		persona.put("direccion", direccion);
		
		System.out.println("persona = " + persona);
		
		
		
	}
	
}

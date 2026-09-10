package udemy.allorden.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EjemploHashMap {

	public static void main(String[] args) {
		
		Map<String, Object> persona = new HashMap<>();
		
		System.out.println("contiene elementos = " + !persona.isEmpty());
		
		persona.put(null, "1234");
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
		
		String nombre = (String) persona.get("nombre");
		System.out.println("nombre = " + nombre);
		
		String apellido = (String) persona.get("apellido");
		System.out.println("apellido = " + apellido);
		
		Map<String, String> direccionPersona = (Map<String, String>)persona.get("direccion");
		
		String pais = direccionPersona.get("pais");
		String ciudad = direccionPersona.get("ciudad");
		String barrio = direccionPersona.getOrDefault("barrio", "La playa");
		
		System.out.println("El país de " + nombre + " es: " + pais);
		System.out.println("La ciudad de " + nombre + " es: " + ciudad);
		System.out.println("El barrio de " + nombre + " es: " + barrio);
		
		//String valorApellido = persona.remove("apellido paterno");
		boolean b = persona.remove("apellido paterno", "Rodríguez");
		System.out.println("eliminado " + b);
		System.out.println("persona " + persona);
		
		boolean b2 = persona.containsKey("apellido paterno");
		System.out.println("b2 = " + b2);
		
		b2 = persona.containsValue("Rodríguez");
		System.out.println("b2 = " + b2);
		
		b2 = persona.containsValue("aaron@email.com");
		System.out.println("b2 = " + b2);
		
		System.out.println("********************************** values");
		
		Collection<Object> valores = persona.values();
		
		for(Object value : valores)
			System.out.println("value = " + value);
		
		System.out.println("********************************** keySet");
		
		Set<String> llaves = persona.keySet();
		for(String key : llaves)
			System.out.println("key = " + key);
		
		System.out.println("********************************** entrySet");
		
		for(Map.Entry<String, Object> par : persona.entrySet()) {
			Object value = par.getValue();
			System.out.println(par.getKey() + " => " + value);
			
			if(value instanceof Map) {
				String nom = (String) persona.get("nombre");
				
				Map<String, String> direccionMap = (Map<String, String>) value;
				
				for(Map.Entry<String, String> parDir : direccionMap.entrySet()) {
					System.out.println(parDir.getKey() + " => " + parDir.getValue());
				}
				
			}else
				System.out.println(par.getKey() + " => " + value);
		}
		
		System.out.println("********************************** keySet");
		
		for(String llave : persona.keySet()) {
			Object value = persona.get(llave);
			
			if(value instanceof Map) {
				String nom = (String) persona.get("nombre");
				
				Map<String, String> direccionMap = (Map<String, String>) value;
				System.out.println("el país de " + nom + ": " + 
						direccionMap.get("país"));
				
				System.out.println("la ciudad de " + nom + ": " +
						direccionMap.get("ciudad"));
				
				System.out.println("el estado de " + nom + ": " +
						direccionMap.get("estado"));
			}else 
				System.out.println(llave + " => " + value);
			
			
			System.out.println(llave + " => " + value);
		}
		
		System.out.println("********************************** expresión lambda");
		
		persona.forEach((key, value) -> {
				System.out.println(value + " => " + value);
			});
		
		System.out.println("total: " + persona.size());
		System.out.println("contiene elementos = " + !persona.isEmpty());
	
		boolean b3 = persona.replace("nombre", "Aaron", "Andrés");
		System.out.println("b3 = " + b3);
		System.out.println("persona = " + persona);
		
		persona.replace("nombre", "Javier");
		System.out.println("persona = " + persona);
		
	}
	
}

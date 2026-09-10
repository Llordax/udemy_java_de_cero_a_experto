package udemy.allorden.apistream.ejemplos;

import java.util.Arrays;
import java.util.List;

import udemy.allorden.apistream.ejemplos.models.Factura;
import udemy.allorden.apistream.ejemplos.models.Usuario;

public class EjemploStreamFlatMapFactura {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("Eduardo", "García");
		Usuario u2 = new Usuario("Guillermo", "De la Hoz");
		
		u1.addFactura(new Factura("compras tecnología"));
		u1.addFactura(new Factura("compras muebles"));
		
		u2.addFactura(new Factura("bicicletas"));
		u2.addFactura(new Factura("notebook gamer"));
		
		List<Usuario> usuarios = Arrays.asList(u1, u2);
		
		usuarios.stream()
			.flatMap(u -> u.getFactura().stream())
			.forEach(f -> System.out.println(f.getDescripcion()
			.concat(". Cliente: ")
			.concat(f.getUsuario().toString())));
		
		/*
		for(Usuario u: usuarios)
			for(Factura f : u.getFactura())
				System.out.println(f.getDescripcion());	
		*/
	}
}

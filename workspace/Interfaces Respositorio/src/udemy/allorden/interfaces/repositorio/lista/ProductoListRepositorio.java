package udemy.allorden.interfaces.repositorio.lista;

import java.util.ArrayList;
import java.util.List;

import udemy.allorden.interfaces.modelo.Cliente;
import udemy.allorden.interfaces.modelo.Producto;
import udemy.allorden.interfaces.repositorio.AbstractListRepositorio;
import udemy.allorden.interfaces.repositorio.Direccion;
import udemy.allorden.interfaces.repositorio.excepciones.LecturaAccesoDatoException;

public class ProductoListRepositorio extends AbstractListRepositorio<Producto> {

	@Override
	public List<Producto> listar(String campo, Direccion direccion) {
		List<Producto> listaOrdenada = new ArrayList<>(dataSource);
		
		listaOrdenada.sort((a, b) -> {
			int resultado = 0;
				
			if(direccion == Direccion.ASC)
				resultado = ordenar(campo, a, b);
						
			else if(direccion == Direccion.DESC)
				resultado = ordenar(campo, b, a);
					
			return resultado;
			
		});
		
		return listaOrdenada;
	}

	@Override
	public void editar(Producto producto) throws LecturaAccesoDatoException {
		Producto p = porId(producto.getId());
		
		p.setDescripcion(producto.getDescripcion());
		p.setPrecio(producto.getPrecio());
		
	}
	
	public static int ordenar(String campo, Producto a, Producto b) {
		int resultado = 0;
		switch(campo) {

			case "id" ->
				resultado = a.getId().compareTo(b.getId());
			
			case "descripcion" ->
				resultado = a.getDescripcion().compareTo(b.getDescripcion());
				
			case "precio" ->
				resultado = a.getPrecio().compareTo(b.getPrecio());
			
		}
		
		return resultado;
	}

	

}

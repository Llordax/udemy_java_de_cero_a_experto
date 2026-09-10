package udemy.allorden.interfaces.repositorio.lista;

import java.util.ArrayList;
import java.util.List;
import udemy.allorden.interfaces.modelo.Cliente;
import udemy.allorden.interfaces.repositorio.AbstractListRepositorio;
import udemy.allorden.interfaces.repositorio.Direccion;
import udemy.allorden.interfaces.repositorio.excepciones.LecturaAccesoDatoException;

public class ClienteListRepositorio extends AbstractListRepositorio<Cliente> {

	@Override
	public void editar(Cliente cliente) throws LecturaAccesoDatoException {
		Cliente c = porId(cliente.getId());
		
		c.setNombre(cliente.getNombre());
		c.setApellido(cliente.getApellido());
	}

	@Override
	public List<Cliente> listar(String campo, Direccion direccion) {
		List<Cliente> listaOrdenada = new ArrayList<>(dataSource);
		
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
	
	public static int ordenar(String campo, Cliente a, Cliente b) {
		int resultado = 0;
		switch(campo) {

			case "id" ->
				resultado = a.getId().compareTo(b.getId());
			
			case "nombre" ->
				resultado = a.getNombre().compareTo(b.getNombre());
				
			case "apellido" ->
				resultado = a.getApellido().compareTo(b.getApellido());
			
		}
		
		return resultado;
		
	}

}

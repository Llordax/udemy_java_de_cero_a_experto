package udemy.allorden.interfaces;

import udemy.allorden.interfaces.repositorio.*;
import udemy.allorden.interfaces.repositorio.excepciones.AccesoDatoException;
import udemy.allorden.interfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import udemy.allorden.interfaces.repositorio.excepciones.LecturaAccesoDatoException;
import udemy.allorden.interfaces.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;
import udemy.allorden.interfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;
import udemy.allorden.interfaces.modelo.Cliente;

public class EjemploRepositorio {

	public static void main(String[] args) {
		
		try {
		
			OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
		
			repo.crear(new Cliente("Aaron", "Rodríguez"));
			repo.crear(new Cliente("Diego", "García"));
			repo.crear(new Cliente("Pablo", "Roblas"));
			Cliente martaGadea = new Cliente("Marta", "Gadea");
			repo.crear(martaGadea);
			repo.crear(martaGadea);
			
			//repo.crear(null);
		
			List<Cliente> clientes = repo.listar();
			clientes.forEach(System.out::println);
		
			System.out.println();
			System.out.println("**********************************************************");
			System.out.println();
		
			List<Cliente> paginable = repo.listar(1, 3);
			paginable.forEach(System.out::println);
		
			System.out.println();
			System.out.println("************** Ordenar de forma ascendente **************");
			System.out.println();
		
			//ORDENA POR NOMBRE
		
			List<Cliente> clientesOrdenAsc = repo.listar("nombre", Direccion.ASC);
		
			for(Cliente c : clientesOrdenAsc)
				System.out.println(c);
		
			System.out.println();
			System.out.println("************** Ordenar de forma descendente **************");
			System.out.println();
		
			List<Cliente> clientesOrdenDesc = repo.listar("nombre", Direccion.DESC);
		
			for(Cliente c : clientesOrdenDesc)
				System.out.println(c);
		
			System.out.println();
			System.out.println("************** Ordenar de forma ascendente **************");
			System.out.println();
		
			//ORDENA POR APELLIDO
		
			List<Cliente> clientesOrdenAscApellido = repo.listar("apellido", Direccion.ASC);
		
			for(Cliente c : clientesOrdenAscApellido)
				System.out.println(c);
		
			System.out.println();
			System.out.println("************** Ordenar de forma descendente **************");
			System.out.println();
		
			List<Cliente> clientesOrdenDescApellido = repo.listar("apellido", Direccion.DESC);
		
			for(Cliente c : clientesOrdenDescApellido)
				System.out.println(c);
		
			System.out.println();
			System.out.println("************** Editar Cliente **************");
			System.out.println();
		
			Cliente martaActualizar = new Cliente("Marta", "Mena");
		
			martaActualizar.setId(4);
			repo.editar(martaActualizar);
		
			Cliente marta = repo.porId(4);
			System.out.println(marta);
		
			System.out.println();
		
			repo.listar("apellido", Direccion.ASC).forEach(System.out::println);
		
			System.out.println();
			System.out.println("************** Eliminar Cliente **************");
			System.out.println();
		
			repo.eliminar(4);
			repo.listar().forEach(System.out::println);
		
			System.out.println();
			System.out.println("********** Total **********");
			System.out.println();
		
			System.out.println("Total registro: " + repo.total());
		
		
		}catch(RegistroDuplicadoAccesoDatoException rdade) {
			System.out.println("Registro duplicado: " + rdade.getMessage());
			rdade.printStackTrace();
		
		}catch(LecturaAccesoDatoException lade) {
			System.out.println("Lectura: " + lade.getMessage());
			lade.printStackTrace();
			
		}catch(EscrituraAccesoDatoException eade) {
			System.out.println("Escritura: " + eade.getMessage());
			eade.printStackTrace();
		}
		catch(AccesoDatoException ade) {
			System.out.println("Genérica: " + ade.getMessage());
			ade.printStackTrace();
			
		}
		
	}

}

package udemy.allorden.interfaces;

import java.util.List;

import udemy.allorden.interfaces.modelo.*;
import udemy.allorden.interfaces.repositorio.Direccion;
import udemy.allorden.interfaces.repositorio.OrdenablePaginableCrudRepositorio;
import udemy.allorden.interfaces.repositorio.excepciones.AccesoDatoException;
import udemy.allorden.interfaces.repositorio.excepciones.LecturaAccesoDatoException;
import udemy.allorden.interfaces.repositorio.lista.*;

public class EjemploRepositorioProducto {

	public static void main(String[] args) {
		
		try {
			
			OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
	
			repo.crear(new Producto("Mesa", 50.52));
			repo.crear(new Producto("Silla", 18));
			repo.crear(new Producto("Lámpara", 15.5));
			repo.crear(new Producto("Notebook", 400.89));
	
			List<Producto> productos = repo.listar();
			productos.forEach(System.out::println);
	
			System.out.println();
			System.out.println("**********************************************************");
			System.out.println();
	
			List<Producto> paginable = repo.listar(1, 4);
			paginable.forEach(System.out::println);
	
			System.out.println();
			System.out.println("************** Ordenar de forma ascendente **************");
			System.out.println();
	
			//ORDENA POR NOMBRE
	
			List<Producto> productossOrdenAsc = repo.listar("descripcion", Direccion.ASC);
	
			for(Producto p : productossOrdenAsc)
				System.out.println(p);
	
			System.out.println();
			System.out.println("************** Ordenar de forma descendente **************");
			System.out.println();
	
			List<Producto> productosOrdenDesc = repo.listar("descripcion", Direccion.DESC);
	
			for(Producto p : productosOrdenDesc)
				System.out.println(p);
	
			System.out.println();
			System.out.println("************** Ordenar de forma ascendente **************");
			System.out.println();
	
			//ORDENA POR APELLIDO
	
			List<Producto> productossOrdenAscPrecio = repo.listar("precio", Direccion.ASC);
	
			for(Producto p : productossOrdenAscPrecio)
				System.out.println(p);
	
			System.out.println();
			System.out.println("************** Ordenar de forma descendente **************");
			System.out.println();
		
			List<Producto> productosOrdenDesPrecio = repo.listar("precio", Direccion.DESC);
	
			for(Producto p : productosOrdenDesPrecio)
				System.out.println(p);
	
			System.out.println();
			System.out.println("************** Editar Cliente **************");
			System.out.println();
	
			Producto lamparaActualizar = new Producto("Lámpara escritorio", 23);
	
			lamparaActualizar.setId(3);
			repo.editar(lamparaActualizar);
	
			Producto lampara = repo.porId(3);
			System.out.println(lampara);
	
			System.out.println();
	
			repo.listar("precio", Direccion.ASC).forEach(System.out::println);
	
			System.out.println();
			System.out.println("************** Eliminar Cliente **************");
			System.out.println();
	
			repo.eliminar(2);
			repo.listar().forEach(System.out::println);
	
			System.out.println();
			System.out.println("********** Total **********");
			System.out.println();
	
			System.out.println("Total registro: " + repo.total());
		
		}catch(LecturaAccesoDatoException lade) {
			System.out.println(lade.getMessage());
			lade.printStackTrace();
			
		}catch(AccesoDatoException ade) {
			System.out.println(ade.getMessage());
			ade.printStackTrace();
			
		}
	
	}
	
}

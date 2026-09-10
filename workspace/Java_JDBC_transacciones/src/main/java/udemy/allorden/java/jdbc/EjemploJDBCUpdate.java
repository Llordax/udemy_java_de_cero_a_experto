package udemy.allorden.java.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import udemy.allorden.java.jdbc.modelo.Categoria;
import udemy.allorden.java.jdbc.modelo.Producto;
import udemy.allorden.java.jdbc.repositorio.ProductoRepositorioImpl;
import udemy.allorden.java.jdbc.repositorio.Repositorio;
import udemy.allorden.java.jdbc.util.ConexionBD;

public class EjemploJDBCUpdate {

	public static void main(String[] args) {
		
		try (Connection connection = ConexionBD.getInstance()) {
			Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
			
			System.out.println("================= listar =================");
			repositorio.listar().forEach(System.out::println);
			
			System.out.println("================= obtener por id =================");
			System.out.println(repositorio.porId(1L));
			
			System.out.println("================= editar nuevo producto =================");
			Producto producto = new Producto();
			
			producto.setId(3L);
			producto.setNombre("DDR5 RAM");
			producto.setPrecio(120);
			
			Categoria categoria = new Categoria();
			categoria.setId(2L);
			producto.setCategoria(categoria);
			
			repositorio.guardar(producto);
			System.out.println("Producto editado con éxito");
			
			repositorio.listar().forEach(System.out::println);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

package udemy.allorden.java.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import udemy.allorden.java.jdbc.modelo.Producto;
import udemy.allorden.java.jdbc.repositorio.ProductoRepositorioImpl;
import udemy.allorden.java.jdbc.repositorio.Repositorio;
import udemy.allorden.java.jdbc.util.ConexionBD;

public class EjemploJDBCDelete {

	public static void main(String[] args) {
		
		try (Connection connection = ConexionBD.getInstance()) {
			Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
			
			System.out.println("================= listar =================");
			repositorio.listar().forEach(System.out::println);
			
			System.out.println("================= obtener por id =================");
			System.out.println(repositorio.porId(1L));
			
			System.out.println("================= eliminar producto =================");
			repositorio.eliminar(3L);
			System.out.println("Producto eliminado con éxito");
			
			repositorio.listar().forEach(System.out::println);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

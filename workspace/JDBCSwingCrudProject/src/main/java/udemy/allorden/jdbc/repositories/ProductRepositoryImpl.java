package udemy.allorden.jdbc.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import udemy.allorden.jdbc.db.ConnectionJDBC;
import udemy.allorden.jdbc.model.Product;

public class ProductRepositoryImpl implements ProductRepository {

	@Override
	public List<Product> findAll() {
		List<Product> products = new ArrayList<>();
		
		try (Connection connection = ConnectionJDBC.getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM products")){
			
			while (rs.next()) {
				Product product = new Product(rs.getLong("id"),
						rs.getString("name"),
						rs.getInt("price"),
						rs.getInt("quantity"));
				
				products.add(product);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return products;
	}

	@Override
	public Product findById(Long id) {
		Product product = null;
		
		try (Connection connection = ConnectionJDBC.getConnection();
				PreparedStatement stmt = connection.prepareStatement("SELECT * FROM products WHERE id = ?");
				){
			stmt.setLong(1, id);
			
			try(ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					product = new Product(rs.getLong("id"),
					rs.getString("name"),
					rs.getInt("price"),
					rs.getInt("quantity"));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return product;
		
	}

	@Override
	public Product save(Product product) {
		String sql = "";
		
		if (product.getId() != null && product.getId() > 0) 
			sql = "UPDATE products SET name = ?, price = ?, quantity = ? WHERE id = ?";
		else 
			sql = "INSERT into products(name, price, quantity) VALUES (?, ?, ?)";
		
		try (Connection connection = ConnectionJDBC.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			
			stmt.setString(1, product.getName());
			stmt.setInt(2, product.getPrice());
			stmt.setInt(3, product.getQuantity());
			
			if (product.getId() != null && product.getId() > 0)
				stmt.setLong(4, product.getId());
			
			int affectedRow = stmt.executeUpdate();
			
			if (affectedRow > 0 && (product.getId() == null || product.getId() == 0)) {
				try (ResultSet rs = stmt.getGeneratedKeys()) {
					if (rs.next()) 
						product.setId(rs.getLong(1));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return product;
	}

	@Override
	public void delete(Long id) {
		try (Connection connection = ConnectionJDBC.getConnection();
				PreparedStatement stmt = connection.prepareStatement("DELETE * FROM products WHERE id = ?");){
			stmt.setLong(1, id);
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

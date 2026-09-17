package udemy.allorden.jdbc.repositories;

import java.util.List;

import udemy.allorden.jdbc.model.Product;

public interface ProductRepository {

	List<Product> findAll();
	Product findById(Long id);
	Product save(Product product);
	void delete(Long id);
}

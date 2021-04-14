package ProductApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProductApp.Dao.ProductDao;
import ProductApp.Model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

	// create product service
	public int createProduct(Product product) {
		return this.productDao.createProduct(product);
	}

	// get list of product
	public List<Product> getAllProducts() {
		return this.productDao.getAllProducts();
	}

	// delete the single product
	public void deleteProduct(int p_id) {
		this.productDao.deleteProduct(p_id);
	}

	// get the single product
	public Product getProduct(int p_id) {
		return this.productDao.getProduct(p_id);
	}

}
package ProductApp.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import ProductApp.Model.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// create or update
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}

	// get list of product
	public List<Product> getAllProducts() {
		return this.hibernateTemplate.loadAll(Product.class);
	}

	// delete the single product
	@Transactional
	public void deleteProduct(int p_id) {
		Product data = this.hibernateTemplate.load(Product.class, p_id);
		this.hibernateTemplate.delete(data);

	}

	// get the single product
	public Product getProduct(int p_id) {
		return this.hibernateTemplate.get(Product.class, p_id);
	}

	// update product
}

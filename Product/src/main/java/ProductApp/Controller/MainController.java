package ProductApp.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import ProductApp.Dao.ProductDao;
import ProductApp.Model.Product;
import ProductApp.Service.ProductService;

@Controller
public class MainController {

	@Autowired
	private ProductService productService;
	//
	// @Autowired
	// private ProductDao productDao;

	@RequestMapping("/")
	public String home(Model model) {

		// get all products
		List<Product> allProducts = productService.getAllProducts();

		model.addAttribute("products", allProducts);
		model.addAttribute("title", "Product-Home");
		return "index";
	}

	// ahow add product form
	@RequestMapping(value = "/add-product", method = RequestMethod.GET)
	public String addProduct(Model model) {
		model.addAttribute("title", "Add-Product");
		return "add_product_form";
	}

	// handle product l.e add

	@RequestMapping(value = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {

		System.out.println(product);

		// save into database
		productService.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	// delete handler
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest request) {

		this.productService.deleteProduct(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	// update handler
	@RequestMapping("/update/{productId}")
	public String updateProduct(@PathVariable("productId") int productId, Model model) {

		Product oldProduct = this.productService.getProduct(productId);

		model.addAttribute("title", "Update-Form");
		model.addAttribute("product", oldProduct);
		return "update_form";
	}
}

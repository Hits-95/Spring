package springMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {

		System.out.println("home calling...");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(){
		
		System.out.println("about calling...");
		return "about";
	}
}

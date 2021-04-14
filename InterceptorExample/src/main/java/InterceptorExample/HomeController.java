package InterceptorExample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("home called");
		return "home";
	}

	// handler for requst
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("user") String user, Model model) {
		System.out.println("welcome called.");

		model.addAttribute("name", user);
		return "welcome";
	}
}

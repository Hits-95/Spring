package springMVC.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {

		System.out.println("home calling...");
		
		//add data 
		model.addAttribute("id", 1);
		model.addAttribute("name", "Hitesh Bhagwan Ahire");
		
		//list 
		List<String> friends = new ArrayList<String>();
		friends.add("Ganesh");
		friends.add("Nikita");
		friends.add("Pradhunya");
		friends.add("Komal");
		friends.add("Vrushali");
		friends.add("Shruti");
		model.addAttribute("friends", friends);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(){
		
		System.out.println("about calling...");
		return "about";
	}
	
	@RequestMapping("/help")
	public String help(){
		
		System.out.println("help calling...");
		return "help";
	}
}

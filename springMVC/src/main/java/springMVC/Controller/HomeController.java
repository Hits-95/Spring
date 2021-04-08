package springMVC.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {

		System.out.println("home calling...");

		// add data
		model.addAttribute("id", 1);
		model.addAttribute("name", "Hitesh Bhagwan Ahire");

		// list
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
	public String about() {

		System.out.println("about calling...");
		return "about";
	}

	// ModelAndView
	@RequestMapping("/help")
	public ModelAndView help() {

		System.out.println("help calling...");
		// creating model and view objecct
		ModelAndView modelAndView = new ModelAndView();
		// setting the data
		modelAndView.addObject("id", 11);
		modelAndView.addObject("name", "Ganesh Nikam");

		modelAndView.addObject("time", LocalDateTime.now());
		
		//marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(14);
		list.add(15);
		list.add(16);
		modelAndView.addObject("marks", list);
		
		// set page to going to
		modelAndView.setViewName("help");

		return modelAndView;
	}
}
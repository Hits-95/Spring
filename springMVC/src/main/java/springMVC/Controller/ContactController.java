package springMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springMVC.Model.User;

@Controller
// @RequestMapping("/hitesh")
public class ContactController {

	//this method run 1st becoz it has commen data 
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("head", "Spring MVC Code");
		model.addAttribute("desc", "code with Hitesh Ahire Code");
	}

	@RequestMapping(path = "/contact", method = RequestMethod.GET)
	public String showForm() {

		System.out.println("showForm run....");
		return "contact";

	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {

		System.out.println(user);
		return "success";
	}

	// this method is equvalt to this

	// @RequestMapping(path = "/processform", method = RequestMethod.POST)
	// public String handleForm(@RequestParam("email") String email,
	// @RequestParam("userName") String userName,
	// @RequestParam("userPassword") String userPassword, Model model) {
	//
	// User user = new User();
	//
	// user.setEmail(email);
	// user.setUserName(userName);
	// user.setUserPassword(userPassword);
	//
	// System.out.println(user);
	//
	// // set data in attribute to
	// model.addAttribute("user", user);
	//
	//// model.addAttribute("userEmail", userEmail);
	//// model.addAttribute("userName", userName);
	//// model.addAttribute("password", password);
	//
	// return "success";
	// }
}

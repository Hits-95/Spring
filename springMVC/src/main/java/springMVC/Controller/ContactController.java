package springMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping(path = "/contact", method = RequestMethod.GET)
	public String showForm() {
		System.out.println("showForm run....");
		return "contact";

	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String userEmail, @RequestParam("userName") String userName,
			@RequestParam("userPassword") String passwork) {
		System.out.println(userName);
		System.out.println(userEmail);
		System.out.println(passwork);
		return "";
	}
}

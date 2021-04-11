package SpringMVC_Search;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

	@RequestMapping(path = "/complex", method = RequestMethod.GET)
	public String showForm() {
		return "complex_form";
	}

	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("student") Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "complex_form";
		}
		System.out.println(student);
		return "success";
	}
}

package SpringMVC_Search;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@RequestMapping(path = "/complex", method = RequestMethod.GET)
	public String showForm() {
		return "complex_form";
	}

	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute @DateTimeFormat(pattern = "dd-MM-yyyy") Student student ) {
		System.out.println(student);
		return "success";

	}

}

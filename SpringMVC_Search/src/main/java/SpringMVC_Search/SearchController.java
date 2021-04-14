package SpringMVC_Search;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {

		System.out.println("home was called...");

		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {

		System.out.println("search was called..");
		RedirectView redirectView = new RedirectView();

		if (query.isEmpty()) {
			redirectView.setUrl("home");
			System.out.println("query has empty... ");
			return redirectView;
		}

		String url = "https://www.google.com/search?q=" + query;
		redirectView.setUrl(url);

//		// exce[tion
//		String str = null;
//		System.out.println(str.length());

		return redirectView;
	}

	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {
		System.out.println("User id :" + userId);
		System.out.println("User name : +userName");

		// //exception
		Integer i = Integer.parseInt(userName);

		return "home";
	}

	// @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	// @ExceptionHandler(value = NullPointerException.class)
	// public String exceptionHandlerNull(Model model) {
	//
	// model.addAttribute("msg", "Null Pointer Exception.");
	// System.out.println("Exception fire..");
	// return "error";
	// }
	//
	//
	// @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	// @ExceptionHandler(value = NumberFormatException.class)
	// public String exceptionNumberFormate(Model model) {
	// model.addAttribute("msg", "Number Formate Exception.");
	// return "error";
	//
	// }
	//
	// //all ecception
	//
	// @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	// @ExceptionHandler(value = Exception.class)
	// public String allExceptin(Model model) {
	// model.addAttribute("msg","error");
	// return "error";
	//
	// }
}

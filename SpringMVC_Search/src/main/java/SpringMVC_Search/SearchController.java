package SpringMVC_Search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		return redirectView;
	}
}
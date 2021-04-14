package SpringMVC_Search;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandlerNull(Model model) {

		model.addAttribute("msg", "Null Pointer Exception.");
		System.out.println("Exception On handler fire..");
		return "error";
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionNumberFormate(Model model) {
		model.addAttribute("msg", "Number Formate Exception.");
		return "error";
	}

	// all ecception

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String allExceptin(Model model) {
		model.addAttribute("msg", "error");
		return "error";

	}
}

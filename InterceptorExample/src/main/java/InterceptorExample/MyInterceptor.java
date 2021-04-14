package InterceptorExample;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

// interface  - HandlerInterceptor preHandl, postHandl, preHandl, afterCompletion  this are abstract methods
// classs - HandlerInterceptorAdaptor

public class MyInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String name = request.getParameter("user");
		System.out.println("This is PriHandler method" + name);

		if (name.startsWith("H")) {

			System.out.println("user input invalid.");

			response.setContentType("text/html");
			response.getWriter().print("Invalide name... name starts with h");
			return false;
		}
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is post handler runs after handler...");
		super.postHandle(request, response, handler, modelAndView);
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is afterCompletion runs after view part..");
		super.afterCompletion(request, response, handler, ex);
	}

}

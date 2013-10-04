package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomePage
 */
public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter();
		request.getSession();
		HttpSession hs = request.getSession();
		response.getWriter().println("Hello");	
		String hsId = hs.getId();
		response.getWriter().println("Your session id is " + hsId);
		
	
String param =request.getParameter("param");
			request.getParameterNames();
			request.getParameterMap();
			
	
	response.getWriter().println("Session attribute is " + param);


}
}

package example.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet(name="myGreetingServlet",urlPatterns= {"/doGreet","/greet"})
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//when a client makes a request this method will get called	
	//Setting the MIME type to html
		//Multipurpose Internet mail extension
		String mimeType="text/html";
		response.setContentType(mimeType);
		String responseText="<h1 style='color:red'>Welcome To Servlets</h1>";
		PrintWriter out=response.getWriter();
		out.println(responseText);
		System.out.println("Inside Doget() method here");
	}
	public void init()
	{
		System.out.println("Inside Intit() method");
	}
	public void destroy()
	{
		System.out.println("Inside Destory");
	}
}

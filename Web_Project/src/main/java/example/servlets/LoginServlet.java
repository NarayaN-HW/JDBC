package example.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */

@WebServlet("/doLogin")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userId = request.getParameter("userName");
		String password = request.getParameter("password");
//		hrAdmin, aSAdmin
		if (userId.equals("hrAdmin") && password.equals("asAdmin")) {
			HttpSession session = request.getSession();
			session.setAttribute("loggedInUser", userId);
			session.setAttribute("greetingMsg", "Welcome to JSP");
			ServletContext ctx = getServletContext();// this.getServletConvert()
			String companyPolicy = """
					We are Deligted to serve our customer in better way.
					we value our Customer....
					""";

			ctx.setAttribute("ourCompanyPolicy", companyPolicy);
			out.println("<h2>Authentication Successful....</h2>");
			out.println("<h2>To proceed, please <a href='show.jsp'> Click Here.</a></h2>");
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			out.println("Invalid UserName and Password. Try Again...");
			dispatcher.include(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

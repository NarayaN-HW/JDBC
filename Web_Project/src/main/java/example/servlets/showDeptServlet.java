package example.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.jdbc.Department;

/**
 * Servlet implementation class showDept
 */
@WebServlet("/showDept")
public class showDeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Object obj = request.getAttribute("loadedDept");// return object
		Department dept = (Department) obj;

		out.println("<h2>Showing Department Details</h2>");
		out.println("<h3>Department id: " + dept.getDeptNo() + "</h3>");
		out.println("<h3><mark>Department Name: " + dept.getdName() + "</mark></h3>");
		out.println("<h3><mark>Department Location: " + dept.getLoc() + "</mark></h3>");
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

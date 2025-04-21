package example.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import stujentJDBC.Student;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ShowStudentServlet
 */
@WebServlet("/showStudent")
public class ShowStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowStudentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Object obj = request.getAttribute("loadStudent");// return object
		Student std = (Student) obj;

		out.println("<h2>Showing Student Details</h2>");
		out.println("<h3>Student id: " + std.getId() + "</h3>");
		out.println("<h3><mark>Student Name: " + std.getsName() + "</mark></h3>");
		out.println("<h3><mark>Student city: " + std.getsCity() + "</mark></h3>");
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

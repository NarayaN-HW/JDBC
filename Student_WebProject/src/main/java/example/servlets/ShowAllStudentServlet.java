package example.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import stujentJDBC.JDBCDao;
import stujentJDBC.Student;
import stujentJDBC.StudentDao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

/**
 * Servlet implementation class ShowAllStudentServlet
 */
@WebServlet("/showAllStudent")
public class ShowAllStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowAllStudentServlet() {
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
		JDBCDao<Student, Integer> dao = new StudentDao();
		Collection<Student> std = dao.getAll();

		out.println("<h2>Showing All Student Details</h2>");
		std.stream().forEach(d -> out.println("<h2>" + d + "</h2><br>"));
		out.println();
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

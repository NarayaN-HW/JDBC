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

/**
 * Servlet implementation class AddStudentServlet
 */

@WebServlet("/addStudent")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String sName = request.getParameter("sname");
		String city = request.getParameter("scity");
		Student currStd = new Student(0, sName, city);
		JDBCDao<Student, Integer> dao = new StudentDao();
		dao.add(currStd);
		out.println("<h2>Student added successfully..</h2>");

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

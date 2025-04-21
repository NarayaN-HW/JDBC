package example.servlets;

import jakarta.servlet.RequestDispatcher;
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
 * Servlet implementation class SearchStudentServlet
 */
@WebServlet("/searchStudent")
public class SearchStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchStudentServlet() {
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

		String StudentRoll = request.getParameter("rollno");
		int rollno = Integer.parseInt(StudentRoll);

		JDBCDao<Student, Integer> dao = new StudentDao();
		Student foundDept = dao.getOne(rollno);

		RequestDispatcher dispatcher = null;
		if (foundDept == null) {
			out.println("<h2>Student Not Found invalid ID. Try again</h2>");
			dispatcher = request.getRequestDispatcher("searchStudent.html");
//		include method to back msg print
			dispatcher.include(request, response);

		} else {
			System.out.println("Search ID is Found... ");
			dispatcher = request.getRequestDispatcher("showStudent");
			request.setAttribute("loadStudent", foundDept);
			dispatcher.forward(request, response);

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

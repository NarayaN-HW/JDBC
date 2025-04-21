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
 * Servlet implementation class DeleteStudentServlet
 */

@WebServlet("/deleteStudent")
public class DeleteStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String studentRollno = request.getParameter("rollno");
		int rollno = Integer.parseInt(studentRollno);

		JDBCDao<Student, Integer> dao = new StudentDao(); 
		dao.delete(rollno);

		RequestDispatcher dispatcher = request.getRequestDispatcher("deleteStudent.html");
		out.println("<h2>The data has been deleted </h2>");
		dispatcher.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

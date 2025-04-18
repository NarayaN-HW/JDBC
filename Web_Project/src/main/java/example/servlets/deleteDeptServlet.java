package example.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.jdbc.Department;
import example.jdbc.DepartmentDao;
import example.jdbc.JdbcDao;

/**
 * Servlet implementation class deleteDeptServlet
 */
@WebServlet("/deleteDept")
public class deleteDeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public deleteDeptServlet() {
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

		String deptNo = request.getParameter("deptNo");
		int dept_no = Integer.parseInt(deptNo);

		JdbcDao<Department, Integer> dao = new DepartmentDao();
		dao.delete(dept_no);

		RequestDispatcher dispatcher = request.getRequestDispatcher("deleteDept.html");
		out.println("<h2>The data has been deleted </h2>");
		dispatcher.include(request, response);

	

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

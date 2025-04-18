package example.servlets;

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
 * Servlet implementation class AddDeptSevlet
 */

@WebServlet("/addDept")
public class AddDeptSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String dept_No = request.getParameter("deptNo");
		int deptNo = Integer.parseInt(dept_No);
		String dName = request.getParameter("dName");
		String location = request.getParameter("location");
		Department currentDept = new Department(deptNo, dName, location);
		JdbcDao<Department, Integer> dao = new DepartmentDao();
		dao.add(currentDept);
		
		out.println("<h2>Department added successfully..</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}

package com.bookshop.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.bookshop.entity.Book;
import com.bookshop.servie.BookService;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/addbook")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = request.getParameter("title");
		Double price = Double.parseDouble(request.getParameter("price"));
		int year = Integer.parseInt(request.getParameter("year"));

		try {
			Book newBook = new Book(0, title, year, null);
			boolean isAdded = new BookService().AddingBook(newBook, request.getParameter("name"),
					request.getParameter("email"), request.getParameter("country"));

			if (isAdded) {
				out.println("<h1 style='color:green'>Book added suyccessfully...</h1>");
			} else {
				out.println("<h2 style='color:red'>Failed to added ...</h2>");
			}
		} catch (Exception e) {
			out.println("<h2> Exception" + e.getMessage() + "</h2>");
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

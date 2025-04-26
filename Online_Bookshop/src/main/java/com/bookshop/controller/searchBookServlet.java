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
 * Servlet implementation class searchBookServlet
 */
@WebServlet("/searchbook")
public class searchBookServlet extends HttpServlet {
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

		try {
			Book foundBook = new BookService().getDisplayBookbyTitle(title);
			request.setAttribute("book", foundBook);
			request.getRequestDispatcher("search-result.jsp").forward(request, response);
			
		} catch (Exception e) {
			out.println("<h2> Exception" + e.getMessage() + "</h2>");
			request.getRequestDispatcher("search-book.jsp").include(request, response);
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

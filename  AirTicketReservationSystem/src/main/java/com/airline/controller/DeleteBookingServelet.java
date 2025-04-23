package com.airline.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.airline.services.BookingService;

/**
 * Servlet implementation class DeleteBookingServelet
 */
@WebServlet("/deletebook")
public class DeleteBookingServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int bid = Integer.valueOf(request.getParameter("flightId"));
		if (new BookingService().delete(bid)) {
			out.println("booking cancled successfully");
			RequestDispatcher dispacher = request.getRequestDispatcher("search.jsp");
			dispacher.include(request, response);

		} else {
			out.println("Booking not found!!!");
			RequestDispatcher dispacher = request.getRequestDispatcher("search.jsp");
			dispacher.include(request, response);
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

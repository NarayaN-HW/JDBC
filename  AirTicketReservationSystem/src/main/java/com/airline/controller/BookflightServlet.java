package com.airline.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.airline.entiry.Booking;
import com.airline.services.BookingService;

/**
 * Servlet implementation class Bookflight
 */
@WebServlet("/bookflight")
public class BookflightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession sesion = request.getSession();
		Object idobj = sesion.getAttribute("userId");
		int cid = (int) idobj;
		int fid = Integer.parseInt(request.getParameter("flightId"));

		BookingService s = new BookingService();
		boolean bs = new BookingService().bookingFlights(cid, fid);
		if (bs) {
			List<Booking> books = s.ShowBooking(cid);
			request.setAttribute("bookings", books);
			request.getRequestDispatcher("mybooking.jsp").forward(request, response);
			out.println("<h2 style='color:green'>Flight Is Booked Successfully</h2>");
//			response.sendRedirect("mybooking.jsp");
		} else {
			out.println("<h2 style='color:red'>Failed To Booked</h2>");
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

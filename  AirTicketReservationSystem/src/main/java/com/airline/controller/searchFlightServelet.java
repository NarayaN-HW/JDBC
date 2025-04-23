package com.airline.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

import com.airline.entiry.Flight;
import com.airline.services.FlightServices;

/**
 * Servlet implementation class searchFlightServelet
 */
@WebServlet("/search")
public class searchFlightServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String source = request.getParameter("from");
		String destination = request.getParameter("to");
		LocalDate date = LocalDate.parse(request.getParameter("date"));

		List<Flight> flights = new FlightServices().searchflight(source, destination, date);

		if (!flights.isEmpty()) {
			System.out.println(flights);
			flights.stream().forEach(f -> System.out.println(f));
			
//			generate response in other page
			request.setAttribute("flights", flights);
			request.getRequestDispatcher("searchResults.jsp").forward(request, response);
		} else {
			out.println("<h2> No flight available. Try Again!!!</h2>");
//			generate response in redirect baCK page
			request.getRequestDispatcher("search.jsp").include(request, response);
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

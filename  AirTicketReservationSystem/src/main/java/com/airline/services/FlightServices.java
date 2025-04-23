package com.airline.services;

import java.time.LocalDate;
import java.util.List;
import com.airline.dao.FlightDao;
import com.airline.entiry.Flight;

public class FlightServices {
	private FlightDao flightDao;
	

	public FlightServices() {
		flightDao = new FlightDao();
	}

	public List<Flight> searchflight(String source, String dest, LocalDate date) {

		return flightDao.searchFlightBySourceDestinationDate(source, dest, date);
	}
}

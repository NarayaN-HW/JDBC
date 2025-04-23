package com.airline.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.airline.entiry.Flight;
import com.airline.utils.JdbcUtils;

public class FlightDao {
	String query;

	public List<Flight> searchFlightBySourceDestinationDate(String source, String dest, LocalDate date) {
		query = "SELECT * FROM flight WHERE source=? and destination=? and flight_date=?";
		List<Flight> flights = new ArrayList<Flight>();
		try (Connection con = JdbcUtils.getConnection(); PreparedStatement psmt = con.prepareStatement(query);) {
			psmt.setString(1, source);
			psmt.setString(2, dest);
			psmt.setDate(3, Date.valueOf(date)); // date valueof() method
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {

				flights.add(new Flight(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDate(5).toLocalDate(), rs.getDouble(6)));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flights;
	}
}

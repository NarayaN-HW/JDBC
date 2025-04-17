package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
	
//	private static Connection dbConnection;
	
	public static  Connection buildConnection() throws SQLException {
		Connection dbConnection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "password");
		return dbConnection;
	}
}

package com.simplewebapp.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils_1 {

	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException {
		// Note: Change the connection parameters accordingly.
		String hostName = "localhost";
		String dbName = "test_webapp";
		String userName = "root";
		String password = "poje";
		return getMySQLConnection(hostName, dbName, userName, password);
	}

	public static Connection getMySQLConnection(String hostName, String dbName, String userName, String password)
			throws SQLException, ClassNotFoundException {
		
		// JDBC connection driver
		Class.forName("com.mysql.jdbc.Driver");

		// URL Connection for MySQL:
		//String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		
		String connectionURL ="jdbc:mysql://localhost/test_webapp";

		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}
}

package com.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**one time connection**/
public class ConnectionUtil {

	private static Connection con=null;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjavaprj", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//to get DB connection# this method
	public static Connection getConn() {
		return con;
	}
	
}

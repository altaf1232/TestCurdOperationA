package com.curda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionClass {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
       System.out.println("hi i am Second  DBConnectionClass 3");
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/malik", "root", "root");

		return connection;
		

	}
	
}

package com.kogent.jstl;
import java.sql.*;
public class DriverConnection {
	
	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/sample","root","root");
	}
}

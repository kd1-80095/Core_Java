package com.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	public static final String DB_DRIVER ="com.mysql.cj.jdbc.Driver";
	public static final String DB_URL ="jdbc:mysql://localhost:3306/karad";
	public static final String DB_USER ="KD1_80095_AniketJadhav";
	public static final String DB_PASSWD ="manager";
	
	static{
		try {
	
		Class.forName(DB_DRIVER);
	}
	catch(Exception e)
	{
		e.getStackTrace();
	}
	}
	
	public static Connection getConnection() throws SQLException
	{
	 Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
	 return con;
}
}

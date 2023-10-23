package com.assignment;

import java.sql.Connection;
import java.sql.SQLException;

public class UserDao implements AutoCloseable {

	private Connection con;
	
	public UserDao() throws SQLException
	{	
	con = DbUtil.getConnection();
}
	
	
	@Override
	public void close()  {
		try {
			if(con!=null)
				con.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

	public int deleteby_Id
	{
			
		
	}
	
	
	
}

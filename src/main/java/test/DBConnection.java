package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
	public static Connection con = null;

	private DBConnection() {}

	static {
		try 
		{
			Class.forName(DBInfo.driver);
			con=DriverManager.getConnection(DBInfo.dbUrl,DBInfo.dbUName,DBInfo.dbPWord);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getCon()
	{
		return con;
	}
}

package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class All_ResultsDAO 
{
	ArrayList<StudentMarks> list=new ArrayList<>();
	
	public ArrayList<StudentMarks> getAllResults()
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from student_marks69");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				list.add(new StudentMarks(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getFloat(11), rs.getString(12)));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
}

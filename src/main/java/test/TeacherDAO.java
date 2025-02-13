package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TeacherDAO 
{
	public int k=0;
	public int registerStudent(TeacherBean tb)
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into Teacher_details69 values(?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, tb.gettId());
			ps.setString(2, tb.gettName());
			ps.setString(3, tb.gettSubjects());
			ps.setFloat(4, tb.gettSalary());//
			ps.setString(5, tb.gettAddress());
			ps.setLong(6, tb.gettContact());
			ps.setString(7, tb.gettMid());
			ps.setDate(8, tb.getDob());
			ps.setString(9, tb.gettGender());
			
			k=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return k;
	}

}

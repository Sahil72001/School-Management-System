package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentMarkDAO 
{
	public StudentMarks sm;
	public StudentMarks getResult(int roll,int sClass,String sec)
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from student_marks69 where stud_rollno=? and stud_class=? and stud_section=?");
			ps.setInt(1, roll);
			ps.setInt(2, sClass);
			ps.setString(3, sec);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				sm=new StudentMarks(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getFloat(11), rs.getString(12));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return sm;
	}
}

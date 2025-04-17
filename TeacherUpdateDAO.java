package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TeacherUpdateDAO 
{
	public int k=0;
	
	public int update(TeacherBean tb)
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps= con.prepareStatement("update teacher_details69 set teacher_subjects=?,teacher_salary=?,teacher_address=?,teacher_contact=?,teacher_mid=? where teacher_id=? and teacher_name=?");
			ps.setString(1, tb.gettSubjects());
			ps.setFloat(2, tb.gettSalary());
			ps.setString(3, tb.gettAddress());
			ps.setLong(4,tb.gettContact());
			ps.setString(5, tb.gettMid());
			ps.setInt(6, tb.gettId());
			ps.setString(7, tb.gettName());
			
			k=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return k;
	}
}

package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO 
{
	public int k=0;
	public int registerStudent(StudentBean sb)
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into student_details69 values(?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, sb.getsRoll());
			ps.setString(2, sb.getsName());
			ps.setInt(3, sb.getsClass());
			ps.setString(4, sb.getsSection());//
			ps.setString(5, sb.getsAddress());
			ps.setLong(6, sb.getsContact());
			ps.setDate(7, sb.getDob());
			ps.setString(8, sb.getsMid());
			ps.setString(9, sb.getsGender());
			
			k=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return k;
	}
}

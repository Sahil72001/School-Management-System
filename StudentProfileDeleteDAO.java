package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentProfileDeleteDAO 
{
	static int k=0;
	public int deleteProfile(StudentBean sb)
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("delete from student_details69 where stud_rollno=? and stud_class=? and stud_section=?");
			ps.setInt(1,sb.getsRoll());
			ps.setInt(2, sb.getsClass());
			ps.setString(3, sb.getsSection());
			
			k=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return k;
	}
}

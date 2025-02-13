package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TeacherProfileDeleteDAO 
{
	static int k=0;
	public int deleteProfile(TeacherBean tb)
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("delete from teacher_details69 where teacher_id=?");
			ps.setInt(1,tb.gettId());
			
			k=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return k;
	}
}

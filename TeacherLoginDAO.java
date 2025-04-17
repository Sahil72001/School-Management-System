package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TeacherLoginDAO 
{
	TeacherBean tb=null;
	
	public TeacherBean login(int tId,String tName)
	{
		try 
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from teacher_details69 where teacher_id=? and teacher_name=?");
			
			ps.setInt(1, tId);
			ps.setString(2, tName);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				tb=new TeacherBean();
				tb.settId(rs.getInt(1));
				tb.settName(rs.getString(2));
				tb.settSubjects(rs.getString(3));
				tb.settSalary(rs.getFloat(4));
				tb.settAddress(rs.getString(5));
				tb.settContact(rs.getLong(6));
				tb.settMid(rs.getString(7));
				tb.setDob(rs.getDate(8));
				tb.settGender(rs.getString(9));
			}
			
		}
		catch(Exception e)
		{
		 e.printStackTrace();	
		}
		return tb;
	}
}

package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentLoginDAO 
{
	StudentBean sb=null;
	public StudentBean login(String sName, int roll, int sClass, long phn)
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from student_details69 where stud_rollno=? and stud_name=? and stud_class=? and stud_contact=?");
			ps.setInt(1,roll);
			ps.setString(2, sName);
			ps.setInt(3, sClass);
			ps.setLong(4, phn);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				sb=new StudentBean();
				sb.setsRoll(rs.getInt(1));
				sb.setsName(rs.getString(2));
				sb.setsClass(rs.getInt(3));
				sb.setsSection(rs.getString(4));
				sb.setsAddress(rs.getString(5));
				sb.setsContact(rs.getLong(6));
				sb.setDob(rs.getDate(7));
				sb.setsMid(rs.getString(8));
				sb.setsGender(rs.getString(9));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return sb;
	}
}

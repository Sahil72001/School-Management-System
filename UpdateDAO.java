package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateDAO 
{
	int k=0;
	public int update(StudentBean sb, int oldClass)
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("update student_details69 set stud_class=?,stud_section=?,stud_address=?,stud_contact=?,stud_mid=? where stud_rollno=? and stud_name=? and stud_class=?");
			ps.setInt(1, sb.getsClass());
			ps.setString(2, sb.getsSection());
			ps.setString(3, sb.getsAddress());
			ps.setLong(4,sb.getsContact());
			ps.setString(5,sb.getsMid());
			ps.setInt(6, sb.getsRoll());
			ps.setString(7, sb.getsName());
			ps.setInt(8, oldClass);
			k=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return k;
	}
}

package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AttendanceDetailsDAO 
{
	
	public StudentBean getAttendance(StudentBean sb)
	{
		
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps= con.prepareStatement("select attendance,attendance_pct from student_attendance69 where student_rollno=? and student_class=? and student_section=?");
		    ps.setInt(1, sb.getsRoll());
		    ps.setInt(2, sb.getsClass());
		    ps.setString(3, sb.getsSection());
		    
		    ResultSet rs=ps.executeQuery();
		    if(rs.next())
		    {
		    	sb.setsAttendance(rs.getInt(1));
		    	sb.setAttendancePercent(rs.getFloat(2));
		    }
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb;
	}
}

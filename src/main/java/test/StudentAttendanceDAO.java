package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

public class StudentAttendanceDAO 
{
	int k=0;
	
	public int attendance(StudentBean sb)
	{
		try 
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps3=con.prepareStatement("select attendance_date from student_attendance69 where student_rollno=? and student_class=? and student_section=?");
			ps3.setInt(1, sb.getsRoll());
			ps3.setInt(2, sb.getsClass());
			ps3.setString(3, sb.getsSection());
			
			ResultSet rs1=ps3.executeQuery();
			if(rs1.next())
			{
				 System.out.println(rs1.getDate(1));
				 System.out.println(java.sql.Date.valueOf(LocalDate.now()));
				 if(!java.sql.Date.valueOf(LocalDate.now()).equals(rs1.getDate(1)))
				 {
					 
							PreparedStatement ps1=con.prepareStatement("delete from student_attendance69 where student_rollno=? and student_class=? and student_section=?");
							ps1.setInt(1, sb.getsRoll());
							ps1.setInt(2, sb.getsClass());
							ps1.setString(3, sb.getsSection());
							ps1.executeUpdate();
							
						}
						
				 }
			
			PreparedStatement ps=con.prepareStatement("insert into student_attendance69 values (?,?,?,?,?,?)");
			ps.setInt(1, sb.getsRoll());
			ps.setInt(2, sb.getsClass());
			ps.setString(3, sb.getsSection());
			ps.setInt(4, sb.getsAttendance());
			ps.setFloat(5, (Float.parseFloat(""+sb.getsAttendance())/StudentBean.classDays)*100);
			//Current Date
			LocalDate today= LocalDate.now(); 
			ps.setDate(6, java.sql.Date.valueOf(today));
			
			k=ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
	}
}

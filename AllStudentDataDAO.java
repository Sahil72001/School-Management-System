package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AllStudentDataDAO 
{
	ArrayList<StudentData> list=new ArrayList<StudentData>();
	
	public ArrayList<StudentData> getAllData()
	{
		
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps= con.prepareStatement("SELECT STUD_ROLLNO,STUD_NAME,STUD_CLASS,STUD_SECTION,STUD_CONTACT,ATTENDANCE,ATTENDANCE_PCT,STUD_ADDRESS,STUD_MID FROM STUDENT_DETAILS69 INNER JOIN STUDENT_ATTENDANCE69 ON STUD_ROLLNO=STUDENT_ROLLNO AND STUD_CLASS=STUDENT_CLASS AND STUD_SECTION=STUDENT_SECTION");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				list.add(new StudentData(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getLong(5),rs.getInt(6),rs.getFloat(7),rs.getString(8),rs.getString(9)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}

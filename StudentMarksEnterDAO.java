package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentMarksEnterDAO 
{
	static int k=0;
	public int insertMarks(String roll, int sClass,String section,int mil,int eng,int thl,int math,int sci,int ssc,int tot,float pct,String grade)
	{
		
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into student_marks69 values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,roll);
			ps.setInt(2,sClass);
			ps.setString(3,section);
			ps.setInt(4,mil);
			ps.setInt(5,eng);
			ps.setInt(6,thl);
			ps.setInt(7,math);
			ps.setInt(8,sci);
			ps.setInt(9,ssc);
			ps.setInt(10,tot);
			ps.setFloat(11,pct);
			ps.setString(12,grade);
			
			k=ps.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return k;
	}
}

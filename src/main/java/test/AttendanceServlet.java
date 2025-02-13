package test;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/attendance")
public class AttendanceServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		LocalTime lt=LocalTime.now();
		LocalTime cuttOffTime=LocalTime.of(12,0);
		LocalDate ld=LocalDate.now();
		
		if(lt.isAfter(cuttOffTime)||ld.getDayOfWeek()==DayOfWeek.SUNDAY)
		{
			req.setAttribute("msg", "<h2 style='color:red;'>Attendance will be taken from MONDAY-SATURDAY till 12:00pm</h2>");
			req.getRequestDispatcher("logFail.jsp").forward(req, res);
		}
		else
		{
			StudentBean sb= (StudentBean)req.getServletContext().getAttribute("sb");
			sb.setsAttendance(sb.getsAttendance()+1);
			int k = new StudentAttendanceDAO().attendance(sb);
			
			if(k>0)
			{
				req.setAttribute("msg", "<h2 style='color:green;'>Attendance Taken successfully...</h2><br>");
				req.getRequestDispatcher("attendanceTaken.jsp").forward(req, res);
			}
			else
			{
				req.setAttribute("msg", "<h3 style='color:red;'>Attendance Already Taken Once...</h3><br>");
				req.getRequestDispatcher("logFail.jsp").forward(req, res);
			}
		}
		
		
		
	}
}

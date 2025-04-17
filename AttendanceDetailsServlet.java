package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/attendanceDetails")
public class AttendanceDetailsServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		StudentBean sb=new AttendanceDetailsDAO().getAttendance((StudentBean)req.getServletContext().getAttribute("sb"));
		
		if(sb!=null)
		{
			req.getRequestDispatcher("attendanceDetails.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "<h1 style='color:red;'>No such student data...</h1><br>");
			req.getRequestDispatcher("logFail.jsp").forward(req, res);
		}
		
	}
}

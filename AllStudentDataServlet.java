package test;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/studentData")
public class AllStudentDataServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		ArrayList<StudentData> studentList=new AllStudentDataDAO().getAllData();
		if(studentList!=null)
		{
			req.setAttribute("sList", studentList);
			req.getRequestDispatcher("ShowData.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "<h3 style='color:red;'>No Data Available....</h3><br>");
			req.getRequestDispatcher("logFail.jsp").forward(req, res);
		}
	}
}

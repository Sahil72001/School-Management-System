package test;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/sMarks")
public class StudentMarksServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		String roll=req.getParameter("sRoll");
		int sClass=Integer.parseInt(req.getParameter("sClass"));
		String section=req.getParameter("sSec");
		int mil=Integer.parseInt(req.getParameter("mil"));
		int eng=Integer.parseInt(req.getParameter("eng"));
		int thl=Integer.parseInt(req.getParameter("thl"));
		int math=Integer.parseInt(req.getParameter("math"));
		int sci=Integer.parseInt(req.getParameter("sci"));
		int ssc=Integer.parseInt(req.getParameter("ssc")); 
		int tot=mil+eng+thl+math+sci+ssc;
		float pct=(tot/6.0f);
		String grade=null;
		if(pct>=90)
		{
			grade="A";
		}
		else if(pct>=80&&pct<90)
		{
			grade="B";
		}
		else if(pct>=70&&pct<80)
		{
			grade="C";
		}
		else if(pct>=60&&pct<70)
		{
			grade="D";
		}
		else if(pct>=55&&pct<60)
		{
			grade="E";
		}
		else
		{
			grade="F";
		}
		
		int k = new StudentMarksEnterDAO().insertMarks(roll, sClass, section, mil, eng, thl, math, sci, ssc, tot, pct, grade);
	
		if(k>0)
		{
			req.getRequestDispatcher("EnterResult.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "<h3 style='color:red;'>Student Record Not Found...</h3><br>");
			req.getRequestDispatcher("logFail.jsp").forward(req, res);
		}
	}
}

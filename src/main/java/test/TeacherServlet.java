package test;

import java.io.IOException;
import java.sql.Date;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/teachReg")
public class TeacherServlet extends HttpServlet
{
	@SuppressWarnings("deprecation")
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException 
	{
		TeacherBean tb=new TeacherBean();
		tb.settId(Integer.parseInt( req.getParameter("tId")));
		tb.settName(req.getParameter("tName"));
		tb.settSubjects(req.getParameter("tSubjects"));
		tb.settSalary(Float.parseFloat(req.getParameter("tSalary")));
		tb.settAddress(req.getParameter("tAddr"));
		tb.settContact(Long.parseLong(req.getParameter("tContact")));
		String date=req.getParameter("sDob");
		String []arr=date.split("-");
		tb.setDob(new Date(Integer.parseInt(arr[0])-1900,Integer.parseInt(arr[1])-1,Integer.parseInt(arr[2])));
		tb.settMid(req.getParameter("tMid"));
		tb.settGender(req.getParameter("tGen"));
		
		TeacherDAO td=new TeacherDAO();
		int k=td.registerStudent(tb);
		if(k>0)
		{
			RequestDispatcher rd=req.getRequestDispatcher("registerSuccess.jsp");
			rd.forward(req, res);
		}
	}
}

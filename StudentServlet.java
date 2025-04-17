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
@WebServlet("/studReg")
public class StudentServlet extends HttpServlet
{
	@SuppressWarnings("deprecation")
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException 
	{
		StudentBean sb=new StudentBean();
		sb.setsRoll(Integer.parseInt( req.getParameter("sRoll")));
		sb.setsName(req.getParameter("sName"));
		sb.setsClass(Integer.parseInt(req.getParameter("sClass")));
		sb.setsSection(req.getParameter("sSection"));
		sb.setsAddress(req.getParameter("sAddr"));
		sb.setsContact(Long.parseLong(req.getParameter("sContact")));
		String date=req.getParameter("sDob");
		String []arr=date.split("-");
		sb.setDob(new Date(Integer.parseInt(arr[0])-1900,Integer.parseInt(arr[1])-1,Integer.parseInt(arr[2])));
		sb.setsMid(req.getParameter("sMid"));
		sb.setsGender(req.getParameter("sGen"));
		
		StudentDAO sd=new StudentDAO();
		int k=sd.registerStudent(sb);
		if(k>0)
		{
			RequestDispatcher rd=req.getRequestDispatcher("registerSuccess.jsp");
			rd.forward(req, res);
		}
	}
}

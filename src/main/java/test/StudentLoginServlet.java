package test;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/studentOTP")
public class StudentLoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException 
	{
		StudentBean sb=new StudentLoginDAO().login(req.getParameter("sName"), Integer.parseInt(req.getParameter("sRoll")) , Integer.parseInt(req.getParameter("sClass")), Long.parseLong(req.getParameter("sPhn")));
		System.out.println(sb);
		if(sb==null)
		{
			req.setAttribute("msg", "<h2 style='color:red;'>Invalid User Details...</h2><br>");
			req.getRequestDispatcher("logFail.jsp").forward(req, res);
		}
		else
		{
			ServletContext sct=req.getServletContext();
			sct.setAttribute("sb", sb);
			req.setAttribute("sb", sb);
			req.getRequestDispatcher("OTP").forward(req, res);
		}
	}
}

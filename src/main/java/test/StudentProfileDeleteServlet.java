package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/delete")
public class StudentProfileDeleteServlet extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		StudentBean sb=(StudentBean)req.getServletContext().getAttribute("sb");
		int k=new StudentProfileDeleteDAO().deleteProfile(sb);
		
		if(k>0)
		{
			req.setAttribute("msg", "<h2 style='color:red;'>Hii "+sb.getsName()+" your account deleted Successfully</h2>");
			sb=null;
			req.getRequestDispatcher("DeleteSuccess.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "<h3 style='color:red;'>Invalid User...</h3>");
			req.getRequestDispatcher("logFail.jsp").forward(req, res);
		}
	}
}

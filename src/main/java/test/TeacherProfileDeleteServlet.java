package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/tDelete")
public class TeacherProfileDeleteServlet extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		TeacherBean tb=(TeacherBean)req.getServletContext().getAttribute("tb");
        int k=new TeacherProfileDeleteDAO().deleteProfile(tb);
		
		if(k>0)
		{
			
			req.setAttribute("msg", "<h2 style='color:red;'>Hii "+tb.gettName()+" your account deleted Successfully</h2>");
			tb=null;
			req.getRequestDispatcher("DeleteSuccess.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "<h3 style='color:red;'>Invalid User...</h3>");
			req.getRequestDispatcher("logFail.jsp").forward(req, res);
		}
		
	}
}

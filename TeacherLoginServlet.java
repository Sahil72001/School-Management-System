package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/teacher")
public class TeacherLoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		TeacherBean tb = new TeacherLoginDAO().login(Integer.parseInt(req.getParameter("tRoll")) , req.getParameter("tName"));
		if(tb!=null)
		{
			req.getServletContext().setAttribute("tb",tb);
			req.getRequestDispatcher("tOTP").forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "<h3 style='color:red;'>Invalid Login Details...</h3><br>");
			req.getRequestDispatcher("logFail.jsp").forward(req, res);
		}
	}
}

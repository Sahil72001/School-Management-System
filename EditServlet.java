package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		StudentBean sb=(StudentBean)req.getServletContext().getAttribute("sb");
		int oldClass=sb.getsClass();
		sb.setsClass(Integer.parseInt(req.getParameter("sClass")));
		sb.setsSection(req.getParameter("section"));
		sb.setsAddress(req.getParameter("sAddr"));
		sb.setsContact(Long.parseLong(req.getParameter("sContact")));
		sb.setsMid(req.getParameter("sMid"));
		
		int k = new UpdateDAO().update(sb,oldClass);
		
		if(k>0)
		{
			req.setAttribute("msg", "<h2 style='color:green;'>Profile updated successfully...</h2><br>");
			req.getRequestDispatcher("updateSuccess.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "<h3 style='color:red;'>Profile not updated...</h3><br>");
			req.getRequestDispatcher("logFail.jsp").forward(req, res);
		}
	}
}

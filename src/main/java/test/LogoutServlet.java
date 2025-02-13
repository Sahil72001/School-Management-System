package test;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		Cookie[] c = req.getCookies();
		
		if(c==null)
		{
			req.setAttribute("msg", "<h3 style='color:red;'>Session has expired...</h3>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else
		{
			ServletContext sct=req.getServletContext();
			sct.removeAttribute("sb");
			c[0].setMaxAge(0);
			res.addCookie(c[0]);
			req.setAttribute("msg", "<h3 style='color:green;'>Student logout Successfully....</h3>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
	}
}

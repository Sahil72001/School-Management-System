package test;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/confirmOtp")
public class StudentLoginSuccess extends HttpServlet 
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		int otp=Integer.parseInt(req.getParameter("otp"));
		int cOtp=(int)req.getServletContext().getAttribute("otp");
		if(otp==cOtp)
		{
			StudentBean sb=(StudentBean) req.getServletContext().getAttribute("sb");
			System.out.println(sb);
			Cookie ck=new Cookie("sRoll",""+sb.getsRoll());
			res.addCookie(ck);
			
			req.setAttribute("msg", "<h3 style='color:green;'>Login Successfully...</h3><br>");
			req.getRequestDispatcher("logSuccess.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "<h3 style='color:red;'>Invalid Otp...</h3><br>");
			req.getRequestDispatcher("logFail.jsp").forward(req, res);
		}
	}
}

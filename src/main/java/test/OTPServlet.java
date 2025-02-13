package test;

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/OTP")
public class OTPServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		int otp=1000+(int)(Math.random()*9000);
		req.getServletContext().setAttribute("otp", otp);
		req.getRequestDispatcher("otp.jsp").forward(req, res);
	}
}

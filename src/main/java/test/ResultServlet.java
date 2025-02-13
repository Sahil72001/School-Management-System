package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/result")
public class ResultServlet extends HttpServlet
{
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		StudentMarks sm=new StudentMarkDAO().getResult(Integer.parseInt(req.getParameter("roll")), Integer.parseInt(req.getParameter("class")), req.getParameter("sec"));
		if(sm!=null)
		{
			req.setAttribute("sm", sm);
			req.getRequestDispatcher("Result.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "<h3 style='color:red'>Invalid Student information...</h3><br>");
			req.getRequestDispatcher("logFail.jsp").forward(req, res);
		}
	}
}

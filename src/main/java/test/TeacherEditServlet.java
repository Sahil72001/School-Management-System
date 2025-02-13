package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/tEdit")
public class TeacherEditServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		TeacherBean tb=(TeacherBean)req.getServletContext().getAttribute("tb");
		tb.settSubjects(req.getParameter("tSub"));
		tb.settSalary(Float.parseFloat(req.getParameter("tSal")));
		tb.settAddress(req.getParameter("tAddr"));
		tb.settContact(Long.parseLong(req.getParameter("tPhn")));
		tb.settMid(req.getParameter("tMid"));
		
		int k = new TeacherUpdateDAO().update(tb);
		
		if(k>0)
		{
			req.getRequestDispatcher("tUpdateSuccess.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "<h3 style='color:red;'>Profile not Updated...</h3><br>");
			req.getRequestDispatcher("logFail.jsp").forward(req, res);
		}
	}
}

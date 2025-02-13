package test;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/studentResults")
public class All_ResultsServlet extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		ArrayList<StudentMarks> listOfResults=new All_ResultsDAO().getAllResults();
		
		if(listOfResults!=null)
		{
			req.setAttribute("allResults", listOfResults);
			req.getRequestDispatcher("AllResults.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "<h3 style='color:red;'>No Student Result not Found</h3><br>");
			req.getRequestDispatcher("tLogginSuccess.jsp").forward(req, res);
		}
	}
}

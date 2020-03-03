package Caculator;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class Caculator1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String snum1 = (request.getParameter("num1")) ;
		String snum2 = (request.getParameter("num2")) ;
		String snum3 = (request.getParameter("num3")) ;
		String snum4 = (request.getParameter("num4")) ;
		if(snum1 != "" && snum2 != "")
		{
			int num1 = Integer.parseInt(snum1);
			int num2 = Integer.parseInt(snum2);
			response.getWriter().println("result  "+ num1 + "  +  " + num2 +"  =  " + (num1+num2) + "<br>");
		}
		if(snum3 != "" && snum4 != "")
		{
			int num3 = Integer.parseInt(snum3);
			int num4 = Integer.parseInt(snum4);
			response.getWriter().println("result  "+ num3 + "  +  " + num4 +"  =  " + (num3+num4) + "<br>");
		}
	
	}
}

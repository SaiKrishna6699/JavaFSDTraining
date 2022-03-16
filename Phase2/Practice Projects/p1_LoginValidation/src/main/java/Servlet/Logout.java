package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/logout")
public class Logout extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		request.getSession().invalidate();
		
		out.println("<body style='background-color:Black; color:white;'> <center>");
		
		out.println("<br/><br/><br/>");
		
		out.println("<h2>User Logged Out Successfully.</h2>");
		
		out.println("<br/><br/>");
		
		out.println("<a href='index.html' ><button style='background-color:orange; color:white;'>Login again</button></a>");
		
		out.println("</center></body>");
	}

}
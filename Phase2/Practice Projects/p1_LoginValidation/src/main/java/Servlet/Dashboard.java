package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		HttpSession session = request.getSession();

		PrintWriter out = response.getWriter();

//		Check whether the session already exists
		if (session.getAttribute("userName") != null) {

			out.println("<body style='background-color:Black; color:white;'><center>");
			
			out.println("<br/><br/><br/>");
			
			Object a = session.getAttribute("userName");
			
			String b = a.toString();
			
			out.println("<h3>Welcome, " + b.toUpperCase() );
			
			out.println("<br/>");

			out.println("<br> Logged In Successfully!.</h3>");
			
			out.println("<br/><br/>");

			out.println("<a href='logout'><button style='background-color:Orange; color:white;'>LOGOUT</button></a>");
			
			out.print("</center></body>");
		}

		else {
			response.sendRedirect("index.html");
		}

	}

}

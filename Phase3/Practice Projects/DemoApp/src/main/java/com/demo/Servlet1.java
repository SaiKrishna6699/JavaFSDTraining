package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void dopost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		
		String uname, password;
		
		uname = req.getParameter("uname");
		password = req.getParameter("password");
		
		PrintWriter out = res.getWriter();
		
		HttpSession ss = req.getSession();
		
		if(uname == "Admin" && password == "Admin123"){
			
			ss.setAttribute(uname, uname);
			ss.setAttribute(password, password);
			
			res.sendRedirect("servlet2");
				
		}
		else {
			
			
			out.println("<p>Invalid Credentials</p>");
		}
	}
}
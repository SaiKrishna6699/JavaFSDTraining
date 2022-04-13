package com.demo;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Servlet2 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void dopost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		HttpSession ss = req.getSession();
		
		if (ss.getAttribute("uname") != null) {
		out.println("<html><body>");
		out.println("<p>Welcome, User.</p>");
		out.println("</body></html>");
		}
		else {
			res.sendRedirect("index.html");
		}
		}
	}

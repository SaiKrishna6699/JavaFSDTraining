package com.flightbooking.servlets;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.flightbooking.database.ConnectionUtil;

@WebServlet("/AdminLogin")
public class LoginOfAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		try {
			ConnectionUtil dao = new ConnectionUtil();
			if (dao.checkAdmin(email, password)) {
				response.sendRedirect("AdminHome.jsp");
			} else {
				HttpSession session = request.getSession();
				session.setAttribute("message", "Invalid Details");
				response.sendRedirect("AdminPage.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
package com;

import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class ProductDetails
 */
@WebServlet("/DbConnection")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		DbConnection pp = new DbConnection();
		pp.setPid(Integer.parseInt(request.getParameter("pid")));

		response.setContentType("text/html");
		pw.println("<html><body>");

		try {
			Connection con = DbConnection.dbConn();
			String sql = "select * from product where pid=(?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, pp.getPid());
			ResultSet rs = ps.executeQuery();

			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);

			pw.println("<center><table border=1 width=14% height=10%>");
			pw.println("<tr><th>Product Id</th><th>Product Name</th><th>Price</th>");
			while (rs.next()) {

				// pw.println(rs.getInt(1)+" "+rs.getString(2));
				pw.println("<tr><td>" + rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getDouble(3)
						+ "</td></tr></center>");

			}
			pw.println("</table>");
			pw.println("</html></body>");
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException ep) {
			ep.printStackTrace();
		}

	}

}

package com.Login;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dbconn.Connect;
import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn=null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		/*You can use this hook to pull the name and password from
		 * a database instead of had coding the user name and password
		 */
//		conn=(Connection) Connect.dbConnector();
//		
//		String query="select * from users where name=? and password=?";
//		
//		try {
//			PreparedStatement ps=conn.prepareStatement(query);
//			ps.setString(1, uname);
//			ps.setString(2, pass);
//			ResultSet rs=ps.executeQuery();
//			if(rs.next()) {
//				response.sendRedirect("Home.jsp");
//			}else {
//				response.sendRedirect("loginPage.jsp");
//			}
//		}catch(SQLException x){
//			x.printStackTrace();
//			
//		}
		//checks to make sure the username and pasword are correct and then creates
		//a session and sets that session attribute to username.  
		if(uname.equals("user") && pass.equals("password")) {
			response.sendRedirect("Home.jsp");
			HttpSession session=request.getSession();
			session.setAttribute("username", uname);
		}else {
			response.sendRedirect("loginPage.jsp");
			//System.out.println("sup");
		}
		
	}
}

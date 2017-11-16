package com.Login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//when the "logout"button is pressed it fires Logout Servlet 
		//and this chunk of code invalidates the session and directs you back to 
		// the login page
		HttpSession session=request.getSession();
		session.invalidate();
		response.sendRedirect("loginPage.jsp");
		
	}

}

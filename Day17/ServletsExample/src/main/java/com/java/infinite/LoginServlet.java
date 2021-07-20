package com.java.infinite;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user,pwd;
		user = request.getParameter("userName");
		pwd = request.getParameter("passWord");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		LoginDao dao = new LoginDao();
		try {
			int count = dao.authenticate(user, pwd);
			if (count==1) {
				RequestDispatcher disp = request.getRequestDispatcher("menu.html");
				disp.forward(request, response);
			} else {
				RequestDispatcher disp = request.getRequestDispatcher("login.html");
				disp.include(request, response);
				out.println("*** Invalid Credentials ***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		if (user.equals("Naresh") && pwd.equals("Suvvada")) {
//			RequestDispatcher disp = request.getRequestDispatcher("menu.html");
//			disp.forward(request, response);
//		} else {
//			RequestDispatcher disp = request.getRequestDispatcher("login.html");
//			disp.include(request, response);
//			out.println("Invalid Credentials...");
//		}
	}

}

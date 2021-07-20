package com.java.infinite;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookieServlet
 */
public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie ckShrushti = new Cookie("Shrushti", "88");
		ckShrushti.setMaxAge(1000*60*60*24);
		response.addCookie(ckShrushti);
		
		Cookie ckYashik = new Cookie("Yashik", "90");
		ckShrushti.setMaxAge(1000*60*60*24);
		response.addCookie(ckYashik);
		
		Cookie ckPavan = new Cookie("Pavan", "98");
		ckShrushti.setMaxAge(1000*60*60*24);
		response.addCookie(ckPavan);
		
		Cookie ckNaresh = new Cookie("Naresh", "88");
		ckShrushti.setMaxAge(1000*60*60*24);
		response.addCookie(ckNaresh);
		
		PrintWriter out = response.getWriter();
		out.println("Cookies Created Successfully...");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

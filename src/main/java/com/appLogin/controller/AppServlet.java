package com.appLogin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class AppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AppServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		handleRequest(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		handleRequest(request, response);
	}

	private void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("request.getPathInfo()"+ request.getPathInfo());
		
		System.out.println("request.getLocalAddr()"+ request.getLocalAddr());
				System.out.println("request.getPathInfo()"+request.getPathInfo());
						System.out.println(request.getRemoteAddr());
								System.out.println(request.getRemoteHost());
										System.out.println(request.getRemoteUser());
												System.out.println(request.getRequestURI());
														System.out.println(request.getRequestURL());
																System.out.println(request.getServerName());
																		System.out.println(request.getServletPath());
		if(request.getServletPath() == null)
			request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
		
		
	}
}

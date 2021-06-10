package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.ict.model.Bye;
import com.ict.model.Hello;
import com.ict.model.Hi;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyController
 */
@WebServlet("/MyController")
public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		String path = null;
		String cmd = request.getParameter("cmd");
		if(cmd.equalsIgnoreCase("Hello")){
			Hello hello = new Hello();
			path = hello.exec(request, response);
			
		}else if(cmd.equalsIgnoreCase("Hi")){
			Hi hi = new Hi();
			path = hi.exec(request, response);
		}else if(cmd.equalsIgnoreCase("bye")){
			Bye bye = new Bye();
			path = bye.exec(request, response);
		
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}

}

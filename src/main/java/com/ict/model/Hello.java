package com.ict.model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Hello implements Command{
	public String exec(HttpServletRequest request, HttpServletResponse response) {
	String result = "view/hello_result.jsp";
	request.setAttribute("name", "홍길동");
	request.setAttribute("age", 24);
	request.setAttribute("gender", true);
	
	return result;
	}
	
	
}

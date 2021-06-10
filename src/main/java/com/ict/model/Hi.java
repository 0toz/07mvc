package com.ict.model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Hi implements Command{
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String result = "view/hi_result.jsp";
		request.setAttribute("country", "대한민국");
		request.setAttribute("city", "서울");
		
		
		return result;
		
		
	}
}

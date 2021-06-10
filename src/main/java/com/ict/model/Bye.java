package com.ict.model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Bye implements Command{
	public String exec(HttpServletRequest request, HttpServletResponse response) {
	String result = "view/bye_result.jsp";
	String[] person= {"손흥민","토트넘","1992년생","강원도"};
	request.setAttribute("person", person);
	return result;
	}
}

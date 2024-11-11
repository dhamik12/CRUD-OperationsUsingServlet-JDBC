package com.soumik.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName=request.getParameter("name");
		String userCourse=request.getParameter("course");
		String userBatch=request.getParameter("batch");
		String userPhoneNumber=request.getParameter("phNumber");
		String userLocation=request.getParameter("location");
		
		System.out.println(userName+":"+userCourse+":"+userBatch+":"+userPhoneNumber+":"+userLocation);
		
		
	}

}

package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProductDetails() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside doGet() of ProductDetails Servlet");
		String productId=request.getParameter("productId");
		System.out.println("Selected Product Id is :"+productId);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside doPost() of ProductDetails Servlet");
	}

}

package demoServlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet // extends to make a normal class into a servlet 
{
	
						/**
						 * we can also use doGet() and doPost() instead of service()
						 * whenever we use doGet(), in the HTML form we have to specify the method="get" 
						 * and same for the doPost() otherwise, we will get an 405 error.
						 * ex. public void doGet/doPost(HttpServletRequest req, HttpServletResponse res)
						 * @throws ServletException 
						 */
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));// to hold the client input 
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
						/*
						 * Instead of printing result from this file , we can divert this servlet to different servlet 
						 * by calling a servlet(SqSevlet) inside a servlet(AddServlet) using RequestDispatcher or sendRedirect()
						 * sendRedirect(), is useful when u want to client know that, the response is getting from different servlet
						 * ex. when we buy some item from amazon, it redirect us to the payment gateway any telling us
						 * that now you are redirecting to the payment gateway
						 */
		
//		PrintWriter out = res.getWriter();
//		out.print("Result is "+k);
		
		     
		
		
		   // RequestDispatcher() - call a servlet from a servelet
		
//        req.setAttribute("k", k); 
//		RequestDispatcher rd = req.getRequestDispatcher("sq"); // sq is the servlet name which we map in web.xml
//		rd.forward(req, res);
		
		   // sendRedirect() -   call a servlet from a servelet
		
//		 res.sendRedirect("sq?k="+k); // URL Rewriting - here we are passing the value of k 
		 
		
		
		   // session-managment and cookies
		
		Cookie cookie = new Cookie("k",k + "");
		res.addCookie(cookie);
		 
		
		res.sendRedirect("sq?k="+k);
		 
		 
	}

}

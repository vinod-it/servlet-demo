package demoServlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{
		
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
			
			
			// to use RequestDespatch() , Here we are receiving the parameter from the AddServlet-req.setAttribute() 
//			int k = (int)req.getAttribute("k");
			
			
			
			int k =0;
			
			Cookie cookie[] = req.getCookies(); // holding the array of client's request all cookie mentioned in Addservlet{}
			
			for(Cookie c :cookie) { //getCookies gives the list of all cookies, so we need to fetch the required cookie from the array
				
				if(c.getName().equals("k")) { // to get the value of k's cookie only
					k=Integer.parseInt(c.getValue());
				}
			}
			
			
			
			
			
			      // to use res.sendRedirect() 
//			int k = Integer.parseInt(req.getParameter("k")); 
			
			k = k*k;
			
			
			
			
			PrintWriter out = res.getWriter();// getWriter() gives the obj of PrintWwriter(concrete class) which has methods  like println(), print(), and printf()
			out.println("This is RequestDispatcher from another java file and square of addition of two numbers is "+k);
		}
}

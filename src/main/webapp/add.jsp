<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%
		   int a = Integer.parseInt(request.getParameter("num1"));
		   int b = Integer.parseInt(request.getParameter("num2"));

		   int c = a+b;
		   
		  /*
		  PrintWriter out = response.getWriter();
		  
		  no need to make the obj of Printwrite as jsp gives it by default 
		  same for HttpServletRequest and HttpServletResponse too
		  
		  */
		   
		   out.println("Output : "+c);
		
		%>
</body>
</html>
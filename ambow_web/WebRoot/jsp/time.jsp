<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'time.jsp' starting page</title>
  </head>
  
  <body>
  
  
			<% 
				
				Date now = new Date();
			
				out.println(now);
			%>
			
			<hr>
			
			<%!
				int i =10;
			
			%>
			<%=i %>
  </body>
</html>








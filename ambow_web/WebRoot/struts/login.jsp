<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>Test Struts Demo</title>

  </head>
  
  <body>
  	<font color="blue"><h2 align="center">Struts Demo</h2></font>
	<hr>
		<form action="${pageContext.request.contextPath}/student/login.do" method="post">
		
				UserName:<input name="name" type="text">
				
				Password:<input name="password" type="password">
				
				<input type="submit" value="login" >
				
			
		</form>  
  </body>
</html>









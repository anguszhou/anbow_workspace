<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>Test Struts Demo</title>

  </head>
  
  <body>
  	<font color="blue"><h2 align="center">Struts Demo success jsp</h2></font>
	<hr>
	
		welcome ${student.name} to ambow!
		
		
			<a href="${pageContext.request.contextPath}/student/logout.do">logout</a>
  </body>
</html>









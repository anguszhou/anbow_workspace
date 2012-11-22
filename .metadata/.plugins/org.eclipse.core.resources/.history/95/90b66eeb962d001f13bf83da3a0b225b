<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>Untitled</title>
	</head>
	<body>
		<h2 align="center">show student use jsp</h2>
		<hr/>
		<table align="center" border="1" width="900" height="70" bgcolor="yellow">
			<tr align="center">
				<td>INDEX</td>
				<td>ID</td>
				<td>NAME</td>
				<td>PASSWORD</td>
			</tr>
		
			<c:forEach items="${studentList}" var="student" varStatus="status">
			<tr align="center">
				<td>${status.count}</td>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.password}</td>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>
		
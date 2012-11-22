<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>Untitled</title>
	</head>
	<body>
		<h2 align="center">show student use jsp</h2>
		<form action="/ambowweb/student/login.func" method="post">
			userName :<input name="username" type="text">
	
			password: <input name="password" type="password">
			
			<input type="submit" value="login">
		</form>
	</body>
</html>
		
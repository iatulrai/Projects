<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>dynamic page using Servlet</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/welcome" method="get">
		Enter your name:<input type="text" name="name"><br> 
		<input type="submit" value="login">
	</form>

</body>
</html>
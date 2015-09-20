<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Registration Form</title>
</head>
<body>
	<form action="process.jsp" method="post">
		<input type="text" name="uname" value="Name..." onclick="this.value" /><br>
		<input type="text" name="uemail" value="Email..." onclick="this.value" /><br>
		<input type="password" name="upass" value="Password..."
			onclick="this.value" /><br> <input type="submit"
			value="Register">

	</form>

</body>
</html>
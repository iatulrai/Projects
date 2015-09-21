<%@ page import="registration.LoginDao" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<jsp:useBean id="obj" class="registration.LoginBean"></jsp:useBean>
<jsp:setProperty property="*" name="obj" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login here</title>
</head>
<body>

	<%
		boolean status = LoginDao.validate(obj);

		if (status) {
			out.print("You are successfully logged in :)");
			session.setAttribute("session", "TRUE");
		} else {
			out.print("Sorry :( email or password is wrong");
		}
	%>
	<br>

	<a href="index.jsp">Click here to login</a>|  


</body>
</html>
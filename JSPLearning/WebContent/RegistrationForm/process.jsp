<%@ page import="registration.RegisterDao"%>
<jsp:useBean id="obj" class="registration.User"></jsp:useBean>
<jsp:setProperty property="*" name="obj" />
<html>
<head>
</head>
<body>

	<%
		int status = RegisterDao.register(obj);
		if (status > 0)
			out.print("You are successfully registered");
	%>

</body>
</html>
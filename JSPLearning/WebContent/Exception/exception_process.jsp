<%@ page errorPage="exception_error.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exception handling in JSP</title>
</head>
<body>

	<%
		String num1 = request.getParameter("n1");
		String num2 = request.getParameter("n2");

		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		int c = a / b;
		out.print("Division of the number is : " + c);
	%>

</body>
</html>
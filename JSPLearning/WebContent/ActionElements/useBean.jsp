<jsp:useBean id="obj" class="com.jsp.Calculator" />
<html>
<head>

</head>
<body>



	<%
		int m = obj.cube(5);
		out.print("cube of 5 is " + m);
	%>

</body>
</html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP set and get action tag</title>
</head>
<body>

	<jsp:useBean id="u" class="com.jsp.SetAndGetUser"></jsp:useBean>
	<jsp:setProperty property="*" name="u" />

	Records:
	<br>

	<jsp:getProperty property="name" name="u" /><br>
	<jsp:getProperty property="password" name="u" /><br>
	<jsp:getProperty property="email" name="u" /><br>

</body>
</html>
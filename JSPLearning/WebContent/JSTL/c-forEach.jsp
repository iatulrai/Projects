<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>

	<c:forEach var="number" begin="1" end="100">
		<c:out value="${number}"></c:out>
	</c:forEach>

</body>
</html>
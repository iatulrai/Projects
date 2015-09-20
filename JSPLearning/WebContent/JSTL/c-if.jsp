<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>jsp</title>
</head>
<body>

	<c:set var="num" value="${300 }"></c:set>

	<c:if test="${num <500 }">
		<c:out value="number is less than 500"></c:out>

	</c:if>




</body>
</html>
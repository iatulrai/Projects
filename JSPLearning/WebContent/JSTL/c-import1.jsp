<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Atul Rai</h1>
<hr/>

<c:import var="data" url="http://www.google.com"></c:import>

<h2>Data is :</h2>

<c:out value="${data}"></c:out>

</body>
</html>
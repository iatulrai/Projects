<%@page import="java.io.FileInputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String filename = "india.jpg";
		String filepath = "D:\\Work-Study\\JSP\\UploadFile\\";

		response.setContentType("APPLICATION/OCTET-STREAM");

		response.setHeader("Content-Disposition", "attachment; filename=\""
				+ filename + "\"");

		FileInputStream fileInputStream = new FileInputStream(filepath
				+ filename);
		
		int i;
		
		while((i=fileInputStream.read()) != -1){
			out.write(i);
		}
		
		fileInputStream.close();
		
	%>

</body>
</html>
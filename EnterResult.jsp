<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		request.setAttribute("msg", "<h3 style='color:green;'>Marks Entered Successfully...</h3>");
	%>
	
	<%@include file="tLoginSuccess.jsp" %>
</body>
</html>
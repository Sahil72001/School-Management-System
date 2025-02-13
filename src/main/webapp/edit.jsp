<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.StudentBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%
		StudentBean sb=(StudentBean)application.getAttribute("sb");
	%>
	<div class="outer">
	<div class="inner">
	
	<form action="edit" method="post">
		Student Class:<input class="insert" type="text" name="sClass" value=<%= sb.getsClass() %>><br>
		Student Section:<input class="insert" type="text" name="section" value=<%= sb.getsSection() %>><br>
		Student Address:<input class="insert" type="text" name="sAddr" value=<%= sb.getsAddress() %>><br>
		Student Contact:<input class="insert" type="text" name="sContact" value=<%= sb.getsContact() %>><br>
		Student Mail-Id:<input class="insert" type="text" name="sMid" value=<%= sb.getsMid() %>><br>
		<input class="one" type="submit" value="Update Profile">
	</form>
	</div>
	</div>
</body>
</html>
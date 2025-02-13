<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<div class="outer">
    <form action="tConfirmOTP" method="post">
    <div class="inner">
	Enter OTP:<input class="insert" type="text" name="otp">
	<input class="two" type="submit" value="Submit">
	<%
    	out.println("<h2>Your Otp is: "+(int) application.getAttribute("otp")+"</h2>");
        //application.removeAttribute("otp");
    %>
	</div>
	</form>
	</div>
</body>
</html>
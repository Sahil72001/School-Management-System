<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.TeacherBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f4f4f4;
            backdrop-filter:blur(20px);
            color:black;
        }
        td
        {
          color:white;
          
        }
    </style>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<div class="outer">
	<h1 style="color:white;text-decoration:underline;">Edit Teacher Profile</h1>
	<div class="innerrr">
	<%
		TeacherBean tb=(TeacherBean)application.getAttribute("tb");
	%>
	
	<form action="tEdit" method="post">
		Teacher Subjects:<input class="insert" type="text" name="tSub" value=<%= tb.gettSubjects() %>><br>
		Teacher Salary:<input class="insert" type="text" name="tSal" value=<%= tb.gettSalary() %>><br>
		Teacher Address:<input class="insert" type="text" name="tAddr" value=<%= tb.gettAddress() %>><br>
		Teacher Contact:<input class="insert" type="text" name="tPhn" value=<%= tb.gettContact() %>><br>
		Teacher Mail-Id:<input class="insert" type="text" name="tMid" value=<%= tb.gettMid() %>><br><br>
		<input class="one" type="submit" value="Update Profile" style="width:30%;">
	</form>
	<br>
	  <a href="tLogout"><button class="one" style="width:40%;">Logout</button></a>
	    </div>
	  </div>
</body>
</html>
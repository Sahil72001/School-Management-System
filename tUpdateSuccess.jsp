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
		
		if(tb!=null)
	    {
			out.println("Hii "+tb.gettName()+"<br>");
			out.println("Profile has been Updated...<br>");
	%>
	 <table>
	 	<thead>
	 		<tr>
	 			<th>Faculty-Id</th>
	 			<th>Name</th>
	 			<th>DOB</th>
	 			<th>Gender</th>
	 			<th>Subjects</th>
	 			<th>Salary</th>
	 			<th>Address</th>
	 			<th>Contact</th>
	 			<th>Mail-Id</th>	
	 		</tr>
	 		</thead>
	 		<tbody>
	 			<tr>
	 				<td><%= tb.gettId() %></td>
	 				<td><%= tb.gettName() %></td>
	 				<td><%= tb.getDob() %></td>
	 				<td><%= tb.gettGender() %></td>
	 				<td><%= tb.gettSubjects() %></td>
	 				<td><%= tb.gettSalary() %></td>
	 				<td><%= tb.gettAddress() %></td>
	 				<td><%= tb.gettContact() %></td>
	 				<td><%= tb.gettMid() %></td>
	 			</tr>
	 		</tbody>
	 	
	 </table>
	 <%
	    }
	    else
	    {
	    	out.println("no data found");
	    }
	  %>
	  <br>
	  <a class="refer" href="edit.jsp" style="color: hotpink;">Edit Profile</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	  <a class="refer" href="delete" style="color: hotpink;">Delete Profile</a><br><br>
	  <a href="studentData"><button type="submit" class="one" style="width:40%;">Show Attendance</button></a><br><br>
	  <a href="studentResults"><button type="submit" class="one" style="width:40%;">Show Results</button></a><br><br>
	  <a href="tLoginSuccess.jsp"><button type="submit" class="one" style="width:40%;">Go to Dashboard</button></a><br><br>
	  <a href="logout"><button class="one" style="width:60%;">Logout</button></a><br><br>
	    </div>
	  </div>
	
</body>
</html>
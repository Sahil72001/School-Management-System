<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.TeacherBean" %>
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
	<h1 style="color:white;text-decoration:underline;">Teacher Dashboard</h1>
	<div class="innerrr">
	<%
		out.println((String)request.getAttribute("msg"));
	    out.println("<h1>Teacher Dashboard</h1>");
	    TeacherBean tb=(TeacherBean)application.getAttribute("tb");
	    if(tb!=null)
	    {
	      out.println("Hii "+tb.gettName()+"<br>");
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
	  <a class="refer" href="tEdit.jsp" >Edit Profile</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	  <a class="refer" href="tDelete">Delete Profile</a><br><br>
	  <a href="studentData"><button  class="one" type="submit" style="width:20%;">Show All Students</button></a><br><br>
	  <a href="Marks.html"><button  class="one" type="submit" style="width:20%;">Enter Student Results</button></a><br><br>
	  <a href="studentResults"><button  class="one" type="submit" style="width:20%;">All Student Results</button></a><br><br>
	  <a href="tLogout"><button class="one" style="width:40%;">Logout</button></a>
	  </div>
	  </div>
</body>
</html>
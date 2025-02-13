<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.StudentBean"%>
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
	<h1 style="color:white;text-decoration:underline;">Student Attendance Details</h1>
	<div class="innerrr">
    
	<%
		out.println((String)request.getAttribute("msg"));
	    out.println("<h1>Student Dashboard</h1>");
	    StudentBean sb=(StudentBean)application.getAttribute("sb");
	    
	    if(sb!=null)
	    {
	    	out.println("Hii "+sb.getsName()+"<br>");
	%>
	  <table>
	  		<thead>
	  		<tr>
	  			<th>Roll-No</th>
	  			<th>Name</th>
	  			<th>Gender</th>
	  			<th>Class</th>
	  			<th>Section</th>
	  			<th>DOB</th>
	  			<th>Contact</th>
	  			<th>Address</th>
	  			<th>Mail-Id</th>
	  		</tr>
	  		</thead>
	  		
	        <tbody>
	        <tr>
	        	<td><%= sb.getsRoll() %></td>
	        	<td><%= sb.getsName() %></td>
	        	<td><%= sb.getsGender() %></td>
	        	<td><%= sb.getsClass() %></td>
	        	<td><%= sb.getsSection() %></td>
	        	<td><%= sb.getDob() %></td>
	        	<td><%= sb.getsContact() %></td>
	        	<td><%= sb.getsAddress() %></td>
	        	<td><%= sb.getsMid() %></td>
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
	  <a class="refer" href="edit.jsp">Edit Profile</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	  <a class="refer" href="delete" >Delete Profile</a><br><br><br>
	  <a href="Result.html"><button class="one" type="submit" style="width:40%;">See Results</button></a><br><br>
	  <a href="attendance.html"><button class="one" type="submit" style="width:40%;">Give Attendance</button></a><br><br>
	  <a href="logout"><button class="one" type="submit" style="width:50%;">Logout</button></a>
	  </div>
	  </div>
</body>
</html>
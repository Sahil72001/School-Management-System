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
	  			<th>Class</th>
	  			<th>Section</th>
	  			<th>Attendance</th>
	  			<th>Attendance Percentage(%)</th>
	  		</tr>
	  		</thead>
	  		
	        <tbody>
	        <tr>
	        	<td><%= sb.getsRoll() %></td>
	        	<td><%= sb.getsName() %></td>
	        	<td><%= sb.getsClass() %></td>
	        	<td><%= sb.getsSection() %></td>
	        	<td><%= sb.getsAttendance() %></td>
	        	<td><%= sb.getAttendancePercent() %>%</td>
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
	  <br><br><br>
	  <a href="logout"><button class="one" style="width:40%;">Logout</button></a>
	    </div>
	  </div>
</body>
</html>
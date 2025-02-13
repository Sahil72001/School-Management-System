<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="test.StudentData"%>
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
	<h1 style="color:white;text-decoration:underline;">All Student Details</h1>
	<div class="innerrr">
	<%
		ArrayList<StudentData> studList=(ArrayList<StudentData>)request.getAttribute("sList");
		Iterator<StudentData> it=studList.iterator();
		
		
	%>
	<table>
	  		<thead>
	  		<tr>
	  			<th>Roll-No</th>
	  			<th>Name</th>
	  			<th>Class</th>
	  			<th>Section</th>
	  			<th>Contact</th>
	  			<th>Attendance</th>
	  			<th>Attendance Percentage(%)</th>
	  			<th>Address</th>
	  			<th>Mail-Id</th>
	  		</tr>
	  		</thead>
	  		
	  		<tbody>
	  		<%
	  		while(it.hasNext())
			{
				StudentData stud=it.next();
	  		%>
	        <tr>
	        	<td><%= stud.sRoll() %></td>
	        	<td><%= stud.sName() %></td>
	        	<td><%= stud.sClass() %></td>
	        	<td><%= stud.sSection() %></td>
	        	<td><%= stud.sContact() %></td>
	        	<td><%= stud.sAttendance() %></td>
	        	<td><%= stud.sAttendancePCT() %>%</td>
	        	<td><%= stud.sAddress() %></td>
	        	<td><%= stud.sMid() %></td>
	        </tr>	
	        <%
			}
	        %>
	        </tbody>
	        
	  </table>
	   <br><br><br>
	  <a href="tLogout"><button class="one" style="width:40%;">Logout</button></a>
	 </div>
	 </div> 
	  		
</body>
</html>
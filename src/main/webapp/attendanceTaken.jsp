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
	<%
		out.println("<h1>Attendance Details</h1>");
	    StudentBean sb=(StudentBean)application.getAttribute("sb"); 
	    //out.println(sb.getsRoll()+"\t"+sb.getsName()+"\t"+sb.getsClass()+"\t"+sb.getsSection()+"\t"+sb.getsAttendance());
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
	  		</tr>
	  		</thead>
	  		
	        <tbody>
	        <tr>
	        	<td><%= sb.getsRoll() %></td>
	        	<td><%= sb.getsName() %></td>
	        	<td><%= sb.getsClass() %></td>
	        	<td><%= sb.getsSection() %></td>
	        	<td><%= sb.getsAttendance() %></td>
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
	  <a href="attendanceDetails"><input type="submit" value="Show Attendance Details"></a>
	  <a href="logout"><input type="submit" value="Logout"></a>
	
</body>
</html>
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
	<div class="innerrr">
	<%
		out.println((String)request.getAttribute("msg"));
		StudentBean sb=(StudentBean)application.getAttribute("sb");
		//out.println(sb.getsRoll()+"\t"+sb.getsName()+"\t"+sb.getsClass()+"\t"+sb.getsSection()+"\t"+sb.getsGender()+"\t"+sb.getDob()+"\t"+sb.getsContact()+"\t"+sb.getsMid()+"\t"+sb.getsAddress()+"\t"+sb.getsAttendance());
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
	  <br><br><br>
	  <a href="logout"><button class="one">Logout</button></a>
	</div>
	</div>    
</body>
</html>
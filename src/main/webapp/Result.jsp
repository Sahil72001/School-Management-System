<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.StudentMarks"
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
	<h1 style="color:white;text-decoration:underline;">Student Result</h1>
	<div class="innerrr">
	<%
		StudentMarks sm=(StudentMarks)request.getAttribute("sm");
		StudentBean sb=(StudentBean)application.getAttribute("sb");
		if(sm!=null)
		{
			out.println("Hii "+sb.getsName()+"<br>");
	%>
	<table>
	  		<thead>
	  		<tr>
	  			<th>Roll-No</th>
	  			<th>Class</th>
	  			<th>Section</th>
	  			<th>MIL</th>
	  			<th>English</th>
	  			<th>THL</th>
	  			<th>Math</th>
	  			<th>Science</th>
	  			<th>Social-Science</th>
	  			<th>Total</th>
	  			<th>Percentage</th>
	  			<th>Grade</th>
	  		</tr>
	  		</thead>
	  		
	        <tbody>
	        <tr>
	        	<td><%= sm.sRoll() %></td>
	        	<td><%= sm.sClass() %></td>
	        	<td><%= sm.sSection() %></td>
	        	<td><%= sm.mil() %></td>
	        	<td><%= sm.eng() %></td>
	        	<td><%= sm.thl() %></td>
	        	<td><%= sm.mat() %></td>
	        	<td><%= sm.sci() %></td>
	        	<td><%= sm.ssc() %></td>
	        	<td><%= sm.tot() %></td>
	        	<td><%= sm.pct() %>%</td>
	        	<td><%= sm.grade() %></td>
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
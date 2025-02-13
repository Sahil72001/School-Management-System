<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="test.StudentMarks"%>
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
	<h1 style="color:white;text-decoration:underline;">All Student Results</h1>
	<div class="innerrr">
	<%
	ArrayList<StudentMarks> allResults=(ArrayList<StudentMarks>)request.getAttribute("allResults");
	Iterator<StudentMarks> it=allResults.iterator();
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
	  		<%
	  		while(it.hasNext())
			{
				StudentMarks stud=it.next();
	  		%>
	        <tr>
	        	<td><%= stud.sRoll() %></td>
	        	<td><%= stud.sClass() %></td>
	        	<td><%= stud.sSection() %></td>
	        	<td><%= stud.mil()%></td>
	        	<td><%= stud.eng()%></td>
	        	<td><%= stud.thl()%></td>
	        	<td><%= stud.mat() %></td>
	        	<td><%= stud.sci() %></td>
	        	<td><%= stud.ssc() %></td>
	        	<td><%= stud.tot() %></td>
	        	<td><%= stud.pct() %>%</td>
	        	<td><%= stud.grade() %></td>
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
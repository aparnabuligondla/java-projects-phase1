<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPEhtml>
<%@ page import="java.util.*" %>
<html>
<head>
<metacharset="ISO-8859-1">
<title>Flight List</title>
</head>
<body>
<br>
<ahref=HomePage.jspstyle="color:black;text-decoration:none;font-size:35px;font-weight:bold;">FlyAway</a>
<br><br>
<%
	@SuppressWarnings("unchecked")
	List<String[]> flights=(List<String[]>)session.getAttribute("flights");
	if(flights!=null){
%>

<h1>Available Flights</h1>

<center>
<tableborder="1">
<tr>
	<th>Name</th>
	<th>Time</th>
	<th>Price</th>
</tr>

<%
	for(String[] flight:flights){
%>

<tr>
<td><%=flight[0]%></td>
<td><%=flight[1]%></td>
<td><%=flight[2]%></td>
</tr>
</table>
</center>
<center><ahref=BookFlight.jsp>Book Now</a></center>
<%
	}
%>
<%
	}
	else{
%>
<h1>There are no available flights</h1>
<%
	}
%>
</body>
</html>

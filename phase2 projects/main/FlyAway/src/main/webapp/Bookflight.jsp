<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPEhtml>
<html>
<head>
<metacharset="ISO-8859-1">
<title>FlyAway</title>
</head>
<body>
<br>
<ahref=HomePage.jspstyle="color:black;text-decoration:none ;font-size:35px;font-weight:bold;">FlyAway</a>
<br><br>

<%
	@SuppressWarnings("unchecked")
	HashMap<String,String> user=(HashMap<String,String>)session.getAttribute("user");
	if(user==null){
		response.sendRedirect("UserPage.jsp");
	}
%>
<palign="center"style="color:green;font-size:40px;font-weight:bold">Flight Booked Successfully</p>
</body>
</html>





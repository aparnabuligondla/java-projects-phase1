<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPEhtml>
<html>
<head>
<metacharset="ISO-8859-1">
<title>Admin Home</title>
</head>
<body>
<br>
<ahref=HomePage.jspstyle="color:black;text-decoration:none ;font-size:35px;font-weight:bold;">FlyAway</a>
<br><br>
<center>
<h1>Insert New Flight Details</h1>

<divstyle="border:3px solid black;width:25%;border-radius:20px;padding:20px" align="center">
<formaction=InsertFlightmethod=post>
	<labelfor=name>Name :-</label><inputtype="text"name=nameid=name/><br><br>
	<labelfor=from>From :-</label><inputtype="text"name=fromid=from/><br><br>
	<labelfor=to>To :-</label><inputtype="text"name=toid=to/><br><br>
	<labelfor=departure>Departure :-</label><inputtype="date"name=departureid=departure/><br><br>
	<labelfor=time>Time :-</label><inputtype="time"name=timeid=time/><br><br>
	<labelfor=price>Price :-</label><inputtype="text"name=priceid=price/><br><br>
	<inputtype=submitvalue=submit/><inputtype=reset/>
</form>
</div>
</center>
<%
	String message=(String)session.getAttribute("message");
	if(message!=null){
%>
<pstyle="color:silver;"><%=message %></p>
<%
		session.setAttribute("message", null);
	}
%>
</body>
</html>

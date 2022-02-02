<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPEhtml>
<html>
<head>
<metacharset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
<br>
<ahref=HomePage.jspstyle="color:black;text-decoration:none ;font-size:35px;font-weight:bold;">FlyAway</a>
<br><br>
<center>
<h2>Admin Login</h2>
<divstyle="border:3px solid black;width:25%;border-radius:20px;padding:20px" align="center">
<formaction=AdminLoginmethod=post>
	<labelfor=email>Email :-</label><inputtype="email"name=emailid=email/><br><br>
	<labelfor=pass>Password :-</label><inputtype="password"name=passwordid=pass/><br><br>
	<inputtype=submitvalue=submit/><inputtype=reset/>
</form>
</div>
</center><br>
<ahref=ForgotPassword.jspstyle="font-size:25;color:red;">Forgot Password</a>

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



Creating a JSP file BookFlight.jsp
•	In the Project Explorer, expand the project FlyAway
•	Expand WebContent. Right click on WebContent. Choose New->JSP File
•	Enter the filename as BookFlight.jsp and click on Finish
•	Enter the following code:
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





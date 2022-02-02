<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPEhtml>
<html>
<head>
<metacharset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<ahref=HomePage.jspstyle="color:black;text-decoration:none ;font-size:35px;font-weight:bold;">FlyAway</a>
<br><br>
<center>
<h2>User Login</h2>
<divstyle="border:2px solid black;width:25%;border-radius:20px;padding:20px" align="center">
<formaction=UserLoginmethod=post>
<table>
<tr>
<td><labelfor=email>Email</label><br></td>
<td><inputtype="email"name=emailid=email/></td>
</tr>
<tr>
<td><labelfor=pass>Password</label><br></td>
<td><inputtype="password"name=passwordid=pass/></td>
</tr>

<tr>
<td><inputtype=submitvalue=submit/></td>
<td><inputtype=reset/></td>
</tr>
</table>
	
</form>
</div>
</center>
<br><br>
<i>New User-Create account</i>
<h4><ahref=UserRegistration.jspstyle="font-size:25;color:red;">Create Account</a></h4>

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

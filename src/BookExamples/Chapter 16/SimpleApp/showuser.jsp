<%@ page import="java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>Welcome</title>
	</head>
	<body>
	<%=new Date().toString()%>
	<hr>
	Hello <b><%=request.getParameter("name")%></b><br><br>
	Your City is <b><%=request.getParameter("city")%></b><br><br>
	
	<a href="user.jsp">Back</a>
	</body>
</html>

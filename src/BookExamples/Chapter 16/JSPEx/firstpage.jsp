<%@ page import="java.util.Date;"%>
<html>
	<head>
		<title>First JSP Page</title>
	</head>  
	<body>
		<%
			out.println(new Date().toString());
		%>
		<br>Hello World! </br>
	</body>
</html>

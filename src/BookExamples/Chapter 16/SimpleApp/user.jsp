<%@ page import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>Welcome</title>
	</head>
	<body>
	<%=new Date().toString()%>
	<hr>
	<h2>Welcome</h2>
		<form action="showuser.jsp">
			<table>
				<tr>
					<td colspan="2" align="center">
						Enter User Information
					</td>
				</tr>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="city"></td>
				</tr>
				<tr>
				<td colspan="2"><input 
					type="submit" value="Enter"></td>
				</tr>
			</table>
		</form>
	</body>
</html>

<%@ page import="com.kogent.ejb.*, javax.naming.*, java.text.*"%>

<%!
private HelloRemote hel = null;
public void jspInit () {
	try {
		InitialContext ctx = new InitialContext();
		hel = (HelloRemote) ctx.lookup("java:comp/env/ejb/HelloBean");
	}
	catch (Exception e) {
		e.printStackTrace ();
	}
}
%>

<%
String result = null;
String name = null;
try { 
	name=request.getParameter("name");
	if(name!=null)
		result = hel.hello(name);
}
	catch (Exception e) {
		result = "Not valid";
	}
%>

<html>
<head>
	<title>Example of Stateless Session Bean</title>
	<link rel="stylesheet" href="mystyle.css" type="text/css"/>
</head>
<body>
<h1>Using Stateless Session Bean</h1>
<br><br>
<form action="hello.jsp" method="POST">
Enter Your Name : <input type="text" name="name">
<br><br><input type="submit" value="Submit"><br><br>
</form>
<%
if(result!=null)
out.println("<b>"+result+"</b>");
%>
</body>
</html>

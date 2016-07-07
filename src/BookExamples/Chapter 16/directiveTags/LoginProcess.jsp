<%@page import="java.sql.*" errorPage="MyError.jsp"%>
<html><body>
<% 
	Connection con=null;
	String uname=request.getParameter("uname");
	String pass=request.getParameter("pass");
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery( 
		"select * from userdetails where uname=\'"+uname+ "\' and pass=\'"+ pass +"\'");
		if (!rs.next()){ 	
%>
User details given for uname : <%=request.getParameter("uname")%> are not valid <br/> Try again
<%@include file="Login.html"%>
</body></html>
<% 
	return; 
	}//if
	}//try
	finally {
		try{con.close();}catch(Exception e){}
	}//finally
%>
This is a Home Page <br/>
Welcome, <%=uname%>
</body></html>

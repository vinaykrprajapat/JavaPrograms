<%@ page import="com.kogent.ejb.*, javax.ejb.*,javax.naming.* ,java.util.logging.*,java.util.*" %>
<%!
private CartRemote cart ;
public void jspInit() {
	try {
		Context c = new InitialContext();
		cart=(CartRemote) c.lookup("java:comp/env/ejb/CartBean");
	} catch(NamingException ne) {
		Logger.getLogger(getClass().getName()).log(Level.SEVERE,"exception caught" ,ne);
		throw new RuntimeException(ne);
	}
}

public void jspDestroy() {
	cart = null;
}
%>
<html>
<head>
	<title>A Stateful Session Bean Implementation.</title>
	<link rel="stylesheet" href="mystyle.css" type="text/css"/>
</head>

<body bgcolor="white">
	<h1>Shopping Cart</h1>
	<hr>
	<h3>Adding Items to Shopping Cart</h3>
	<form method="get">
		Enter Item Name : <input type="text" name="item" size="25">
		<br>
		<input type="submit" value="Add Item">
	</form>

<%
	String item = request.getParameter("item");

		if(item!=null)
			cart.addItem(item);

		Collection items = cart.getItems();

%>
<p>
<%= items %>

</body>
</html>

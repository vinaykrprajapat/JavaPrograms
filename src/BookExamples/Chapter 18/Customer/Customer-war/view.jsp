<%@page import="com.kogent.entity.Customer"%>
<%@page import="com.kogent.servlet.*"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Customer</title>
    </head>
    <body>
    <center><h1>View Customer</h1></center>
    <p>Here is the detailed information on the customer you selected.</p> 
    <hr/>
<%
    Customer customer = (Customer)request.getAttribute(FormConstants.ATTRIBUTE_CUSTOMER);
%>
    <form method="post" action=
      "<jsp:expression>FormConstants.CONTROLLER</jsp:expression>">
<%@include file="customer.jsp"%>
      <input type="hidden" name="<jsp:expression>FormConstants.FIELD_ACTION</jsp:expression>" 
        value="<jsp:expression>FormConstants.ACTION_QUERY</jsp:expression>"/>
      <input type="submit" name="Submit" value="Back"/>
    </form>
    <hr/>
    <p><a href="<jsp:expression>FormConstants.CONTROLLER</jsp:expression>">Return to the
    application top page</a></p>
    <hr/>
    </body>
</html>
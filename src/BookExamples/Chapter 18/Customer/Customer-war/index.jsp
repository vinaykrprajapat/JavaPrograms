<%@page import="com.kogent.servlet.*"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Database</title>
    </head>
    <body>
    <center><h1>Sample Customer Database</h1></center>
    
    <p>This application highlights Java Persistence API and its usage from
    a Java Servlet to build a sample customer database. </p>

    <p>You can start the application and go to the list of customers by
    clicking the "Go" button below. </p>
    <hr/>
    <form action="<jsp:expression>FormConstants.CONTROLLER</jsp:expression>" method="post">
    <input name="<jsp:expression>FormConstants.FIELD_ACTION</jsp:expression>" type="HIDDEN"
        value="<jsp:expression>FormConstants.ACTION_QUERY</jsp:expression>">
    </input>
    <input name="Submit" type="submit" value="Go"/>
    </form>
    <hr/>
     </body>
</html>

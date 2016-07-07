<jsp:useBean id="regform" type="com.kogent.jspex.RegForm" scope="session"/>
<%@page errorPage="Registration.html"%>
<html> 
<body> 
<pre>

<b>User Name   :</b> <jsp:getProperty name="regform" property="userName"/> 

<b>Password    :</b> <jsp:getProperty name="regform" property="password"/>

<b>Email ID    :</b> <jsp:getProperty name="regform" property="email"/>

<b>First Name :</b> <jsp:getProperty name="regform" property="firstName"/>

<b>last Name   :</b> <jsp:getProperty name="regform" property="lastName"/>

<b>Address     :</b> <jsp:getProperty name="regform" property="address"/>

</pre>
<form method=post action="javascript:alert('The remaining process is under development');">
</form>
</body>
</html>

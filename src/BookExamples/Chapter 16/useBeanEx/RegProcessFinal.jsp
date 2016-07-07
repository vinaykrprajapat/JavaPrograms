<%@page errorPage="Registration.html"%>

<jsp:useBean 	id="regform" 
type="com.kogent.jspex.RegForm" scope="session"/>

<jsp:setProperty name="regform" property="firstName" param="first_name"/>
<jsp:setProperty name="regform" property="lastName" param="last_name"/>
<jsp:setProperty name="regform" property="address"/>

<html>
<body> 
<pre>
Your registration details are valid,
<a href="ViewRegistrationDetails.jsp">Click</a> to view Registration Details and confirm.
</pre>
</body>
</html>

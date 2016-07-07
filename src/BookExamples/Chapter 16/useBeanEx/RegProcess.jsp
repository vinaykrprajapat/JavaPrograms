<%@page errorPage="Registration.html"%>
<html>
<body>
<jsp:useBean id="regform" class="com.kogent.jspex.RegForm" scope="session"/> 
<jsp:setProperty name="regform" property="*"/>
<form action="RegProcessFinal.jsp"><pre> <b>
First Name  : <input type="text" name="first_name"/>
Last Name   : <input type="text" name="last_name"/>
Address     : <input type="text" name="address"/> 
<input type="submit" value="Register"/>
</b></pre></form>
</body>
</html>

<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>

This example demonstrates the basic JSTL formatting tags:
<br/><br/>
Locale from client : 
<b><c:out value="${pageContext.request.locale}"/></b> <br/>

<fmt:setBundle basename="ApplicationResources" var="mybundle"/> 

<fmt:message key="welcome.message" bundle="${mybundle}"> 
	<fmt:param value="${param.uname}"/> 
</fmt:message> <br/><br/>

<b>Now testing &lt;fmt:setLocale&gt; tag:</b><br/>
<br/><br/>

Creating a ResourceBundle with client locale and setting it to <i>mybundle1</i>  
 	variable.<br/>

<fmt:setBundle basename="ApplicationResources" var="mybundle1"/> 

Setting the locale to <i>it</i> (italian). <br/>

<fmt:setLocale value="it"/> 

Creating a ResourceBundle with <i>it</i> (italian) locale and setting it to 
 	<i>mybundle2</i> variable. 
<br/><br/>

<fmt:setBundle basename="ApplicationResources" var="mybundle2"/> 
<b>Message using <i>mybundle1</i>:</b> <br/>
	<pre>
		<fmt:message bundle="${mybundle1}" key="welcome.message">
			<fmt:param value="${param.uname}"/> 
		</fmt:message> 
	</pre>
<br/>

<b>Message using <i>mybundle2</i>:</b> <br/>
<pre>
	<fmt:message bundle="${mybundle2}" key="welcome.message">
		<fmt:param value="${param.uname}"/> 
	</fmt:message>
</pre>

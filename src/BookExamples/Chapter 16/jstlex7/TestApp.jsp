<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>

<html> <body>
<%pageContext.setAttribute("mydate",new java.util.Date(),PageContext.PAGE_SCOPE);%>
Current Date and Time: 
<b><c:out value="${mydate}"/></b> <br/>

Formatting Date: <br/><br/>
<fmt:setLocale value="it"/>
In Italy:
<pre>
	Default pattern:<b>
	<fmt:formatDate type="both" value="${mydate}"/></b>
	Using pattern (dd-MMM-yyyy hh:mm:ss): <b>
<fmt:formatDate type="both" value="${mydate}" pattern="dd-MMM-yyyy hh:mm:ss"/> </b>
</pre>
<br/>

In US:
<fmt:setLocale value="en_US"/>
<pre>
	Default pattern:<b>
	<fmt:formatDate type="both" value="${mydate}"/></b>
	Using pattern (dd-MMM-yyyy hh:mm:ss): <b>
<fmt:formatDate type="both" value="${mydate}" pattern="dd-MMM-yyyy hh:mm:ss" 
 	var="fmt_mydate"/> </b>
	<b><c:out value="${fmt_mydate}"/></b>
</pre>
<br/>
After parsing the formatted mydate: <fmt:parseDate value="${fmt_mydate}" type="both" 
 	pattern="dd-MMM-yyyy hh:mm:ss"/>

</body></html>

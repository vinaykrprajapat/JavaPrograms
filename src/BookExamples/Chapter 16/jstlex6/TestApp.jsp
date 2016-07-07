<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html> <body>
My Number: 
<b><c:out value="${param.mynumber}"/></b> <br/>
Formatting My Number: <br/><br/>
<fmt:setLocale value="it"/>
In Italy:
<pre>
	Default pattern:<b>
	<fmt:formatNumber type="currency" value="${param.mynumber}"/></b>
	Using pattern (0,00,00.0000): <b>
<fmt:formatNumber type="currency" value="${param.mynumber}" pattern="00,0,00.0000"/> </b>
</pre>
<br/>
In US:
<fmt:setLocale value="en_US"/>
<pre>
	Default pattern:<b>
	<fmt:formatNumber type="currency" value="${param.mynumber}"/></b>
	Using pattern (0,00,00.0000):<b>
<fmt:formatNumber type="currency" value="${param.mynumber}" currencySymbol="$"  
 	pattern="0,00,00.0000" var="fmt_mynumber"/> 
	<c:out value="${fmt_mynumber}"/></b>
</pre>
<br/>
After parsing the formatted mynumber: <fmt:parseNumber value="${fmt_mynumber}" 
 	type="currency" pattern="0,00,00.0000"/>
</body></html>

<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html>
	<body>
		<b>Requested URL:&nbsp;&nbsp;</b><br/>
		<c:out value="${pageContext.request.requestURL}"/><br/>
		<br/><h4>Request Path information:</h4>
		<table border='1'>
			<tr><th>Name</th><th>Value</th></tr>
			<tr><td>HTTP Request method</td>
			<td><c:out value="${pageContext.request.method}"/></td></tr>
			<tr><td>Request URI</td>
			<td><c:out value="${pageContext.request.requestURI}"/></td></tr>
			<tr><td>Context Path</td>
			<td><c:out value="${pageContext.request.contextPath}"/></td></tr>
			<tr><td>Servlet path</td>
			<td><c:out value="${pageContext.request.servletPath}"/></td></tr>
			<tr><td>Path info</td>
			<td><c:out value="${pageContext.request.pathInfo}"/></td></tr>
			<tr><td>Path translated</td>
			<td><c:out value="${pageContext.request.pathTranslated}"/></td></tr>
		</table><br/>
		<h4>Accessing Request Parameter value:</h4>
		Value of parameter <b>uname</b> is: 
		<b><c:out value="${param.uname}"/></b>
	</body>
</html>

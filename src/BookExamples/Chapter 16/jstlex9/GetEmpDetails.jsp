<%@taglib uri="http://java.sun.com/jstl/sql" prefix="sql"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>

<c:if test="${!empty param.language}" var="lang_flag">
	<fmt:setLocale value="${param.language}"/>
</c:if>
<c:if test="${!empty param.country && lang_flag}">
	<fmt:setLocale value="${param.language}_${param.country}"/>
</c:if>

<sql:setDataSource driver="com.mysql.jdbc.Driver" url=" 
 	jdbc:mysql://localhost:3306/sample" user="root" password="root" var="myds" 
 	scope="request"/>

<sql:query sql="select empno,deptno,ename,sal,hiredate from employee" var="result" 
 	scope="page" dataSource="${requestScope.myds}"/>

<html> <body>

	Display Currency and Date in: <pre>
 	<a href="GetEmpDetails.jsp?language=en&country=US">English(US)</a> <a 
 	href="GetEmpDetails.jsp?language=en&country=gb">English(UK)</a> <a 
 	href="GetEmpDetails.jsp?language=en&country=AU">English(AU)</a> <a 
 	href="GetEmpDetails.jsp?language=it">Italian</a>    
	</pre>
	<table border="1">

	<tr>
		<c:forEach items="${pageScope.result.columnNames}" var="colname">
		<th><c:out value="${colname}"/></th>
		</c:forEach>
	</tr>

	<c:forEach items="${pageScope.result.rows}" var="row">
	<tr> <td>
		<c:out value="${row.empno}"/>
	</td> <td>
		<c:out value="${row.deptno}"/>
	</td> <td>
		<c:out value="${row.ename}"/>
	</td> <td>
		<fmt:formatNumber value="${row.sal}" type="currency"/>
	</td> <td>
		<fmt:formatDate value="${row.hiredate}" type="date"/>
	</td> </tr>
	</c:forEach>
	</table>

</body> </html>

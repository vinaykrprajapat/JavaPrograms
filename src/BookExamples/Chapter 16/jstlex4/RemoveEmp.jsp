<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/sql" prefix="sql"%>
<sql:setDataSource driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/sample"
user="root"
password="root" var="myds" scope="request"/>
<sql:update dataSource="${requestScope.myds}" sql="delete from emp where empno=?" 
 	var="count">
<sql:param value="${param.empno}"/>
</sql:update>

<c:if test="${count eq 1}">
	<b>Employee Removed</b>
</c:if>
<c:if test="${count ne 1}">
	<b>Problem in removing Employee</b>
</c:if>
<br/>
<a href="GetEmpDetails.jsp">View Employees</a>

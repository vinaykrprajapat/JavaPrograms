<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html> 
    <body> 
	<table border="1">
		<tr><th>Empno</th>
		<th>Name</th><th>DeptNo</th>
		<th>Sal</th></tr>
		<c:forEach items="${sessionScope.emps}" var="emp">
			<tr> <td>
			<c:out value="${emp.empNo}"/>
			</td> <td>
			<c:out value="${emp.name}"/>
			</td> <td>
			<c:out value="${emp.deptNo}"/>
			</td> <td>
			<c:out value="${emp.sal}"/>
			</td> </tr>
		</c:forEach>
            </table> 
    </body> 
</html>

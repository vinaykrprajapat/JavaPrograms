<%@taglib uri="http://java.sun.com/jstl/sql" prefix="sql"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>

<sql:setDataSource driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/sample"
user="root"
password="root" var="myds" scope="request"/> 

<sql:query sql="select * from emp" var="result" scope="page" 
 	dataSource="${requestScope.myds}"/> 
<html>
    <body>
	<table border="1">
		<tr>
		<c:forEach items="${pageScope.result.columnNames}" var="colname">
			<th><c:out value="${colname}"/></th>
		</c:forEach>
		<th>&nbsp;</th>
		</tr>
		<c:forEach items="${pageScope.result.rows}" var="row">
			<tr> 
                            <td>
                                <c:out value="${row.empno}"/>
                            </td>
                            <td>
                                <c:out value="${row.empname}"/>
                            </td>
                            <td>
                                <c:out value="${row.deptno}"/>
                            </td>
                            <td>
                                <c:out value="${row.sal}"/>
                            </td> 
                            <td>
                                <a href= "RemoveEmp.jsp?empno=<c:out value= "${row.empno}"/>">
                                Remove</a> 
                             </td> 
                        </tr>
		</c:forEach>
	</table> 
    </body>
</html>

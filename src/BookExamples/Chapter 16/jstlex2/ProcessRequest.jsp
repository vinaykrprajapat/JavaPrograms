<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html>
	<body>
		<c:if test="${param.submit eq 'Add'}">
 		Sum of <c:out value="${param.op1}"/> and <c:out value="${param.op2}"/> is <c:out 
 		value="${param.op1 + param.op2}"/>
		</c:if>
		<c:if test="${param.submit eq 'Subtract'}">
 		<c:out value="${param.op1}"/> - <c:out value="${param.op2}"/> = <c:out 
 		value="${param.op1 - param.op2}"/>
		</c:if>
	</body>
</html>

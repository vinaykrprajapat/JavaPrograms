<%
	int f1=Integer.parseInt(request.getParameter("field1"));
	int f2=Integer.parseInt(request.getParameter("field2"));
	int result=f1+f2;
%>
<jsp:forward page="/Result.jsp">
<jsp:param name="result" value="<%=result%>"/> </jsp:forward>

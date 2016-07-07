<%
	String result=request.getParameter("result");
	String submit=request.getParameter("submit");
%>
<html><body><center>
	<%
		if (submit.equals("Add")){
	%>
	Result of Add : <%=result%>
	<%
		} else {
	%>
	Result of Sub : <%=result%>
	<%}%>
	</center>
	<jsp:include page="/Home.html"/>
</body></html>

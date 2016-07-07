<%@page errorPage="/Home.html"%>
<%
String s1=request.getParameter("field1");
String s2=request.getParameter("field2");
Integer.parseInt(s1); Integer.parseInt(s2);
String submit=request.getParameter("submit");
if (submit.equals("Add")) {
%>
	<jsp:forward page="/AddJsp.jsp"/>
<%
} else if (submit.equals("Sub")){
%>
	<jsp:forward page="/SubJsp.jsp"/>
<%
} else {
%>
	<jsp:forward page="/Home.html"/>
<%}%>

<HTML>
	<HEAD>
	<TITLE> Intermediate </TITLE></HEAD>

	<BODY>
	<%
		if("Yes".equals(request.getParameter("other")))
		{
			pageContext.forward("other");
		}
		else
		{
			out.println("You selected the No option, please select Yes to display the details");
		}
	%>
	</BODY>
</HTML>

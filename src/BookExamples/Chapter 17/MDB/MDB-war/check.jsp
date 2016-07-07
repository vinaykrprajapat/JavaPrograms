<%@ page import="jms.*,
                  java.text.NumberFormat"%>
 
<%

  long sent = Long.parseLong(request.getParameter ("sent"));
  CalculationRecord rc = RecordManager.getRecord(sent);
  if (rc == null) {
%>

<html>
<head><meta http-equiv="REFRESH" content="3;
                    URL=check.jsp?sent=<%=sent%>"></head>
  <body>
    Please wait while I am checking whether the message has arrived.<br/>
    <a href="calculator.jsp">Go back to Calculator</a>
  </body>
</html>

<%
    return;
  } else {
    NumberFormat nf = NumberFormat.getInstance();
    nf.setMaximumFractionDigits(2);
%>

<html>
  <body>
    The message was sent at<br/>
      <b><%=rc.sent%></b>.<br/><br/>
    The message was processed at<br/>
      <b><%=rc.processed%></b>.<br/><br/>
    The calculation result (total investment) is
      <b><%=nf.format(rc.result)%></b>.<br/>
    <a href="calculator.jsp">Go back to Calculator</a>
  </body>
</html>

<%
    return;
  }
%>
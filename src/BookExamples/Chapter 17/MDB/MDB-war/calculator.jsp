<%@ page import="jms.*, javax.naming.*,javax.jms.Queue,javax.jms.*,java.text.*,java.sql.Timestamp"%>

<%
  if ("send".equals(request.getParameter ("action"))) {

    QueueConnection cnn = null;
    QueueSender sender = null;
    QueueSession sess = null;
    Queue queue = null;

    try {
      InitialContext ctx = new InitialContext();
      queue = (Queue) ctx.lookup("jms/Queue");
      QueueConnectionFactory factory =
          (QueueConnectionFactory) ctx.lookup("jms/ConnectionFactory");
      cnn = factory.createQueueConnection();
      sess = cnn.createQueueSession(false,
                  QueueSession.AUTO_ACKNOWLEDGE);

    } catch (Exception e) {
      e.printStackTrace ();
    }

    TextMessage msg = sess.createTextMessage(
        request.getParameter ("start") + "," +
        request.getParameter ("end") + "," +
        request.getParameter ("growthrate") + "," +
        request.getParameter ("saving")
    );
    // The sent timestamp acts as the message's ID
    long sent = System.currentTimeMillis();
    msg.setLongProperty("sent", sent);

    sender = sess.createSender(queue);
    sender.send(msg);
    // sess.commit ();
    sess.close ();
%>

<html>
<head><meta http-equiv="REFRESH" content="3;URL=check.jsp?sent=<%=sent%>">
<link rel="stylesheet" href="mystyle.css" type="text/css"/>
</head>
  <body>
    Please wait while I am checking whether the message has arrived.<br/>
    <a href="calculator.jsp">Go back to Calculator</a>
  </body>
</html>

<%
    return;

  } else {

    int start = 25;
    int end = 65;
    double growthrate = 0.08;
    double saving = 300.0;
%>

<html>
<body>
<p>Investment calculator<br/>
<form action="calculator.jsp" method="POST">
  <input type="hidden" name="action" value="send">
  Start age = <input type="text" name="start" value="<%=start%>"><br/>
  End age   = <input type="text" name="end" value="<%=end%>"><br/>
  Annual Growth Rate = <input type="text" name="growthrate" value="<%=growthrate%>"><br/>
  Monthly Saving = <input type="text" name="saving" value="<%=saving%>"><br/>
  <input type="submit" value="Calculate">
  <INPUT type="button" value="Close Window" onClick="window.close()">
</form>
</p>
</body>
</html>

<%
    return;
  }
%>
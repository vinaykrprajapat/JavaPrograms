<%@page import="java.util.List"%>
<%@page import="com.kogent.entity.Customer"%>
<%@page import="com.kogent.servlet.*"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer List</title>
    </head>
    <body>
    <center><h1>Sample Customer List</h1></center>
    <p>Here is the list of customers. You can view more details on a customer
    by clicking the customer name. 
    <hr/>
    <table>
      <tr bgcolor="#99CCCC">
        <td><strong>Company Name</strong></td>
        <td><strong>Customer Name</strong></td>
      </tr>
<%
    List<Customer> customers =
            (List<Customer>)request.getAttribute(FormConstants.ATTRIBUTE_CUSTOMER_LIST);
    if (customers == null || customers.size() == 0) {
%>
      <tr>
        <td colspan="2"><i>No customers</i></td>
      </tr>
<%
    } else {
        for (Customer cust: customers) {
            String actionUrl = UrlUtils.makeCustomerViewUrl(
                    cust.getCustomerId().toString());
%>
      <tr>
        <td><jsp:expression>cust.getCompany()</jsp:expression></td>
        <td><a href="<jsp:expression>actionUrl</jsp:expression>">
            <jsp:expression>cust.getFirstName() +  " " +  cust.getLastName()</jsp:expression>
            </a>
         </td> 
      </tr>
<%
        }
    }
%>
    </table>
    <hr/>
    </body>
</html>

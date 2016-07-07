<table>
  <tr>
    <td colspan="1" align="right">Company Name: </td>
    <td colspan="5">
      <input type="text" name="<jsp:expression>FormConstants.FIELD_COMPANY</jsp:expression>"
        value="<jsp:expression>customer.getCompany()</jsp:expression>"
        size="60"/>
    </td>
  </tr>
  <tr>
    <td align="right">First Name: </td>
    <td colspan="2">
      <input type="text" name="<jsp:expression>FormConstants.FIELD_FNAME</jsp:expression>"
        value="<jsp:expression>customer.getFirstName()</jsp:expression>"
        size="20"/>
    </td>
    <td align="right">Last Name: </td>
    <td colspan="2">
      <input type="text" name="<jsp:expression>FormConstants.FIELD_LNAME</jsp:expression>"
        value="<jsp:expression>customer.getLastName()</jsp:expression>"
        size="20"/>
    </td>
  </tr>
  <tr>
    <td align="right">Email: </td>
    <td colspan="2">
      <input type="text" name="<jsp:expression>FormConstants.FIELD_EMAIL</jsp:expression>"
        value="<jsp:expression>customer.getEmailAddress()</jsp:expression>"
        size="20"/>
    </td>
    <td align="right">Phone: </td>
    <td colspan="2">
      <input type="text" name="<jsp:expression>FormConstants.FIELD_PHONE</jsp:expression>"
        value="<jsp:expression>customer.getPhoneNumber()</jsp:expression>"
        size="20"/>
    </td>
  </tr>
  <tr>
    <td colspan="1" align="right">Address Line 1: </td>
    <td colspan="5">
      <input type="text" name="<jsp:expression>FormConstants.FIELD_ADDRESS1</jsp:expression>"
        value="<jsp:expression>customer.getAddress1()</jsp:expression>"
        size="60"/>
    </td>
  </tr>
  <tr>
    <td colspan="1" align="right">Address Line 2: </td>
    <td colspan="5">
      <input type="text" name="<jsp:expression>FormConstants.FIELD_ADDRESS2</jsp:expression>"
        value="<jsp:expression>customer.getAddress2()</jsp:expression>"
        size="60"/>
    </td>
  </tr>
  <tr>
    <td align="right">City: </td>
    <td>
      <input type="text" name="<jsp:expression>FormConstants.FIELD_CITY</jsp:expression>"
        value="<jsp:expression>customer.getCity()</jsp:expression>"
        size="25"/>
    </td>
    <td align="right">State: </td>
    <td>
      <input type="text" name="<jsp:expression>FormConstants.FIELD_STATE</jsp:expression>"
        value="<jsp:expression>customer.getState()</jsp:expression>"
        size="15"/>
    </td>
    <td align="right">Zip:</td>
    <td>
      <input type="text" name="<jsp:expression>FormConstants.FIELD_ZIP</jsp:expression>"
        value="<jsp:expression>customer.getZip()</jsp:expression>"
        size="10"/>
    </td>
  </tr>
</table>

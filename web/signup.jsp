<%--
  Created by IntelliJ IDEA.
  User: kaspw
  Date: 9/22/2015
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="${pageContext.request.contextPath}/signup" method="post">
  <table border="1" width="30%" cellpadding="5">
    <thead>
    <tr>
      <th colspan="2">Register</th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <td>First name</td>
      <td><input type="text" name="fname" value="" /></td>
    </tr>
    <tr>
        <td>Second name</td>
        <td><input type="text" name="sname" value="" /></td>
    </tr>
    <tr>
      <td>Email</td>
      <td><input type="text" name="email" value="" /></td>
    </tr>
    <tr>
      <td>Password</td>
      <td><input type="password" name="pass" value="" /></td>
    </tr>
    <tr>
      <td><input type="submit" value="Submit" /></td>
    </tr>
    </tbody>
  </table>
  </form>
</body>
</html>

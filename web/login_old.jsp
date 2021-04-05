<%-- 
    Document   : login
    Created on : 02/04/2021, 7:17:21 PM
    Author     : lilil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/maincss.css">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form action="welcome.jsp" method="post">
      <table>
          <tr><td>Email:</td><td><input type="text" placeholder="Enter Email" name = "email" required= "true"></td></tr>
          <tr><td>Password:</td><td><input type="password" placeholder="Enter password" name = "password" required= "true"></td></tr>
      </table>
  <input type="submit" value="login">
  </form>
        
    </body>
</html>

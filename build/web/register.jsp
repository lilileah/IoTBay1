<%-- 
    Document   : register
    Created on : 22/03/2021, 3:36:15 PM
    Author     : lilil
--%>

<%@page import="uts.isd.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div>
<iframe width="100%" height="80" scrolling="no" src="interface.jsp" title="Interface"></iframe>
</div>
    <head>
        <meta http-equiv="Content-Type" href="css/maincss.css" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <title>Registration Page</title>
    </head>
    <body>
        <h1>Registration form</h1>
  <form action="welcome.jsp" method="post">
      <table>
          <tr><td>Email:</td><td><input type="text" placeholder="Enter Email" name = "email" required= "true"></td></tr>
          <tr><td>Name:</td><td><input type="text" placeholder="Enter Name" name = "name" required= "true"></td></tr>
          <tr><td>Password:</td><td><input type="password" placeholder="Enter password" name = "password" required= "true"></td></tr>
          <tr><td>       
            <label for="lname">gender:</label><br>
            <input type="radio" id="male" name="gender" value="male">
            <label for="male">Male</label><br>
            <input type="radio" id="female" name="gender" value="female">
            <label for="female">Female</label><br>
           </td></tr>
          <tr><td>Terms Of Service:</td><td><input type="checkbox" id="tos" name="tos" value="tos"></td></tr>
      </table>
  <input type="submit" value="register">
  </form>
        
        
    </body>
</html>



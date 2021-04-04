<%-- 
    Document   : main
    Created on : 01/04/2021, 5:34:31 PM
    Author     : lilil
--%>

<%@page import="uts.isd.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <title>Main page</title>
    </head>
    <body>
          
        <%
            User user = (User)session.getAttribute("user");
        %>
        
        <h1>IOT Bay Main Page</h1>
        
        <% if(user == null){ %>
        <a>You are not logged in</a>
        
        <div>
             <a class="mb-2 btn-primary btn"  href="register.jsp" >Register</a>
        </div>
        
        <% }else{ %>
        <p>You are logged in as ${user.name}</p>
        <p>Here are your account details: </p>
        
        <table od="profile_table">
            <thread><th>Name</th><th>Email</th><th>Password</th><th>Gender</th></thread>
            <tr><td>${user.name}</td><td>${user.email}</td><td>${user.password}</td><td>${user.gender}</td></tr>
        </table>
      <div>
             <a class="mb-2 btn-primary btn" href="logout.jsp">Logout</a>
        </div>
        
        <%} %>
        
       
   
        
       
    </body>
</html>

<%-- 
    Document   : welcome
    Created on : 22/03/2021, 3:46:29 PM
    Author     : Tim
--%>

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="uts.isd.model.User"%>
<!DOCTYPE html>
<html>
    <div>
<iframe width="100%" height="80" scrolling="no" src="interface.jsp" title="Interface"></iframe>
</div>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IOTBay Welcome Page</title>
    </head>
    <body>
       
        
        <%
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String username = request.getParameter("username"); //for if the source was Login not Register
            
            if(name==null)
                name = username;
            String pass = request.getParameter("password");     //likewise the above
            if(password == null)
                password = pass;
            %>
            
            
            
             <section class="jumbotron text-center">
        <div class="container">
          <h1 class="jumbotron-heading">Welcome, <%= name%>!</h1>
  
          <p>For identifying purposes, your:</p>
          
          <% if(name != null) {%>
        <p>Username is: <%= username%>.</p>
        <% } %>
        <% if(email != null) {%>
        <p>Email is: <%= email %>.</p>
        <% } %>
        
                <div>
            <a>Click </a>
            <a class="button" href="main.jsp">here</a>
            <a> to proceed to the main page</a>
        </div>
        <p> Not you? <a class="button" href="index.jsp">Click here</a> to return and login in or register to another account.

        
          <p>
            <a href="logout.jsp" class="btn btn-secondary my-2">Log out</a>
          </p>
        </div>
      </section>
            

        <%
        User user = new User(email, name, password, username);
        session.setAttribute("user", user);
        %>
    </body>
</html>

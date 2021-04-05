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
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        
        <%
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String gender = request.getParameter("gender");
            String username = request.getParameter("Username"); //for if the source was Login not Register
            if(name==null)
                name = username;
            String pass = request.getParameter("Password");     //likewise the above
            if(password == null)
                password = pass;
            %>
        
        <h1>Welcome, user!</h1>
        <p>For Identifying purposes, Your: </p>
        <br>
        <% if(name != null) {%>
        <p>Name is: <%= name%>.</p>
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

        <%
        User user = new User(email, name, password, gender);
        session.setAttribute("user", user);
        %>
    </body>
</html>

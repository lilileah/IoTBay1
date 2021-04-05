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
        <link rel="stylesheet" href="css/maincss.css">
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
        <p>Name is: <%= name%>.</p>
        <% if(email != null) {%>
        <p>Email is: <%= email %>.</p>
        <% } %>
        <div>
            <a>Click </a>
            <a class="button" href="main.jsp">here</a>
            <a> to proceed to the main page</a>
        </div>
        <p> Not you? <a class="button" href="interface.jsp">Click here</a> to return and login in or register to another account.d
        
        <%
        User user = new User(email, name, password, gender);
        session.setAttribute("user", user);
 
        
        %>
        

        
    </body>
</html>

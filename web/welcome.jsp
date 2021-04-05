<%-- 
    Document   : welcome
    Created on : 22/03/2021, 3:46:29 PM
    Author     : lilil
--%>

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
            String tos = request.getParameter("tos");
            
        %>
        
        <% if(tos == null){ %>
        <a>Sorry, you must agree to the Terms of Service</a>
        
        <div>
            <a href="register.jsp" >Click here to go back.</a>
        </div>
        
        <% }else{ %>
        <h1>Welcome, <%= name%>!</h1>
        <p>Your Email is <%= email%>.</p>
        <p>Your password is <%= password%>.</p>
        <p>Your gender is <%= gender%>.</p>
        
        <div>
            <a>Click </a>
            <a class="button" href="main.jsp">here</a>
            <a> to proceed to the main page</a>
        </div>
        
        <%} %>
        
        <%
        User user = new User(email, name, password, gender);
        session.setAttribute("user", user);
 
        
        %>
        

        
    </body>
</html>

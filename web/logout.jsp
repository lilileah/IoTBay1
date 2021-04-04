<%-- 
    Document   : logout
    Created on : 01/04/2021, 6:12:06 PM
    Author     : lilil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uts.isd.model.User"%>
<!DOCTYPE html>
<html>
    
            <%
                
           session.invalidate();
        %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
          <div>
              
            <p>You have been logged out.</p>
            <a> Click</a>
            <a class="button" href="main.jsp">here</a>
            <a> to proceed to the main page</a>
        </div>
    </body>
</html>

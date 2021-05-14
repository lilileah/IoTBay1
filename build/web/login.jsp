<%-- 
    Document   : Login
    Created on : 29/03/2021, 6:40:44 PM
    Author     : Dean
--%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="uts.isd.controller.InputFilter"%>
<%@page import="uts.isd.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" rossorigin="anonymous">
        <link href="css/Adjustment.css" rel="stylesheet">
        <title>IOTBay Sign In</title>
    </head>
    <body
        <div>
            <iframe width="100%" height="80" scrolling="no" src="interface.jsp" title="Interface"></iframe>
        </div>         
        <div class = "mb-3">
            <h1 class="centre">Sign In</h1>
            <hr>
        </div>

        
        <c:if test = "${existErr != null}">
            <div class="alert alert-danger my-4" role="alert">
            <c:out value="${existErr}"/>
        </c:if>
         
                
        <c:if test = "${emailErr != null}">
            <div class="alert alert-danger my-4" role="alert">
            <c:out value="${emailErr}"/>
        </c:if>        
                
            
        <div class="mx-auto" style="width: 400px;">
            <form action="LoginServlet" method="POST">

                <!--<label for="Username">Username</label><br>-->
                <input class="mb-2 form-control" type = "text" id="User" name="USERNAME_EMAIL" placeholder="Username (email)"><br>

                <!--<label for="Password">Password</label><br>-->
                <input class="mb-2 form-control" type = "Password" id="Password" name="PASSWORD" placeholder="Password"><br>
                <div>
                    <input class="mb-2 btn-primary btn" type="submit">
                    <input type="hidden" name="submitted" value="yes">
                </div>
<<<<<<< HEAD
                <%
                    InputFilter inFilter = new InputFilter();
                    String submitted = request.getParameter("submitted");
                    String user = null;
                    String email = null;
                    String password = request.getParameter("password");

                    if (submitted != null || email != null && submitted.equals("yes")) //on form submission
                    {
                        email = request.getParameter("Username");
                        user = request.getParameter("Username");

                        if (user != null && inFilter.validateInput(user))
                        {
                            if (user != null && inFilter.IsEmail(user)) {
                                out.println("Its an email.");//testing
                                
                                user = null;//set from database
                                
                                //User userData = new User(email, user, password, null);
                                //session.setAttribute("user", userData);
                            } 
                            else 
                            {
                                out.println("Its a user.");//testing
                                
                                email = null; //set from database
                                
                                //User userData = new User(email, user, password, null);
                                //session.setAttribute("user", userData);
                            }
                        } else 
                        {
                            out.println("Unexpected character.");//testing
                        }
                    }
                %>

=======
                
>>>>>>> main
            </form>
        </div>
        </div>

    </body>
</html>
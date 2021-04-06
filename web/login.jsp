<%-- 
    Document   : Login
    Created on : 29/03/2021, 6:40:44 PM
    Author     : Dean
--%>

<%@page import="uts.isd.model.InputFilter"%>
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
        <div class="mx-auto" style="width: 400px;">
            <form action="welcome.jsp" method="POST">

                <!--<label for="Username">Username</label><br>-->
                <input class="mb-2 form-control" type = "text" id="User" name="username" placeholder="Username or Email"><br>

                <!--<label for="Password">Password</label><br>-->
                <input class="mb-2 form-control" type = "Password" id="Password" name="password" placeholder="Password"><br>
                <div>
                    <input class="mb-2 btn-primary btn" type="submit">
                    <input type="hidden" name="submitted" value="yes">
                </div>
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

                        if (user != null && inFilter.validateInput(user)) //validates input
                        {
                            if (user != null && inFilter.IsEmail(user)) {
                                out.println("Its an email.");//testing
                                
                                user = null;//set from database
                                
                                User userData = new User(email, user, password, null);
                                session.setAttribute("user", userData);
                            } 
                            else 
                            {
                                out.println("Its a user.");//testing
                                
                                email = null; //set from database
                                
                                User userData = new User(email, user, password, null);
                                session.setAttribute("user", userData);
                            }
                        } else 
                        {
                            out.println("Unexpected character.");//testing
                        }
                    }
                %>

            </form>
        </div>
        </div>

    </body>
</html>

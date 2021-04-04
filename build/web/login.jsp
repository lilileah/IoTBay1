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
            <iframe width="100%" scrolling="no" src="interface.jsp" title="Interface"></iframe>
        </div>
        <div class = "mb-4">
            <h1 class="centre">Sign In</h1>
            <hr>
        </div>
        <div class="mb-3 container-sm">
            <form action="welcome.jsp" method="POST">

                <!--<label for="Username">Username</label><br>-->
                <input class="mb-2 form-control" type = "text" id="User" name="Username" placeholder="Username or Email"><br>

                <!--<label for="Password">Password</label><br>-->
                <input class="mb-2 form-control" type = "Password" id="Password" name="Password" placeholder="Password"><br>
                <div>
                    <input class="mb-2 btn-primary btn" type="submit">
                    <input type="hidden" name="submitted" value="yes">
                </div>
                <%
                    InputFilter inFilter = new InputFilter();
                    String submitted = request.getParameter("submitted");
                    String user = request.getParameter("Username");
                    String password = request.getParameter("Password");

                    if (submitted != null && submitted.equals("yes")) //on form submission
                    {
                        if (user != null && inFilter.validateInput(user)) //validates input
                        {
                            if (user != null && inFilter.IsEmail(user)) {
                                out.println("Its an email.");//testing
                            } else {
                                out.println("Its a user.");//testing
                            }
                        } else {
                            out.println("Unexpected character.");//testing
                        }
                        
                        //User user = new User(); //get user info from database and load into constructor
                        //session.setAttribute("user", user);
                    }
                %>

            </form>
        </div>

    </body>
</html>

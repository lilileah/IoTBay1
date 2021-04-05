<%-- 
    Document   : register
    Created on : 22/03/2021, 3:36:15 PM
    Author     : lilil
--%>

<%@page import="uts.isd.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <link href="css/Adjustment.css" rel="stylesheet">
        <title>Registration Page</title>
    </head>
    <body>
        <div>
            <iframe width="100%" height="80" scrolling="no" src="interface.jsp" title="Interface"></iframe>
        </div>
        <div class="mb-3">
            <h1 class = "centre">Register</h1>
            <hr>
        </div>
        <div class="mx-auto" style="width: 400px;">
            <form action="welcome.jsp" method="post">

                <input class="mb-2 form-control" type="text" placeholder="Username" name = "name" required= "true"><br>
                <input class="mb-2 form-control" type="text" placeholder="Email" name = "email" required= "true"><br>
                <input class="mb-2 form-control" type="password" placeholder="Password" name = "password" required= "true"><br>
                <input class="mb-2 form-control" type="password" placeholder="Confirm Password" name = "password" required= "true"><br>

                <!--<label for="lname">Gender:</label><br>
                <input type="radio" id="male" name="gender" value="male">
                <label for="male">Male</label><br>
                <input type="radio" id="female" name="gender" value="female">
                <label for="female">Female</label><br>-->
                <div>
                    <input class="mb-2 btn-primary btn" type="submit" value="register">
                    <input type="hidden" name="submitted" value="yes">
                </div>
            </form>
        </div>
    </body>
</html>



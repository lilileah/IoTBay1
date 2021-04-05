<%-- 
    Document   : interface
    Created on : 30/03/2021, 3:15:22 PM
    Author     : Dean
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" rossorigin="anonymous">
        <link href="css/Adjustment.css" rel="stylesheet">
        <title>IOTBay Interface</title>
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark">
            <!--Center-->
            <a class="navbar-brand mx-auto" href="#">IOTBay</a>
            <!--Right side buttons-->
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="btn btn-outline-success me-2" href="login.jsp">Login</a></li>
                <li class="nav-item"><a class="btn btn-sm btn-outline-secondary" href="register.jsp"> Register</a></li>
            </ul>
        </nav>

        <!--temp-->
        <h1>IOTBay</h1>
        <p>Welcome to IOT Bay!</p>
        <table>
            <tr><td><a href="register.jsp"> Register</a></td></tr>
            <tr><td><a href="login.jsp"> Login</a></td></tr>
        </table>
    </body>
</html>

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
      <c:choose>
            <c:when test="${not empty user}">
                <div class="alert alert-success" role="alert">
                    <h4 class="alert-heading">User already logged in!</h4>
                    <a class="btn btn-primary btn-lg btn-block" href="main.jsp">Enter Site</a>
                </div>
            </c:when>
    <c:otherwise>
    <div class = "mb-3">
        <h1 class="centre">Sign In</h1>
        <hr>
    </div>

    <!--                Check form validation errors-->

    <c:if test="${not empty emailErr}">
        <div class="alert alert-primary "role="alert">
            <c:out value="${emailErr}"/>
        </div>
    </c:if>

    <c:if test="${not empty passErr}">
        <div class="alert alert-primary" role="alert">
            <c:out value="${passErr}"/>
        </div>
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

        </form>
    </div>
</div>
</c:otherwise>
</c:choose>
</body>
</html>
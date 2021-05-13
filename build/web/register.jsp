<%@page import="uts.isd.model.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
<!--        Check for session-->
        <c:choose>
            <c:when test="${registered}">
                <div class="alert alert-success" role="alert">
                    <h4 class="alert-heading">Registration Successful!</h4>
                    <a class="btn btn-primary btn-lg btn-block" href="main.jsp">Enter Site</a>
                </div>
            </c:when>

            <c:otherwise>
                
                <div class="mb-3">
                    <h1 class = "centre">Register</h1>
                    <hr>
                </div>
                <div class="mx-auto" style="width: 400px;">
                    <form method="post" action="RegisterServlet">
                        <input class="mb-2 form-control" type="text" placeholder="Username email" name = "USERNAME_EMAIL" required= "true"><br>
                        <input class="mb-2 form-control" type="text" placeholder="Full name" name = "USER_NAME" required= "true"><br>
                        <input class="mb-2 form-control" type="password" placeholder="Password" name = "PASSWORD" required= "true"><br>
                        <input class="mb-2 form-control" type="text" placeholder="Phone" name = "PHONE" required= "true"><br>
                        <input class="mb-2 form-control" type="text" placeholder="dd/mm/yyyy" name = "DOB" required= "true"><br>
                        <input class="mb-2 form-control" type="text" placeholder="gender" name = "GENDER" required= "true"><br>
                        <input class="mb-2 form-control" type="text" placeholder="type" name = "USER_TYPE" required= "true"><br>
                        <div>
                            <input class="mb-2 btn-primary btn" type="submit" value="register">
                            <input type="hidden" name="submitted" value="yes">
                        </div>
                    </form>
                </div>
            </c:otherwise>
        </c:choose>
    </body>
</html>
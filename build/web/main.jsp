<%-- 
    Document   : main
    Created on : 01/04/2021, 5:34:31 PM
    Author     : lilil
--%>

<%@page import="uts.isd.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>



    <div>
        <iframe width="100%" height="80" scrolling="no" src="interface.jsp" title="Interface"></iframe>
    </div>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <title>Main page</title>
    </head>
    <body>

        <%
            User user = (User) session.getAttribute("user");
        %>

    </section>
</div>
<% if (user == null) { %>
<section class="jumbotron text-center">
    <div class="container">
        <h1 class="jumbotron-heading">IoTBay Main page</h1>
        <p class="lead text-muted">Whoops! Doesn't look like your logged in.</p>

        <p>
            <a href="index.jsp" class="btn btn-secondary my-2">Return to home</a>
        </p>
    </div>
</section>


<% } else { %>
<section class="jumbotron text-center">
    <div class="container">
        <h1 class="jumbotron-heading">IoTBay Main page</h1>
        <p class="lead text-muted">You are logged in as ${user.name}</p>

        <p>Here are your account details: </p>
        <table class="table table-striped table-sm" od="profile_table">
            <thread><th>Name</th><th>Username</th><th>Email</th><th>Password</th></thread>
            <tr><td>${user.name}</td><td>${user.username}</td><td>${user.email}</td><td>${user.password}</td>
        </table>

        <p>
            <a href="logout.jsp" class="btn btn-secondary my-2">Log out</a>
        </p>
    </div>
</section>

<%}%>

<main role="main">

    <div class="album py-5 bg-light">
        <div class="container">
        </div>
    </div>
</main>



</body>
</html>

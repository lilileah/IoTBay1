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
    <section class="jumbotron text-center">
        <div class="container">
          <h1 class="jumbotron-heading">IoTBay Main page</h1>
          <p class="lead text-muted">You are logged in as ${user.user_name}</p>
          <h1 class="font-weight-bold">Profile Info</h1>
            <body>
                    <table class="table">
                        <thead class="thead-light">
                        <tr>
                            <th scope="col">Id </th>
                            <th scope="col">Email </th>
                            <th scope="col">Username </th>
                            <th scope="col">Phone </th>
                            <th scope="col">DOB </th>
                            <th scope="col">Gender</th>
                            <th scope="col">Type </th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>${user.user_id}</td>
                            <td>${user.username_email}</td>
                            <td>${user.user_name}</td>
                            <td>${user.phone}</td>
                            <td>${user.dob}</td>
                            <td>${user.gender}</td>
                            <td>${user.user_type}</td>
                        </tr>
                        </tbody>
                    </table>
                <p>
                <a href="logout.jsp" class="btn btn-secondary my-2">Log out</a>
                <a href="editUser.jsp" class="btn btn-secondary my-2">Edit Account</a>
              </p>
            </body>
        </div>
    </section>
</html>
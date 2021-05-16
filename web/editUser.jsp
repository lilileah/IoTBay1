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
          <form method="post" action="UpdateUserServlet">
            <body>
                    <table class="table">
                        <thead class="thead-light">
                        <tr>
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
                            <td><input class="mb-2 form-control" type="text" name = "USERNAME_EMAIL" required= "true" value="${user.username_email}"></td>
                            <td><input class="mb-2 form-control" type="text" name = "USER_NAME" required= "true" value="${user.user_name}"></td>
                            <td><input class="mb-2 form-control" type="text" name = "PHONE" required= "true" value="${user.phone}"></td>
                            <td><input class="mb-2 form-control" type="text" name = "DOB" required= "true" value="${user.dob}"></td>
                            <td><input class="mb-2 form-control" type="text" name = "GENDER" required= "true" value="${user.gender}"></td>
                            <td><input class="mb-2 form-control" type="text" name = "USER_TYPE" required= "true" value="${user.user_type}"></td>
                        </tr>
                        </tbody>
                    </table>
                        <input class="mb-2 form-control" type="hidden" name = "USER_ID" required= "true" value="${user.user_id}">
                    <div>
                            <input class="mb-2 btn-primary btn" type="submit" value="Submit account update">
                            <input type="hidden" name="submitted" value="yes">
                    </div>
                </form>
                    
                <p>
                <a href="deleted.jsp" class="btn btn-secondary my-2">Log out</a>
                <form method = "POST" action="DeleteUserServlet">
                <input class="mb-2 form-control" type="hidden" name = "USER_ID" required= "true" value="${user.user_id}">
                <input class="mb-2 btn-primary btn" type="submit" value="Delete Account">
                </form>
                </p>
            </body>
        </div>
    </section>
</html>
<%-- 
    Document   : index
    Created on : 22/03/2021, 4:25:48 PM
    Author     : lilil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <div>
<iframe width="100%" height="80" scrolling="no" src="interface.jsp" title="Interface"></iframe>
</div>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <title>Home Page</title>
    </head>
    <body>
        <div class="mx-auto" style="width: 900px;">
        
           <section class="jumbotron text-center">
        <div class="container">
          <h1 class="jumbotron-heading">Welcome top IoT bay!</h1>
          <p class="lead">IoTBay is  a  small  company  based  in  Sydney,  Australia. This site is an  online  IoT  devices  ordering  application  to  allow  their customers  to  purchase  IoT  devices </p>
          <p>
            <a href="register.jsp" class="btn btn-primary my-2">New member</a>
            <a href="login.jsp" class="btn btn-secondary my-2">Existing member</a>
          </p>
        </div>
      </section>
      </main>
        </div>
        <jsp:include page="/ConnServlet" flush="true"/>
    </body>
</html>

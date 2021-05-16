<%-- 
    Document   : accesslogs
    Created on : 15/05/2021, 2:50:29 PM
    Author     : samuelpolgar
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="uts.isd.model.AccessLogs"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
        <link href="css/Adjustment.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.24/css/jquery.dataTables.css">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/responsive/2.2.3/css/responsive.bootstrap.css">
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.js"></script>
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/responsive/2.2.3/js/dataTables.responsive.js"></script>
        <script type="text/javascript">
            $(document).ready(function(){
                //alert("Hello");
                $('#dataTable').DataTable({
                    "searching": true
                });
            });
            

        </script>
        <title>Access Logs</title>
    </head>
    <%
        ArrayList<AccessLogs> logs = new ArrayList<AccessLogs>();
        logs = (ArrayList<AccessLogs>) session.getAttribute("allaccesslogs");
    %>
    <body>
        <!--        navbar-->
        <div>
            <iframe width="100%" height="80" scrolling="no" src="interface.jsp" title="Interface"></iframe>
        </div>
        <!--        heading-->
        <div class = "mb-3">
            <h1 class="centre">Access Logs</h1>
            <hr>
        </div>

        <!--        access logs view--> 
        <div class ="row">
            <div class ="table responsive">
                <table class ="display" id="dataTable" cellspacing="5" cellpadding="5" width="100%">
                    <thead>
                        <tr>
                            <th>Log Id</th>
                            <th>user Id</th>
                            <th>Action</th>
                            <th>Time</th>
                        </tr>
                    </thead>
                        <c:forEach var ="logsList" items="${logsList}">
                    <div class="panel-body">
                            <div class="table-responsive">
                            <tbody>
                                <tr>
                                    <td><c:out value ="${logsList.log_id}"/></td>
                                    <td><c:out value ="${logsList.user_id}"/></td>
                                    <td><c:out value ="${logsList.action}"/></td>
                                    <td><c:out value ="${logsList.time}"/></td>
                                </tr>
                            </tbody>
                        </div>
                    </div>
                </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>
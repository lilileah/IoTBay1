
<%@page import="java.util.List"%>
<%@page import="uts.isd.model.Shipment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <title>Home Page</title>
    </head>
    <body>
        <div>
            <iframe width="100%" height="80" scrolling="no" src="interface.jsp" title="Interface"></iframe>
        </div>
        <div class="container">
            <div class="my-3">
                <form action="MyShipment" method="POST">
                    Shipment ID: <input type="text" name="shipmentId">
                    From: <input type="date" name="from">
                    To: <input type="date" name="to">
                    <button type="submit" class="btn btn-warning"> Search </button>
                </form>
                <a href="AddShipment" class="btn btn-success float-right">Add Shipment</a>
            </div>
            <table class="table table-striped">
                <tr>
                    <th>Shipment ID</th>
                    <th>Order ID</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Method</th>
                    <th>Status</th>
                    <th>Date</th>
                    <th></th>
                </tr>
                <%
                    List<Shipment> list = (List<Shipment>) request.getAttribute("list");
                    for (Shipment s : list) {
                %>
                <tr>
                    <td><%=s.getId()%></td>
                    <td><%=s.getOrderId()%></td>
                    <td><%=s.getName()%></td>
                    <td><%=s.getAddress1()%> <%=s.getAddress2()%>, <%=s.getSuburb()%>, <%=s.getCity()%>, <%=s.getState()%>, <%=s.getPostcode()%></td>
                    <td><%=s.getMethod()%></td>
                    <td><%=s.getStatus()%></td>
                    <td><%=s.getTime()%></td>
                    <td>
                        <% if (!s.getStatus().equals("Shipped")) {%>
                        <a href="EditShipment?id=<%=s.getId()%>" class="btn btn-primary">Edit</a>
                        <%}%>
                    </td>
                </tr>
                <%}%>
            </table>
        </div>
    </body>
</html>


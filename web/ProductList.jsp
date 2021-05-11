<%-- 
    Document   : ProductList
    Created on : 11/05/2021, 12:26:46 PM
    Author     : Dean
--%>

<%@page import="uts.isd.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="uts.isd.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="/docs/5.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <title>Products</title>
    </head>
    <body>
        <%
            User user = (User) session.getAttribute("user");
            ArrayList<Product> products = (ArrayList<Product>) session.getAttribute("products");
        %>

        <h1 class="fw-light">Products</h1>

        <%if (user != null && user.getUser_type().equals("S")) {%>
        <button>Add Product</button>
        <%} else if (user == null) {%>
        <p>please log in to make an order</p>
        <%}%>


        <div>
            <c:forEach items="${products}" var="productItem">
                <tr>
                    <td>ProductName: <c:out value="${productItem.name}"/></td>
                    <td>price : <c:out value="${productItem.price}"/></td>  
                </tr>
            </c:forEach>
        </div>
    </body>
</html>

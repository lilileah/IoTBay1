<%-- 
    Document   : AddProductForm
    Created on : 08/05/2021, 1:19:42 PM
    Author     : Dean
--%>

<%@page import="uts.isd.controller.ConnServlet"%>
<%@page import="uts.isd.model.dao.DBMproduct"%>
<%@page import="uts.isd.model.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit</title>
    </head>
    <body>
        <div>
            <%
                User user = (User) session.getAttribute("user");
            %>
        </div>
        <form method="post" action="AddProductServlet">
            <input type ="text" placeholder="product name" name="productId" required><br>
            <input type="submit" value="getProductForm"> 
        </form>
        <%
            Product product = (Product)session.getAttribute("product");
            
        %>
        <!--        TESTING-->
        <jsp:include page="/ConnServlet" flush="true"/>
    </body>
</html>

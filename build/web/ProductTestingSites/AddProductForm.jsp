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
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <%
                User user = (User) session.getAttribute("user");
            %>
        </div>
        <form method="post" action="AddProductServlet">
            <input type ="text" placeholder="product name" name="productName" required><br>
            <input type ="text" placeholder="product price" name="productPrice" required><br>
            <input type ="text" placeholder="product discount" name="productDiscount"><br>
            <input type="submit" value="AddProductBtn"> 
        </form>
<!--        TESTING-->
            <jsp:include page="/ConnServlet" flush="true"/>
    </body>
</html>

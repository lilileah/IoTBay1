<%-- 
    Document   : OrderHistory
    Created on : 11/05/2021, 10:35:24 PM
    Author     : lilil
--%>
<%@page import="uts.isd.model.User"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--  %@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>-->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<div>
<iframe width="100%" height="80" scrolling="no" src="interface.jsp" title="Interface"></iframe>
</div>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <title>Order History</title>
    </head>
       
    
     
    <body>
          
            
             <section class="jumbotron text-center">
        <div class="container">
          <h1 class="jumbotron-heading">Order History</h1>
  
          <p>Hi ${user.user_name}! ,here is your user history</p>
           
            
    <sql:setDataSource
        var="iotbaydb"
        driver="org.apache.derby.jdbc.ClientDriver"
        url="jdbc:derby://localhost:1527/iotbaydb"
        user="iotbay" password="admin"
    />
    
  
    <sql:query var="orderList"   dataSource="${iotbaydb}">
        SELECT * FROM orders WHERE USER_ID = ?
        <sql:param value = "${user.user_id}" />
    </sql:query>

    <div align="center">
        <table class="table table-dark" border="1" cellpadding="2">
            <tr>
                <th>Order ID</th>
                <th>Order date</th>
                <th>number of Items</th>
                <th>Total cost (AUD)</th>
                
            </tr>
            <c:forEach var="order" items="${orderList.rows}">
                <tr>
                                      
                    <td><c:out value="${order.order_id}" /></td>
                    <td><c:out value="${order.order_date}" /></td>
                    <td><c:out value="${order.total_items}" /></td>
                    <td>$<c:out value="${order.total_price}" /></td>
                </tr>
            </c:forEach>
        </table>
  
    </div>

               
          <p>
            <a href="main.jsp" class="btn btn-secondary my-2">Return to home</a>
          </p>
        </div>
      </section>
            

    </body>
    
    
</html>

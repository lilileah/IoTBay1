<%-- 
    Document   : ProductList
    Created on : 14/05/2021, 1:02:38 PM
    Author     : deano
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="uts.isd.model.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" rossorigin="anonymous">
        <link href="css/Adjustment.css" rel="stylesheet">
        <title>Product List</title>
    </head>
    <%
        User user = (User) session.getAttribute("user");
        ArrayList<Product> products = new ArrayList<Product>();
        products = (ArrayList<Product>) session.getAttribute("products");
    %>
    <body>
        <!--        navbar-->
        <div>
            <iframe width="100%" height="80" scrolling="no" src="interface.jsp" title="Interface"></iframe>
        </div>
        <!--        heading-->
        <div class = "mb-3">
            <h1 class="centre">Product Page</h1>
            <hr>
        </div>

        <!--        staff menu-->
        <%//if (user.getUser_type().equals("S")) {%>
        <!--<div>
            <nav class="navbar navbar-light bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">
                        <button type="button" value="" class="btn btn-warning mt-4 text-white" onclick="GetproductServlet"><i class="icon-cart-add mr-2"></i> View Item</button>
                    </a>
                </div>
            </nav>
        </div>-->
        <%//}%>

        <!--        product view-->
        <%if (products != null || products.size() == 0) {%>
        <div class="container d-flex justify-content-center mt-50 mb-50">
            <div class="row">
                <div class="col-md-10">
                    <div class="card card-body">
                        <div class="media align-items-center align-items-lg-start text-center text-lg-left flex-column flex-lg-row">
                            
                            <%for (int i = 0; i < products.size(); i++) {%>
                            <div class="card card-body mt-3">
                                <div class="media align-items-center align-items-lg-start text-center text-lg-left flex-column flex-lg-row">
                                    <div class="mr-2 mb-3 mb-lg-0"> <img src="https://i.imgur.com/Aj0L4Wa.jpg" width="150" height="150" alt=""> </div>
                                    <div class="media-body">
                                        <h6 class="media-title font-weight-semibold"> <a href="#" data-abc="true"><%=products.get(i).getName()%></a> </h6>
                                        <ul class="list-inline list-inline-dotted mb-3 mb-lg-2">
                                        </ul>
                                        <p class="mb-3"><%=products.get(i).getDescription()%></p>
                                    </div>
                                    <div class="mt-3 mt-lg-0 ml-lg-3 text-center">
                                        <h3 class="mb-0 font-weight-semibold">$<%=products.get(i).getPrice()%></h3>
                                        <div> <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star"></i> </div>
                                        <button type="button" class="btn btn-warning mt-4 text-white"><i class="icon-cart-add mr-2"></i> Add to cart</button>
                                        <!--<button type="button" value="" class="btn btn-warning mt-4 text-white" href="/IoTBay1/GetProductServlet?param1="><i class="icon-cart-add mr-2"></i> View Item</button>-->
                                        <a href="/IoTBay1/GetProductServlet?param1=<%=products.get(i).getID()%>">Go to this</a>
                                    </div>
                                </div>
                            </div>
                            <%}%>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%}%>
    </body>
</html>

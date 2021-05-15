<%-- 
    Document   : Complete_order
    Created on : 11/05/2021, 11:44:09 PM
    Author     : lilil
--%>

<%@page import="uts.isd.model.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="uts.isd.model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div>
<iframe width="100%" height="80" scrolling="no" src="interface.jsp" title="Interface"></iframe>
</div>
     
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <title>Order summary</title>
    </head>
<body class="bg-light" data-new-gr-c-s-check-loaded="14.1010.0" data-gr-ext-installed="">

    <%
            ArrayList<Product> CartList = new ArrayList<Product>();
            CartList = (ArrayList<Product>)session.getAttribute("CartList");

                if(CartList == null){
                          %>
                          <p>Your cart is empty</p>
                          <%}

                        else{
                      for (int i = 0; i < CartList.size(); i++) {%>
                      <tr>
                           <tr>
                        
                      <%}

                        }

        %>
    
    <div class="container">
      <div class="py-5 text-center">
        <h2>Order details</h2>
      
      </div>
        

      <div class="row">
        <div class="col-md-4 order-md-2 mb-4">
          <h4 class="d-flex justify-content-between align-items-center mb-3">
            <span class="text-muted">Your cart</span>
            <span class="badge badge-secondary badge-pill">3</span>
          </h4>
          <ul class="list-group mb-3">

               <%
                   if(CartList == null){
                          %>
                          <p>Your cart is empty</p>
                          <%}

                        else{
                      for (int i = 0; i < CartList.size(); i++) {
                      double b = CartList.get(i).getPrice();
                        %>
                       <li class="list-group-item d-flex justify-content-between lh-condensed">
              <div>
                <h6 class="my-0"><%= CartList.get(i).getName() %></h6>
                <small class="text-muted">Brief description</small>
              </div>
                
 
              <span class="text-muted">$<%= CartList.get(i).getPrice() %></span>
            </li>
                        
                      <%}}%>
              
              
            
            <li class="list-group-item d-flex justify-content-between bg-light">
              <div class="text-success">
                <h6 class="my-0">Money saved</h6>
                <small>Your discount total</small>
              </div>
              <span class="text-success">-$5</span>
            </li>
            <li class="list-group-item d-flex justify-content-between">
              <span>Total (AUD)</span>
              
              <div>
              
                  
            <%
                double a = 0;  
                for (int i = 0; i < CartList.size(); i++) {
                     double b = CartList.get(i).getPrice();
                      a = a + b;
            }
                %>
                </div>
              
              <strong>$<%= a %></strong>
            </li>
          </ul>

       
          
        </div>
        <div class="col-md-8 order-md-1">
             <h4 class="mb-3">My details</h4>
              <%
            User user = (User)session.getAttribute("user");
            
            if(user==null){ %>
  
            <p>You're not logged in, please <a href="login.jsp">login</a> or <a href="register.jsp">register</a> to check out</p>
      
        
             
             <%
               
                
            }
            else{

        %>
       
            
         
          <form class="needs-validation" novalidate="">
            <div class="row">
              <div class="col-md-6 mb-3">
                <h6>First name</h6>
                 <p>${user.user_name}</p>
                </div>
              <div class="col-md-6 mb-3">
                <h6>User ID</h6>
                <p>${user.user_id} </p>
              </div>
              <div class="col-md-6 mb-3">
                <h6>Email</h6>
                 <p>${user.username_email}</p>
                </div>
                <div class="col-md-6 mb-3">
                <h6>Phone number</h6>
                 <p>${user.phone}</p>
                </div>
            </div>

            
              
               <%
       }

        %>
            
            <h4 class="mb-3">Shipment & payment</h4>

           
            <div class="row">
              <div class="col-md-6 mb-3">
                 <h6>Address</h6>
                 <p>${user.username_email}</p>
                  <p>
            <a href="login.jsp" class="btn btn-secondary my-2">edit shipment details</a>
          </p>
              </div>
                          </div>
            
            <div class="row">
              <div class="col-md-6 mb-3">
                <h6>Name on Card</h6>
                 <p>${user.username_email}</p>
                
              </div>
              <div class="col-md-6 mb-3">
                <h6>Credit Card number</h6>
                 <p>${user.username_email}</p>

              </div>
                 <p>
            <a href="login.jsp" class="btn btn-secondary my-2">Edit payment details</a>
          </p>
            </div>
            <div class="row">
              
            </div>
            <hr class="mb-4">
                                      
                
               
            
<div class="col-sm-6 order-md-2 text-right">
            <a href="orderComplete.jsp" class="btn btn-primary mb-4 btn-lg pl-5 pr-5">next page test
            </a>
        </div>
            
          </form>
                 
                  <div class="mx-auto" style="width: 60px;">
                    <form method="post" action="AddOrderServlet"> 
                        <div>
                            <input class="btn btn-primary mb-4 btn-lg pl-5 pr-5" type="submit" value="Place order">
                            <input type="hidden" name="submitted" value="yes">
                            
                        </div>
                    </form>
                </div>
        </div>
      </div>

      <footer class="my-5 pt-5 text-muted text-center text-small">
        <p class="mb-1">© 2020 IoTBay</p>
       
      </footer>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    
 
    <script src="../../assets/js/vendor/popper.min.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <script src="../../assets/js/vendor/holder.min.js"></script>
   
  

<!--</body>
     
    <body>

             <section class="jumbotron text-center">
        <div class="container">
          <h1 class="jumbotron-heading">Confirm your order details</h1>
  
          <p>Order summary</p>
          
                <div>
            <a>ORDER INFO</a>
        </div>
            
        </div>
            <a href="index.jsp" class="btn btn-secondary my-2">Add shipment</a>
            <a href="index.jsp" class="btn btn-secondary my-2">Add Payment</a>
          </p>
        </div>
        
        
         </div>
            <a href="index.jsp" class="btn btn-secondary my-2">Confirm order</a>
          </p>
        </div>
      </section>
            

    </body>-->
    
</html>

<%-- 
    Document   : productCart
    Created on : 12/05/2021, 6:20:43 PM
    Author     : lilil
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="uts.isd.model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div>
<iframe width="100%" height="80" scrolling="no" src="interface.jsp" title="Interface"></iframe>
</div>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IOTBay Welcome Page</title>
    </head>
    <body>
        
        
        <% 
            //if(request.getParameter("buttonName") != null) {
            if(request.getParameterNames() != null) {
        %>
            You clicked 
            <%= request.getParameter("buttonName") %>
        <%
            }
        %>

       
        
        
        <%
             //ArrayList<Product> productsCart = (ArrayList<Product>) session.getAttribute("products");
                         ArrayList<Product> Cart = new ArrayList<Product>();
                          //session.setAttribute("productsCart", productsCart);
                          ///id, produtname, price, discount, productEnumeral 
                            Cart.add(new Product( 1, "Book", 12, 1, null));
                        Cart.add(new Product( 2, "Pencil", 2, 1, null));
                        Cart.add(new Product( 3, "Pen", 7, 2, null));
                         
                         session.setAttribute("CartList", Cart);

                          int d = 0;  
                for (int i = 0; i < Cart.size(); i++) {     
                      d = d + 1;
                      
            }
                
                
                %>
            <FORM NAME="form1" METHOD="POST">
            <INPUT TYPE="HIDDEN" NAME="buttonName">
            <INPUT TYPE="SUBMIT" VALUE="Button 1" ONCLICK="<%= Cart.add(new Product( 3, "Pen", 7, 2, null))%>">
            <INPUT TYPE="BUTTON" VALUE="Button 2" ONCLICK="button2()">
            </FORM>
                
                 <SCRIPT LANGUAGE="JavaScript">
            <!--
            function button1()
            {
               document.form1.buttonName.value = "button 1";

               
                 form1.submit();
        
            }    
            function button2()
            {
                document.form1.buttonName.value = "button 2";
               
                form1.submit();
            }    
            // --> 
        </SCRIPT>
         
        
        <section class="pt-5 pb-5">
  <div class="container">
    <div class="row w-100">
        <div class="col-lg-12 col-md-12 col-12">
            <h3 class="display-5 mb-2 text-center">Shopping Cart</h3>
            <p class="mb-5 text-center">
                
                <i class="text-info font-weight-bold"><%= d %></i> items in your cart</p>
            <table id="shoppingCart" class="table table-condensed table-responsive">
                <thead>
                    <tr>
                        <th style="width:60%">Product</th>
                        <th style="width:12%">Price</th>
                        <th style="width:10%">Quantity</th>
                        <th style="width:16%"></th>
                    </tr>
                </thead>
                <tbody> 
                    
                      <div>
                      <%

                          
                        if(Cart == null || d == 0){
                          %>
                           <p class="mb-5 text-center">
                
                        <i class="text-info font-weight-bold"></i> Your cart is empty</p>
                          <%}

                        else{
                      for (int i = 0; i < Cart.size(); i++) {%>
                      <tr>
                           <tr>
                        <td data-th="Product">
                            <div class="row">
                                <div class="col-md-3 text-left">
                                    <img src="https://via.placeholder.com/250x250/5fa9f8/ffffff" alt="" class="img-fluid d-none d-md-block rounded mb-2 shadow ">
                                </div>
                                <div class="col-md-9 text-left mt-sm-2">
                                    <h4><%= Cart.get(i).getName() %></h4>
                                    <p class="font-weight-light">Brand &amp; Name</p>
                                    
                                </div>
                            </div>
                        </td>
                        <td data-th="Price">$<%= Cart.get(i).getPrice() %></td>
                        <td data-th="Quantity">
                            <input type="number" class="form-control form-control-lg text-center" value="1">
                        </td>
                        <td class="actions" data-th="">
                            <p>
                               
                             <input type="button" name="removeButton" value="Remove" ONCLICK="button1()">
                            <a  class="btn btn-secondary my-2" ONCLICK="button1()">Remove</a>
                        </p>
                        </td>
                        
                        
                                             
                        
                      <%}

                        }


                      %>
                      </div>  
   
                </tbody>
            </table>
            <div class="float-right text-right">
                
                <div>
              
                  
            <%
                double a = 0;  
                for (int i = 0; i < Cart.size(); i++) {
                     double b = Cart.get(i).getPrice();
                      a = a + b;
            }
                %>
                </div>
                
                <h4>Subtotal:$ <%= a %> </h4>
                
                <h1></h1>
            </div>
        </div>
    </div>
    <div class="row mt-4 d-flex align-items-center">
        <div class="col-sm-6 order-md-2 text-right">
            <a href="orderDetails.jsp" class="btn btn-primary mb-4 btn-lg pl-5 pr-5">Checkout</a>
        </div>
        <div class="col-sm-6 mb-3 mb-m-1 order-md-1 text-md-left">
            <a href="catalog.html">
                <i class="fas fa-arrow-left mr-2"></i> Continue Shopping</a>
        </div>
    </div>
</div>
</section>
        
  
  
        
    
      
      
    </body>
</html>

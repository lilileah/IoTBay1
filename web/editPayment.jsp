<%-- 
    Document   : editPayment
    Created on : 16/05/2021, 2:53:50 PM
    Author     : timfi
--%>

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
        <h2 class="lead">Adding a new payment method:</h2>
        <div class="container">
<!--            remember to change path name-->
            <form action="/Recovered/UpdatePaymentDetailServlet" method="POST">
                <div class="form-group row mb-2">
                    <label class="col-sm-2 col-form-label">Payment ID</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="paymentID">
                    </div>
                </div>
                <div class="form-group row mb-2">
                    <label class="col-sm-2 col-form-label">Card Type</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="cardType">
                    </div>
                </div>
                <div class="form-group row mb-2">
                    <label class="col-sm-2 col-form-label">Card Number (16 numbers)</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="cardNumber">
                    </div>
                </div>
                <div class="form-group row mb-2">
                    <label class="col-sm-2 col-form-label">Card Owner's Name</label>
                    <div class="col-sm-10" mb-2>
                        <input type="text" class="form-control" name="cardOwnerName">
                    </div>
                </div>
                <div class="form-group row mb-2">
                    <label class="col-sm-2 col-form-label">Card Expiry Date (XX/XX format)</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="cardExpiry">
                    </div>
                </div>
                <div class="form-group row mb-2">
                    <label class="col-sm-2 col-form-label">CCV Number </label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="cardCCV">
                    </div>
                </div>
                <div class="form-group row mb-2">
                    <label class="col-sm-2 col-form-label">Amount to pay</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="cardAmount">
                    </div>
                </div>
                <input type="hidden" name="userId" value="1">
                <div class="form-group row">
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary">Update Payment Method</button>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
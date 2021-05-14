
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
            <form action="AddShipment" method="POST">
                <div class="form-group row mb-2">
                    <label class="col-sm-2 col-form-label">Order ID</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="orderId">
                    </div>
                </div>
                <div class="form-group row mb-2">
                    <label class="col-sm-2 col-form-label">Name</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="name">
                    </div>
                </div>
                <div class="form-group row mb-2">
                    <label class="col-sm-2 col-form-label">Mobile</label>
                    <div class="col-sm-10" mb-2>
                        <input type="text" class="form-control" name="mobile">
                    </div>
                </div>
                <div class="form-group row mb-2">
                    <label class="col-sm-2 col-form-label">Address Line 1</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="address1">
                    </div>
                </div>
                <div class="form-group row mb-2">
                    <label class="col-sm-2 col-form-label">Address Line 2</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="address2">
                    </div>
                </div>
                <div class="form-group row mb-2">
                    <label class="col-sm-2 col-form-label">Suburb</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="suburb">
                    </div>
                </div>
                <div class="form-group row mb-2">
                    <label class="col-sm-2 col-form-label">City</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="city">
                    </div>
                </div>
                <div class="form-group row mb-2">
                    <label class="col-sm-2 col-form-label">State</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="state">
                    </div>
                </div>
                <div class="form-group row mb-2">
                    <label class="col-sm-2 col-form-label">Post Code</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="postcode">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">Shipment Method</label>
                    <div class="col-sm-10">
                        <select class="form-control" name="method">
                            <option>Australia Post</option>
                            <option>DHL</option>
                            <option>EMS</option>
                        </select>
                    </div>
                </div>
                <input type="hidden" name="userId" value="1">
                <div class="form-group row">
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary">Add Shipment</button>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>


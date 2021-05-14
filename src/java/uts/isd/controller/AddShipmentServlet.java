/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uts.isd.model.Shipment;
import uts.isd.model.dao.DBConnector;
import uts.isd.model.dao.DBShipment;


@WebServlet(name = "AddShipmentServlet", urlPatterns = {"/AddShipment"})
public class AddShipmentServlet extends ConnServlet {

    DBShipment dbShipment;

    public AddShipmentServlet() {
        dbShipment = new DBShipment();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("addShipment.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Shipment shipment = new Shipment();
        shipment.setOrderId(Integer.parseInt(request.getParameter("orderId")));
        shipment.setUserId(1);
        shipment.setName(request.getParameter("name"));
        shipment.setMobile(request.getParameter("mobile"));
        shipment.setAddress1(request.getParameter("address1"));
        shipment.setAddress2(request.getParameter("address2"));
        shipment.setSuburb(request.getParameter("suburb"));
        shipment.setCity(request.getParameter("city"));
        shipment.setState(request.getParameter("state"));
        shipment.setPostcode(request.getParameter("postcode"));
        shipment.setMethod(request.getParameter("method"));
        try {
            dbShipment.addShipment(shipment);
        } catch (SQLException ex) {
            Logger.getLogger(AddShipmentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("MyShipment");
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
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


@WebServlet(name = "MyShipmentServlet", urlPatterns = {"/MyShipment"})
public class MyShipmentServlet extends ConnServlet {

    DBShipment dbShipment;

    public MyShipmentServlet() {
        dbShipment = new DBShipment();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Shipment> list = dbShipment.getShipmentsByUserId(1);
        request.setAttribute("list", list);
        request.getRequestDispatcher("myShipment.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Shipment> list = dbShipment.searchShipmentsByUserId(1, request.getParameter("shipmentId"), request.getParameter("from"), request.getParameter("to"));
        request.setAttribute("list", list);
        request.getRequestDispatcher("myShipment.jsp").forward(request, response);
    }

}

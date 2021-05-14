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


@WebServlet(name = "DeleteShipmentServlet", urlPatterns = {"/DeleteShipment"})
public class DeleteShipmentServlet extends ConnServlet {

    DBShipment dbShipment;

    public DeleteShipmentServlet() {
        dbShipment = new DBShipment();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        dbShipment.deleteShipmentsById(Integer.parseInt(request.getParameter("id")));
        response.sendRedirect("MyShipment");
    }

}

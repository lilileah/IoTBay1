/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.controller.orderServlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import uts.isd.model.Product;
import uts.isd.model.User;
import uts.isd.model.dao.DBOrders;

/**
 *
 * @author lilil
 */

public class AddOrderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //SESSION
        HttpSession session = request.getSession();
        
        //MANAGER
        DBOrders orderManager = (DBOrders) session.getAttribute("orderManager");

        //INPUT STUFF
        ArrayList<Product> products = new ArrayList<>();
        String date = "11/02/19";
        User user = (User) session.getAttribute("user");
        //int userID = user.getUser_id();
        int totalItems = 3;
        double totalPrice = 10;

        products = (ArrayList<Product>) session.getAttribute("CartList");
        
        try {
          
          orderManager.addOrder("12321", 1, 1, 3 );
          System.out.println("HELLOOOOOO22111!!!!!!");

        } catch (SQLException | NullPointerException ex) {
            System.out.println("HELLOOOOOO22222!!!!!!");
            System.out.println(ex.getMessage() == null ? "Product does not exist" : "welcome");
        }

    }

}

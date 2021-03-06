/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.controller.ProductsServlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.*;
import uts.isd.model.dao.*;

/**
 *
 * @author Dean
 */
public class AddProductServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        HttpSession session = request.getSession();
        
        //Validator validatior
        
        String productName = request.getParameter("productName");
        float price = Float.parseFloat(request.getParameter("productPrice"));
        float discount = Float.parseFloat(request.getParameter("productDiscount"));
        
        DBMproduct DBMProduct = (DBMproduct) session.getAttribute("productManager");
        
        try{
            DBMProduct.addProduct(productName, price, discount);
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage() == null ? "Something broke": "Added " + productName);
        }
    }
}

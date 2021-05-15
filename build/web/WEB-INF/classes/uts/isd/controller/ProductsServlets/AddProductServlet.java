package uts.isd.controller.ProductsServlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import uts.isd.model.Product;
import uts.isd.model.dao.DBMproduct;

/**
 *
 * @author deano
 */
public class AddProductServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        //session
        HttpSession session = request.getSession();
        //manager
        DBMproduct productManager = (DBMproduct) session.getAttribute("productManager");
        //input stuff
        String name = request.getParameter("productName");
        String desc = request.getParameter("productDesc");
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));
        
        //send to db
        try{
            productManager.addProduct(name, desc, price, discount);
        }
        catch(SQLException | NullPointerException ex){
            System.out.println(ex.getMessage() == null ? "Error adding to db" : "Added product");
        }
        //redirect
    }
}
//redirect
//Session.getRequestDispatcher("page.jsp").include(request, response);

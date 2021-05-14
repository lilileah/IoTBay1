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
public class GetAllProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //session
        HttpSession session = request.getSession();
        //product manager
        DBMproduct productManager = (DBMproduct) session.getAttribute("productManager");

        //input values
        int ID = Integer.parseInt(request.getParameter("ID"));

        try {
            session.setAttribute("allproducts", productManager.fetchProductsById(ID));//TODO: change this to not call db twice

        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex.getMessage() == null ? "Product does not exist" : "welcome");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //session
        HttpSession session = request.getSession();
        //product manager
        DBMproduct productManager = (DBMproduct) session.getAttribute("productManager");

        try {
            ArrayList<Product> products = productManager.fetchProducts();
            if(products.size() == 0){
                System.out.println("rfigujh eirug");
            }
            session.setAttribute("allproducts", products);//TODO: change this to not call db twice
            request.getRequestDispatcher("ProductList.jsp").include(request, response);

        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex.getMessage() == null ? "Product does not exist" : "welcome");
        }
    }
}
//redirect
//Session.getRequestDispatcher("page.jsp").include(request, response);

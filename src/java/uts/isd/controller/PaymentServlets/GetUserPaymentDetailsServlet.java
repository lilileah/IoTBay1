/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.controller.PaymentServlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import uts.isd.model.PaymentDetails;
import uts.isd.model.User;
import uts.isd.model.dao.DBManager_payment;

/**
 *
 * @author timfi
 */
public class GetUserPaymentDetailsServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        HttpSession session = request.getSession();
        
        //Validator validatior
        User user = (User)session.getAttribute("user");       
        
        DBManager_payment manager = (DBManager_payment) session.getAttribute("paymentManager");
        
        try{
            ArrayList<PaymentDetails> list = manager.fetchPaymentDetailsByUser(user);
            session.setAttribute("paymentdetails",list);
            request.getRequestDispatcher("main.jsp").include(request, response);
        }
  
        catch(SQLException ex){
            System.out.println(ex.getMessage() == null ? "Something broke": "Added " + user);
        }
    }
}

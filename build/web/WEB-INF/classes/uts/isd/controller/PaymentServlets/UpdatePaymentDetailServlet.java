/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.controller.PaymentServlets;

import java.io.IOException;
import java.math.BigInteger;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import uts.isd.model.User;
import uts.isd.model.dao.DBManager_payment;

/**
 *
 * @author timfi
 */
public class UpdatePaymentDetailServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        HttpSession session = request.getSession();
        
        //Validator validatior
        
        int ID = Integer.parseInt(request.getParameter("paymentID"));
        String type = request.getParameter("cardType");
        String hold = request.getParameter("cardNumber");
        BigInteger number = new BigInteger(hold);
        String owner = request.getParameter("cardOwnerName");
        String exp = request.getParameter("cardExpiry");
        int CCV = Integer.parseInt(request.getParameter("cardCCV"));
        
        DBManager_payment manager = (DBManager_payment) session.getAttribute("paymentManager");
        
        try{
            manager.updatePayment(ID, type,number,owner,exp,CCV);
            request.getRequestDispatcher("main.jsp").include(request,response);
        }
  
        catch(SQLException ex){
            System.out.println(ex.getMessage() == null ? "Something broke": "Added " + number);
        }
    }
}

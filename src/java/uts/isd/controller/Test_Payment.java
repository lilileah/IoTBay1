/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.controller;

import java.math.BigInteger;
import java.sql.*;
import java.util.*;
import java.time.*;
import java.util.logging.*;
import uts.isd.model.PaymentDetails;
import uts.isd.model.User;
import uts.isd.model.dao.*;

/**
 *
 * @author timfi
 */
public class Test_Payment {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        try {

            DBConnector connector = new DBConnector();
            Connection conn = connector.openConnection();
            DBManager_payment dbp = new DBManager_payment(conn);
            DBMuser dbu = new DBMuser();
            
            //automated creation of a test user to run the tests with
            //NOTE - DOES NOT WORK - NEEDS REVISION
//            String str="2015-03-31";  
//            LocalDate ld = LocalDate.parse( str ) ;
//            dbu.addUser("testname@email.com.au", "Test Name", "Password1", "+44444444", ld, "Male", "A");

            //testing addPayment method via manual input
//            System.out.print("User card type: ");
//            String type = in.nextLine();
//            System.out.print("User card number: ");
//            String hold1 = in.nextLine();
//            BigInteger held = new BigInteger(hold1);
//            System.out.print("User card owner's Name: ");
//            String name = in.nextLine();
//            System.out.print("User card expiration date: ");
//            String exp = in.nextLine();
//            System.out.print("User card CCV number: ");
//            String hold2 = in.nextLine();
//            int ccv = Integer.parseInt(hold2);
            
            //testing addPayment method via automatic input
            String type = "Mastercard";
            String hold1 = "4444192044441920";
            BigInteger held = new BigInteger(hold1);
            String name = "Test Name";
            String exp = "11/21";
            int ccv = 980;

            User user = dbu.getUser("test@email.com","testpass");
            System.out.println(user.getUser_id());
            dbp.addPayment(type, held, name, exp, ccv, user);
            System.out.println("payment detail added");
            
            //testing if retrieve by payment ID works
            PaymentDetails payment = dbp.fetchPaymentDetailsByUser(user);
            int ID = payment.getPayment_details_id();
            payment = dbp.fetchPaymentDetailsById(ID);
            System.out.println(payment.getCard_number());
//           
            //checking if the added payment method exists
//            System.out.println("Fetching stored payment details");
//            PaymentDetails payment = dbp.fetchPaymentDetailsByUser(user);
//            System.out.println("Card number is: " + payment.getCard_number());

              //testing update
//            System.out.println("Updating payment details");
//            PaymentDetails payment = dbp.fetchPaymentDetailsByUser(user);
//            int ID = payment.getPayment_details_id();
//            dbp.updatePayment(ID, "Newcardtype", held, name, exp, ccv);
              
              //testing delete
//            System.out.println("Deleting payment details");
//            PaymentDetails payment = dbp.fetchPaymentDetailsByUser(user);
//            int ID = payment.getPayment_details_id();
//            dbp.deletePayment(ID);
            
            connector.closeConnection();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

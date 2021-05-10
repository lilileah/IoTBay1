/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.controller;

import java.sql.*;
import java.util.*;
import java.util.logging.*;
import uts.isd.model.dao.DBConnector;

import java.time.*;
import java.util.Date;
import uts.isd.model.dao.*;
import uts.isd.model.dao.BBManager_Orders;
/**
 * 
 * 
 *
 * @author lilil
 */
public class Test_Order {
    private static Scanner in = new Scanner(System.in);

 

public static void main(String[] args) {

try {

DBConnector connector = new DBConnector();

Connection conn = connector.openConnection();

BBManager_Orders db = new BBManager_Orders(conn);

 

System.out.print("Order Date: ");

String date = in.nextLine();

System.out.print("User ID: ");

String userID = in.nextLine();

System.out.print("Order ID: ");

String orderID= in.nextLine();

System.out.print("order ID: ");

String invoiceID = in.nextLine();

db.addOrder( date, userID, orderID, invoiceID);

System.out.println("Order is added to the database.");

connector.closeConnection();

 

} catch (ClassNotFoundException | SQLException ex) {

Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);

}

}

    
}

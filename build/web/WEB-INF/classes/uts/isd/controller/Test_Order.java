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
import uts.isd.model.dao.DBOrders;
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

DBOrders db = new DBOrders(conn);

 
db.addOrder( "11/12/20", 7, 2, 3);

System.out.println("Order is added to the database.");

connector.closeConnection();

 

} catch (ClassNotFoundException | SQLException ex) {

Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);

}

}

    
}

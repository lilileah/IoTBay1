/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.controller;

import java.sql.*;
import java.util.*;
import java.util.logging.*;
import uts.isd.model.dao.*;

public class TestDB {

    //this script tests the functions of Product_manager
    public static void main(String[] args) {
        try {

            DBConnector connector = new DBConnector();

            Connection conn = connector.openConnection();

            DBMproduct db = new DBMproduct(conn);
            

            db.addProduct("dfogk", (float)51.41, (float)968.5);

            System.out.println("product is added to the database.");
            
            
            db.updateProduct(1, "product A", (float)51.41, (float)0.0);

            System.out.println("product is updated.");
            

            connector.closeConnection();

        } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


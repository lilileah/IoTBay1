/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.controller;

import java.sql.*;
import java.time.*;
import java.util.*;
import java.util.Date;
import java.util.logging.*;
import uts.isd.model.dao.*;

public class Test_User {

    //private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {

            DBConnector connector = new DBConnector();

            Connection conn = connector.openConnection();

            //DBManager_product db = new DBManager_product(conn);
            
            DBManager_user db = new DBManager_user(conn);
            
            //db.addUser("spolgar@cvt.com.au", "Samuel Polgar", "Password1", "+61412767767", 1991-12-17, "A");
    
            
            String str="2015-03-31";  
            LocalDate ld = LocalDate.parse( str ) ;

            db.addUser("spolgar@cvt.com.au", "Samuel Polgar", "Password1", "+61412767767", ld, "Male", "A");
            //String userEmail, String name, String password, String phone, LocalDate dob, String gender, String userType
            
            //db.addUser(userEmail, name, password, phone, dob, gender, userType);
            
            //db.addUser("prod", (float)51.41, (float)968.5);

            System.out.println("User is added to the database.");

            connector.closeConnection();

        } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(Test_User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


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
            
            DBManager_user db = new DBManager_user(conn);
            
            //creating a date variable
            String str="2015-03-31";  
            LocalDate ld = LocalDate.parse( str ) ;

            //Test for adding a new user
            //db.addUser("spolgar@cvt.com.au", "Samuel Polgar", "Password1", "+61412767767", ld, "Male", "A");
            
            //Test for updating a user
            db.updateUser(104, "sexyblackman104@blackman.com", "Gomez Gomez", "BigBlack", "13Unbelieveable", ld, "Male", "A");
            
            //Test for deleting a user
            //db.deleteUser(103);
            
            System.out.println("User is added to the database.");

            connector.closeConnection();

        } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(Test_User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

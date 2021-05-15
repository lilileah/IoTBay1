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
import uts.isd.model.User;
import uts.isd.model.dao.*;

public class Test_User {

    public static void main(String[] args) throws SQLException {
            
            DBMuser db = new DBMuser();
            
            
            User foundUser = db.getUser("sampolgar@gmail.com9988", "123123");
            if(foundUser != null){
                System.out.println(foundUser.getPhone() + " and " + foundUser.getUser_id());
                db.deleteUserById(foundUser.getUser_id());
                System.out.println("deleted user");
            } else {
                System.out.println("found user null");
            }

            
            
            
                
            //Test for adding a new user
            //db.addUser("spolgar@cvt.com.augomez", "Samuel Polgar1", "Password1", "+61412767767", "2015-03-31", "Male", "A");
//            User newUser = new User();
//            newUser.setUsername_email("spolgar@cvt.com.augomez");
//            newUser.setUser_name("Samuel_Polgar");
//            newUser.setPassword("Here123");
//            newUser.setPhone("+61412767767");
//            newUser.setDob("10/7/1996");
//            newUser.setGender("Male");
//            newUser.setUser_type("A");
//            db.addUser(newUser);
            
            //Test for getting a user by Id - Working
//            User foundUser = db.getUserById(10);
//            System.out.println("updating user"+foundUser.getUser_name()+"with id: "+foundUser.getUser_id());
//            foundUser.setPhone("Updated123");
//            db.updateUser(foundUser);
            

            //Test for deleting a user
            //db.deleteUser(103);
            
            //System.out.println("User is added to the database.");

            //connector.closeConnection();

    }
}
package uts.isd.model.dao;

import uts.isd.model.User;
import java.sql.*;
import java.util.ArrayList;

/* 
* DBManager is the primary DAO class to interact with the database. 
* Complete the existing methods of this classes to perform CRUD operations with the db.
 */
public class DBManager_user {

    private Statement st;

    public DBManager_user(Connection conn) throws SQLException {
        st = conn.createStatement();
    }
    //Find user by email and password in the database   
    //user
    //Create: sign up with full name, email, password, phone
    
    
    //Read: view registration detail
    //Read: login and logout
    
    //Update: registered user can update their registration details
    
    //Delete: registered user can cancel their registration
    
    
    
   
    //user access logs
    //Create: Logs are stored in the database (user id, login datetime, logout datetime)
    
    //Read: Customer and staff can view access logs and search
    
    //Update: user cannot update access logs
    
    //Delete: user cannot delete

    
}

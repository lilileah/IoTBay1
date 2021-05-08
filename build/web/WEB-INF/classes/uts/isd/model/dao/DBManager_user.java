package uts.isd.model.dao;

import uts.isd.model.User;
import java.sql.*;
import java.time.LocalDate;
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
    
   
    //Read: Find user by username and email
    public User findUser(String email, String password) throws SQLException {
        String fetch = "select * from IOTBaydb.Users where EMAIL = '" + email + "' and PASSWORD='" + password + "'";
        ResultSet rs = st.executeQuery(fetch);
        
        while(rs.next()){
            String userEmail = rs.getString(2);
            String userPass = rs.getString(4);
            if(userEmail.equals(email) && userPass.equals(password)){
                String name = rs.getString(3);
                String phone = rs.getString(5);
                Date dob = rs.getDate(6);
            }
        }
        return null;
    }
    
    //Read: view registration detail = findUserById()
    
    public User findUserById(int id) throws SQLException {
        String fetch = "select * from IOTBaydb.Users where ID = '" + id + "'";
        ResultSet rs = st.executeQuery(fetch);
        
        while(rs.next()){
            int userId = rs.getInt(1);
            String userEmail = rs.getString(2);
            String name = rs.getString(3);
            String userPass = rs.getString(4);
            String phone = rs.getString(5);
            Date dob = rs.getDate(6);
        }
    return null;
}
    
    
    
    //Read: login and logout
    
    //Update: registered user can update their registration details
    //create user
    //Add a user-data into the database   
public void addUser(String userEmail, String name, String password, String phone, LocalDate dob, String gender, String userType) throws SQLException {                   //code for add-operation       
  st.executeUpdate("INSERT INTO ISDUSER.Users " + "VALUES ('" + userEmail + "','" + name + "','" + password + "','" + phone + "', '" + gender + "', '" + userType + "')");
}

    public void addUser(String spolgarcvtcomau, String samuel_Polgar, String password1, String string, LocalDate ld, String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//update a user details in the database   
//public void updateUser( String email, String name, String password, String gender, String favcol) throws SQLException {       
//  st.executeUpdate("UPDATE ISDUSER.Users SET NAME='" + name + "', PASSWORD='" + password + "',GENDER= '" + gender + "', FAVCOL= '" + favcol + "', EMAIL= '" + email + "' WHERE EMAIL = '" + email + "' ");
//
//}  
    //update user
    
    //Delete: registered user can cancel their registration
    
    
    
   
    //user access logs
    //Create: Logs are stored in the database (user id, login datetime, logout datetime)
    
    //Read: Customer and staff can view access logs and search
    
    //Update: user cannot update access logs
    
    //Delete: user cannot delete

//    public void addUser(String spolgarcvtcomau, String samuel_Polgar, String password1, String string, java.util.Date myDate, String a) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }



    
}

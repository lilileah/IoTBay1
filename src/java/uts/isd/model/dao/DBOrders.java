/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import uts.isd.model.User;

import uts.isd.model.User;
import java.sql.*;

/**
 *
 * @author lilil
 */
public class DBOrders {
    

private Statement st;
   
public DBOrders(Connection conn) throws SQLException {       
   st = conn.createStatement();   
}

    public DBOrders() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//Find user by email and password in the database   
//public User findUser(String email, String password) throws SQLException {
//    String fetch = "select * from iotbay.orders where EMAIL = '"+ email + "' and PASSWORD='"+password+"'";
//    ResultSet rs = st.executeQuery(fetch);
    
//    while (rs.next()){
//        String userEmail = rs.getString(2);
//        String userPass = rs.getString(3);
//        if(userEmail.equals(email) && userPass.equals(password)){
//            String userName = rs.getString(1);
//            String favcol = rs.getString(4);
//            return new User(userName, userEmail, password, favcol);
//        
//        }
    
//    }           
//   return null;   
//}

//Add a user-data into the database   
public void addOrder(String date, double total_price, int totalItems, int userID) throws SQLException {                   //code for add-operation       
  st.executeUpdate("INSERT INTO iotbay.orders (ORDER_DATE, TOTAL_PRICE, TOTAL_ITEMS, USER_ID)" + 
          "VALUES('" + date + "'," + total_price + "," + totalItems + ","+ userID +")");

}

//update a user details in the database   
public void updateUser( String email, String name, String password, String gender, String favcol) throws SQLException {       
   //code for update-operation   
   st.executeUpdate("UPDATE ISDUSER.users SET NAME='" + name + "',PASSWORD='" + password + "',GENDER='" + gender + "',FAVCOL'" + favcol + "'WHERE EMAIL='" + email + "'");

}       

//delete a user from the database   
public void deleteUser(String email) throws SQLException{       
   //code for delete-operation   
   st.executeUpdate("DELETE FROM ISDUSER.users WHERE EMAIL='" + email + "'");

}


 

}
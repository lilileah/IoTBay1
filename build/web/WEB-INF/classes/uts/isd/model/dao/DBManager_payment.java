/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.model.dao;

import java.math.BigInteger;
import uts.isd.model.PaymentDetails;
import java.sql.*;
import java.util.ArrayList;
import uts.isd.model.User;

/**
 *
 * @author timfi
 */

public class DBManager_payment {

private Statement st;
   
public DBManager_payment(Connection conn) throws SQLException {       
   st = conn.createStatement();   
}

//Find a set of payment details by its unique ID in the database   
public PaymentDetails fetchPaymentDetailsById(int _ID) throws SQLException {
    String cmd = "SELECT * FROM iotbay.PAYMENT_DETAILS WHERE payment_details_id =" + _ID + "";
    ResultSet rs = st.executeQuery(cmd);

    while (rs.next()) {
        int ID = rs.getInt(1);
        String type = rs.getString(2);
        String hold = rs.getString(3);
        BigInteger number = new BigInteger(hold);
        String owner = rs.getString(4);
        String exp = rs.getString(5);
        int CCV = rs.getInt(6);
        int userID = rs.getInt(7);
        String amount = rs.getString(8);
     
        if (ID == _ID) {
            return new PaymentDetails(ID, type, number, owner, exp, CCV, userID, amount);
        }
    }
    return null;
}

public ArrayList<PaymentDetails> fetchPaymentDetailsByUser(User user) throws SQLException {
    int userID = user.getUser_id();
    String cmd = "SELECT * from iotbay.PAYMENT_DETAILS where USER_ID = " + userID + "";
    ResultSet rs = st.executeQuery(cmd);
    int i = 0;
    ArrayList<PaymentDetails> details = new ArrayList<PaymentDetails>();
    
    while (rs.next()) {
        int ID = rs.getInt(1);
        String type = rs.getString(2);
        String hold = rs.getString(3);
        BigInteger number = new BigInteger(hold);
        String owner = rs.getString(4);
        String exp = rs.getString(5);
        int CCV = rs.getInt(6);
        int theirID = rs.getInt(7);
        String amount = rs.getString(8);
     
        if (theirID == userID) {
            details.add(new PaymentDetails(ID, type, number, owner, exp, CCV, theirID, amount));
        }
    }
    if(details != null)
        return details;
    else
        return null;
}


//Add a set of payment details into the database   
public void addPayment(String type, BigInteger number, String owner, String date, int CCV, User user, String amount) throws SQLException {                   //code for add-operation       
    int userID;
    userID = user.getUser_id();
    st.executeUpdate("INSERT INTO iotbay.PAYMENT_DETAILS (Card_Type, Card_Number, Owner_Name, Exp_Date, CCV, USER_ID, Amount)" + 
         " VALUES ('" 
            + type + "'," + number + ",'" + owner  + "','" + date + "'," + CCV + "," + userID + ",'" + amount + "')");   

}

//update a set of payment details in the database by its ID 
public void updatePayment(int ID, String type, BigInteger number, String owner, String date, int CCV, String amount) throws SQLException {       
    st.executeUpdate("UPDATE iotbay.PAYMENT_DETAILS "
                + "SET CARD_TYPE='" + type + "',CARD_NUMBER=" + number + ", OWNER_NAME='" + owner + "',EXP_DATE='" + date + "',CCV=" + CCV + ",AMOUNT='" + amount + "'"
                + " WHERE PAYMENT_DETAILS_ID=" + ID +"");  

}       

//delete a set of payment detais from the database by its ID
public void deletePayment(int ID) throws SQLException{       
   st.executeUpdate("DELETE FROM iotbay.PAYMENT_DETAILS WHERE PAYMENT_DETAILS_ID =" + ID);   

}
}

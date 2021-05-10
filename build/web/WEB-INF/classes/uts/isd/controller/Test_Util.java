package uts.isd.controller;

import java.sql.*;
import java.time.*;
import java.util.*;
import java.util.Date;
import java.util.logging.*;
import uts.isd.model.dao.*;
import java.sql.Timestamp;

public class Test_Util {

    //private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            
            DBConnector connector = new DBConnector();

            Connection conn = connector.openConnection();
            
            DBMutil db = new DBMutil(conn);
            
            //creating a datetime of now.
            Date date = new Date();  
            Timestamp ts = new Timestamp(date.getTime());  
            System.out.println(ts.getClass());
            String tsString = ts.toString();
            System.out.println(tsString);
            String str1 = "hello";
            
            //Test for adding a log to the database
           //db.addLog(tsString, tsString, 104);
           db.addLog(str1, str1, 4);
          // System.out.println("Ts is added to the database.");

            //Test for updating log with logoff time
            
            
            //Test for getting a log from the data base
//            db.updateLog(1, ts);
//            System.out.println("log updated");

            //Fetch logs for user Id
           // db.fetchLogsByUserId(104);
           // System.out.println("log got from DB");
            //Fetch all logs
            //db.fetchAllLogs();
            

            connector.closeConnection();

        } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(Test_Util.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.model.dao;
import java.sql.*;
/**
 *
 * @author Dean
 */
public abstract class DB {
    
    protected String url = "jdbc:derby://localhost:1572/";
    protected String db = "iotbaydb";
    protected String dbuser = "iotbay";
    protected String dbpass = "admin";
    protected String driver = "org.apache.derby.jdbc.ClientDriver";
    protected Connection conn;
            
    
}

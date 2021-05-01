package uts.isd.model.dao;

import uts.isd.model.User;
import java.sql.*;
import java.util.ArrayList;

/* 
* DBManager is the primary DAO class to interact with the database. 
* Complete the existing methods of this classes to perform CRUD operations with the db.
 */
public class DBManager_product {

    private Statement st;

    public DBManager_product(Connection conn) throws SQLException {
        st = conn.createStatement();
    }
    
    //find all products
    
}

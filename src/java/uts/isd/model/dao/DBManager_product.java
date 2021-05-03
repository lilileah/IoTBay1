package uts.isd.model.dao;

import uts.isd.model.User;
import java.sql.*;
import java.util.ArrayList;
import uts.isd.model.Product;

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
    public ArrayList<Product> fetchProducts() throws SQLException{
        String cmd = "SELECT * FROM iotbaydb.products";
        ResultSet rs = st.executeQuery(cmd);
        ArrayList<Product> productList = new ArrayList();
        
        while(rs.next()){
            int ID = rs.getInt(1);
            String name = rs.getString(2);
            float price = rs.getFloat(3);
            float discount = rs.getFloat(4);
            
            productList.add(new Product(ID, name, price, discount));
        }
        
        return productList;
    }
    
    //find products by name
    public ArrayList<Product> fetchProductsByName(String productName) throws SQLException{
        String cmd = "SELECT * FROM iotbaydb.products WHERE product_name LIKE %" + productName + "%";
        ResultSet rs = st.executeQuery(cmd);
        ArrayList<Product> productList = new ArrayList();
        
        while(rs.next()){
            int ID = rs.getInt(1);
            String name = rs.getString(2);
            float price = rs.getFloat(3);
            float discount = rs.getFloat(4);
            
            productList.add(new Product(ID, name, price, discount));
        }
        
        return productList;
    }
    
    //find product by ID
    public Product fetchProductsById(int _ID) throws SQLException{
        String cmd = "SELECT * FROM iotbaydb.products WHERE product_id EQUALS " + _ID + "";
        ResultSet rs = st.executeQuery(cmd);
        ArrayList<Product> productList = new ArrayList();
                
        while(rs.next()){
            int ID = rs.getInt(1);
            String name = rs.getString(2);
            float price = rs.getFloat(3);
            float discount = rs.getFloat(4);
            
            if(ID == _ID){
                return new Product(ID, name, price, discount);
            }

        }
        return null;
    }
}

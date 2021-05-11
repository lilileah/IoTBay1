package uts.isd.model.dao;

import uts.isd.model.User;
import java.sql.*;
import java.util.ArrayList;
import uts.isd.model.Product;

/* 
* DBManager is the primary DAO class to interact with the database. 
* Complete the existing methods of this classes to perform CRUD operations with the db.
 */
public class DBMproduct {

    private Statement st;

    public DBMproduct(Connection conn) throws SQLException {
        st = conn.createStatement();
    }

    //find max ID -- no longer used
    public int fetchHighestID() throws SQLException {
        String cmd = "SELECT product_ID FROM iotbay.products";
        ResultSet rs = st.executeQuery(cmd);

        while (rs.next()) {
            int ID = rs.getInt(1);

            return ID;
        }

        return -1;
    }

    //find all products
    public ArrayList<Product> fetchProducts() throws SQLException {
        String cmd = "SELECT * FROM iotbay.products";
        ResultSet rs = st.executeQuery(cmd);
        ArrayList<Product> productList = new ArrayList<Product>();

        while (rs.next()) {
            int ID = rs.getInt(1);
            String name = rs.getString(2);
            float price = rs.getFloat(3);
            float discount = rs.getFloat(4);

            productList.add(new Product(ID, name, price, discount,null));
        }

        return productList;
    }

    //find products by name
    public ArrayList<Product> fetchProductsByName(String productName) throws SQLException {
        String cmd = "SELECT * FROM iotbay.products WHERE product_name LIKE %" + productName + "%";
        ResultSet rs = st.executeQuery(cmd);
        ArrayList<Product> productList = new ArrayList<Product>();

        while (rs.next()) {
            int ID = rs.getInt(1);
            String name = rs.getString(2);
            float price = rs.getFloat(3);
            float discount = rs.getFloat(4);

            productList.add(new Product(ID, name, price, discount, null));
        }

        return productList;
    }

    //find product by ID
    public Product fetchProductsById(int _ID) throws SQLException {
        String cmd = "SELECT * FROM iotbay.products WHERE product_id EQUALS " + _ID + "";
        ResultSet rs = st.executeQuery(cmd);
        ArrayList<Product> productList = new ArrayList<Product>();

        while (rs.next()) {
            int ID = rs.getInt(1);
            String name = rs.getString(2);
            float price = rs.getFloat(3);
            float discount = rs.getFloat(4);

            if (ID == _ID) {
                return new Product(ID, name, price, discount, null);
            }

        }
        return null;
    }

    //create product
    public void addProduct(String name, float price, float discount) throws SQLException {
        st.executeUpdate("INSERT INTO iotbay.products (PRODUCT_NAME, PRICE, DISCOUNT)"
                + " VALUES ('" + name + "'," + price + "," + discount + ")");
    }

    //update by ID
    public void updateProduct(int ID, String name, float price, float discount) throws SQLException {
        st.executeUpdate("UPDATE iotbay.products "
                + "SET PRODUCT_NAME='" + name + "',PRICE=" + price + ", DISCOUNT=" + discount + ""
                + " WHERE PRODUCT_ID=" + ID + "");
    }

    //delete
    public void deleteProduct(int ID) throws SQLException {
        st.executeUpdate("DELETE FROM iotbay.products WHERE PRODUCT_ID=" + ID);
    }
}

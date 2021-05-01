package uts.isd.model.dao;

import java.sql.*;

public class DBConnector extends DB {

    public DBConnector() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        conn = DriverManager.getConnection(url+db, dbuser, dbpass);
    }

    public Connection openConnection() {
        return this.conn;
    }

    public void closeConnection() throws SQLException {
        this.conn.close();
    }
}

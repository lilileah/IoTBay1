package uts.isd.model.dao;

import uts.isd.model.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import uts.isd.model.Product;
import uts.isd.model.Shipment;

/* 
* DBManager is the primary DAO class to interact with the database. 
* Complete the existing methods of this classes to perform CRUD operations with the db.
 */
public class DBShipment {

    private Connection conn;

    public DBShipment() {
        try {
            DBConnector connector = new DBConnector();
            conn = connector.openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DBShipment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBShipment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Shipment getShipmentsById(int shipmentId) {
        List<Shipment> list = new ArrayList();
        String sql = "select * from shipment where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, shipmentId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Shipment(rs.getInt("ID"), rs.getInt("ORDERID"), rs.getInt("USERID"),
                        rs.getString("NAME"), rs.getString("MOBILE"), rs.getString("ADDRESS1"), rs.getString("ADDRESS2"), rs.getString("SUBURB"), rs.getString("CITY"), rs.getString("STATE"), rs.getString("POSTCODE"), rs.getString("STATUS"), rs.getString("METHOD"), rs.getDate("SHIPMENT_TIME").toString());

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBShipment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Shipment> getShipmentsByUserId(int userId) {
        List<Shipment> list = new ArrayList();
        String sql = "select * from shipment where userId=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Shipment shipment = new Shipment(rs.getInt("ID"), rs.getInt("ORDERID"), rs.getInt("USERID"),
                        rs.getString("NAME"), rs.getString("MOBILE"), rs.getString("ADDRESS1"), rs.getString("ADDRESS2"), rs.getString("SUBURB"), rs.getString("CITY"), rs.getString("STATE"), rs.getString("POSTCODE"), rs.getString("STATUS"), rs.getString("METHOD"), rs.getDate("SHIPMENT_TIME").toString());
                list.add(shipment);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBShipment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void addShipment(Shipment shipment) throws SQLException {
        String sql = "INSERT INTO iotbay.shipment (ORDERID, USERID, NAME, MOBILE, ADDRESS1, ADDRESS2, SUBURB, CITY, STATE, POSTCODE, METHOD) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, shipment.getOrderId());
        ps.setInt(2, shipment.getUserId());
        ps.setString(3, shipment.getName());
        ps.setString(4, shipment.getMobile());
        ps.setString(5, shipment.getAddress1());
        ps.setString(6, shipment.getAddress2());
        ps.setString(7, shipment.getSuburb());
        ps.setString(8, shipment.getCity());
        ps.setString(9, shipment.getState());
        ps.setString(10, shipment.getPostcode());
        ps.setString(11, shipment.getMethod());
        ps.executeUpdate();
    }

    //create product
    public void updateShipment(Shipment shipment) throws SQLException {
        String sql = "update iotbay.shipment set NAME=?, MOBILE=?, ADDRESS1=?, ADDRESS2=?, SUBURB=?, CITY=?, STATE=?, POSTCODE=?, METHOD=? where ID=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, shipment.getName());
        ps.setString(2, shipment.getMobile());
        ps.setString(3, shipment.getAddress1());
        ps.setString(4, shipment.getAddress2());
        ps.setString(5, shipment.getSuburb());
        ps.setString(6, shipment.getCity());
        ps.setString(7, shipment.getState());
        ps.setString(8, shipment.getPostcode());
        ps.setString(9, shipment.getMethod());
        ps.setInt(10, shipment.getId());
        ps.executeUpdate();
    }

    public void deleteShipmentsById(int id) {
        String sql = "delete from shipment where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DBShipment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void finalizeShipmentsById(int id) {
        String sql = "update iotbay.shipment set STATUS=? where ID=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Shipped");
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBShipment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Shipment> searchShipmentsByUserId(int userId, String shipmentId, String from, String to) {
        List<Shipment> list = new ArrayList();
        String sql = "select * from shipment where userId=" + userId;
        if (shipmentId != null && !shipmentId.isEmpty()) {
            sql += " and id=" + shipmentId;
        }
        if (from != null && !from.isEmpty()) {
            sql += " and shipment_time>='" + from + " 00:00:00'";
        }
        if (to != null && !to.isEmpty()) {
            sql += " and shipment_time<='" + to + " 23:59:59'";
        }
        System.out.println(sql);
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Shipment shipment = new Shipment(rs.getInt("ID"), rs.getInt("ORDERID"), rs.getInt("USERID"),
                        rs.getString("NAME"), rs.getString("MOBILE"), rs.getString("ADDRESS1"), rs.getString("ADDRESS2"), rs.getString("SUBURB"), rs.getString("CITY"), rs.getString("STATE"), rs.getString("POSTCODE"), rs.getString("STATUS"), rs.getString("METHOD"), rs.getDate("SHIPMENT_TIME").toString());
                list.add(shipment);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBShipment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}

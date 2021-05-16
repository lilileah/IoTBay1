package uts.isd.model.dao;

import uts.isd.model.User;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import uts.isd.model.AccessLogs;

/**
 *
 * @author samuelpolgar
 */


public class DBMlogs {

    private Connection conn;

    //Create a user
    public DBMlogs() {
        try {
            DBConnector connector = new DBConnector();
            conn = connector.openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DBMuser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBMuser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

        public void addLog(int user_id, String action) throws SQLException {
            String sql = "INSERT INTO access_logs (USER_ID, TIME, ACTION) VALUES (?,CURRENT_TIMESTAMP,?)";   
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, user_id);
            ps.setString(2, action);
            ps.executeUpdate();
    }
        
    public ArrayList<AccessLogs> getAllLogs() throws SQLException {
        ArrayList<AccessLogs> logsList = new ArrayList();
        String sql = "SELECT * FROM access_logs";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                AccessLogs logs = new AccessLogs(
                rs.getInt("LOG_ID"),
                rs.getInt("USER_ID"),
                rs.getString("ACTION"),
                rs.getTimestamp("TIME")
                ); 
                    logsList.add(logs);
            }   
        } catch (SQLException ex ){
            Logger.getLogger(DBMlogs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return logsList;
    }
    
    public ArrayList<AccessLogs> getLogsByUserId(int user_id) throws SQLException {
        ArrayList<AccessLogs> logsList = new ArrayList();
        String sql = "SELECT * FROM access_logs where USER_ID=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, user_id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                AccessLogs logs = new AccessLogs(
                rs.getInt("LOG_ID"),
                rs.getInt("USER_ID"),
                rs.getString("ACTION"),
                rs.getTimestamp("TIME")
                ); 
                    logsList.add(logs);
            }   
        } catch (SQLException ex ){
            Logger.getLogger(DBMlogs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return logsList;
    }
    
}
 
//    //Get log by user_id
//     //public AccessLogs findLogByUserId(int log_id)
//    public ArrayList<AccessLogs> fetchLogsByUserId(int user_id)
//            throws SQLException{
//        
//        String query = "SELECT * FROM ACCESS_LOGS WHERE USER_ID = %s";
//        ResultSet rs = st.executeQuery(String.format(query, user_id));
//        ArrayList<AccessLogs> userLogs = new ArrayList();
//        
//        while(rs.next()){
//            int logId = rs.getInt(1);
//            Timestamp logon_datetime = rs.getTimestamp(2);
//            Timestamp logoff_datetime = rs.getTimestamp(3);
//            int userId = rs.getInt(4);
//        }
//        return userLogs;
//    }
//    
//    
//    //Get all logs
//        public ArrayList<AccessLogs> fetchAllLogs()
//            throws SQLException{
//        
//        String query = "SELECT * FROM ACCESS_LOGS";
//        ResultSet rs = st.executeQuery(String.format(query));
//        ArrayList<AccessLogs> allLogs = new ArrayList();
//        
//        while(rs.next()){
//            int logId = rs.getInt(1);
//            Timestamp logon_datetime = rs.getTimestamp(2);
//            Timestamp logoff_datetime = rs.getTimestamp(3);
//            int userId = rs.getInt(4);
//        }
//        return allLogs;
//    }
//    
//}
//

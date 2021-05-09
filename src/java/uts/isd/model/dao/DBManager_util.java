package uts.isd.model.dao;

import uts.isd.model.User;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import uts.isd.model.AccessLogs;

/**
 *
 * @author samuelpolgar
 */
public class DBManager_util {
    
    private Statement st;

    public DBManager_util(Connection conn) throws SQLException {
        st = conn.createStatement();
    }
    
    //create logs
    public void addLog(Timestamp logon_datetime, Timestamp logout_datetime, int user_id)
            throws SQLException {
                String query = "INSERT INTO ACCESS_LOGS ("
                        + "LOGIN_DATETIME, "
                        + "LOGOUT_DATETIME, "
                        + "USER_ID) "
                        + "VALUES (%s, %s, %s)";
                
                st.executeUpdate(String.format(query, logon_datetime, logout_datetime, user_id));
    }
    
    //Update log by id
    public void updateLog(int log_id,Timestamp logout_datetime) 
            throws SQLException{
                String query = "UPDATE ACCESS_LOGS SET "
                        + "LOGOUT_DATETIME=%s"
                        + "WHERE LOG_ID=%s";
                
                st.executeUpdate(String.format(query, logout_datetime, log_id));
    }
    
    
    //Get log by user_id
     //public AccessLogs findLogByUserId(int log_id)
    public ArrayList<AccessLogs> fetchLogsByUserId(int user_id)
            throws SQLException{
        
        String query = "SELECT * FROM ACCESS_LOGS WHERE USER_ID = %s";
        ResultSet rs = st.executeQuery(String.format(query, user_id));
        ArrayList<AccessLogs> userLogs = new ArrayList();
        
        while(rs.next()){
            int logId = rs.getInt(1);
            Timestamp logon_datetime = rs.getTimestamp(2);
            Timestamp logoff_datetime = rs.getTimestamp(3);
            int userId = rs.getInt(4);
        }
        return userLogs;
    }
    
    
    //Get all logs
        public ArrayList<AccessLogs> fetchAllLogs()
            throws SQLException{
        
        String query = "SELECT * FROM ACCESS_LOGS";
        ResultSet rs = st.executeQuery(String.format(query));
        ArrayList<AccessLogs> allLogs = new ArrayList();
        
        while(rs.next()){
            int logId = rs.getInt(1);
            Timestamp logon_datetime = rs.getTimestamp(2);
            Timestamp logoff_datetime = rs.getTimestamp(3);
            int userId = rs.getInt(4);
        }
        return allLogs;
    }
    
}


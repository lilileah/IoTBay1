package uts.isd.model;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class AccessLogs implements Serializable {
    private int log_id;
    private int user_id;  
    private String action;
    private Timestamp time;

    public AccessLogs(int log_id, int user_id, String action, Timestamp time) {
        this.log_id = log_id;
        this.user_id = user_id;
        this.action = action;
        this.time = time;
    }
    
    public AccessLogs(int user_id, String action, Timestamp time) {
        this.user_id = user_id;
        this.action = action;
        this.time = time;
    }
    
    public AccessLogs(){
    }

    public int getLog_id() {
        return log_id;
    }

    public void setLog_id(int log_id) {
        this.log_id = log_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
    
    
}
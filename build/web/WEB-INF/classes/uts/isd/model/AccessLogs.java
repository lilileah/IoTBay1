package uts.isd.model;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class AccessLogs implements Serializable {
    private int log_id;
    private Timestamp login_datetime;
    private Timestamp logout_datetime;
    private int user_id;  

    public AccessLogs(int log_id, Timestamp login_datetime, Timestamp logout_datetime, int user_id) {
        this.log_id = log_id;
        this.login_datetime = login_datetime;
        this.logout_datetime = logout_datetime;
        this.user_id = user_id;
    }

    public int getLog_id() {
        return log_id;
    }

    public void setLog_id(int log_id) {
        this.log_id = log_id;
    }

    public Timestamp getLogin_datetime() {
        return login_datetime;
    }

    public void setLogin_datetime(Timestamp login_datetime) {
        this.login_datetime = login_datetime;
    }

    public Timestamp getLogout_datetime() {
        return logout_datetime;
    }

    public void setLogout_datetime(Timestamp logout_datetime) {
        this.logout_datetime = logout_datetime;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }  
}
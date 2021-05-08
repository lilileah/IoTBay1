package uts.isd.model;
import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable {
    private int user_id;
    private String username_email; 
    private String user_name; 
    private String password;
    private String phone;
    private Date dob;
    private String gender;
    private String user_type;
    private Iterable<User> users;


    public User(int user_id, String username_email, String user_name, String password, String phone, Date dob, String gender, String user_type, Iterable<User> users) {
        this.user_id = user_id;
        this.username_email = username_email;
        this.user_name = user_name;
        this.password = password;
        this.phone = phone;
        this.dob = dob;
        this.gender = gender;
        this.user_type = user_type;
        this.users = users;
    }

    public int getUser_id() {
        return user_id;
    }
    
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername_email() {
        return username_email;
    }
    
    public void setUsername_email(String username_email) {
     this.username_email = username_email;
    }

    public String getUser_name() {
        return user_name;
    }
    
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUser_type() {
        return user_type;
    }
    
    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public Iterable<User> getUsers() {
        return users;
    }

    public void setUsers(Iterable<User> users) {
        this.users = users;
    }
    
 












}
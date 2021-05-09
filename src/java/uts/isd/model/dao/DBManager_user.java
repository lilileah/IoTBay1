package uts.isd.model.dao;

import uts.isd.model.User;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

/* 
* DBManager is the primary DAO class to interact with the database. 
* Complete the existing methods of this classes to perform CRUD operations with the db.
 */
public class DBManager_user {

    private Statement st;

    public DBManager_user(Connection conn) throws SQLException {
        st = conn.createStatement();
    }
    
    /* Adding Users */
    //add new user
    public void addUser(String userEmail, String name, String password, String phone, LocalDate dob, String gender, String userType) 
            throws SQLException {
                String query = "INSERT INTO USERS ("
                        + "USERNAME_EMAIL, "
                        + "USER_NAME, "
                        + "PASSWORD, "
                        + "PHONE, "
                        + "DOB, "
                        + "GENDER, "
                        + "USER_TYPE) "
                        + "VALUES (%s, %s, %s, %s, %s, %s, %s)";

                st.executeUpdate(String.format(query, userEmail, name, password, phone, dob, gender, userType));
    }  
    
    
    //Read: Find user by username and email
    public User findUser(String email, String password) throws SQLException {
        String fetch = "select * from Users where EMAIL = '" + email + "' and PASSWORD='" + password + "'";
        ResultSet rs = st.executeQuery(fetch);
        
        while(rs.next()){
            String userEmail = rs.getString(2);
            String userPass = rs.getString(4);
            if(userEmail.equals(email) && userPass.equals(password)){
                String name = rs.getString(3);
                String phone = rs.getString(5);
                Date dob = rs.getDate(6);
            }
        }
        return null;
    }
    
    //Read: view registration detail = findUserById()
    public User findUserById(int user_id) throws SQLException {
        String fetch = "select * from Users where USER_ID = '" + user_id + "'";
        ResultSet rs = st.executeQuery(fetch);
        
        while(rs.next()){
            int userId = rs.getInt(1);
            String userEmail = rs.getString(2);
            String name = rs.getString(3);
            String userPass = rs.getString(4);
            String phone = rs.getString(5);
            Date dob = rs.getDate(6);
            String gender = rs.getString(7);
            String userType = rs.getString(8);
        }
    return null;
}
    
    //find all users
    public ArrayList<User> fetchUsers() throws SQLException {
        String cmd = "SELECT * FROM users";
        ResultSet rs = st.executeQuery(cmd);
        ArrayList<User> userList = new ArrayList();

        while (rs.next()) {
            int userId = rs.getInt(1);
            String userEmail = rs.getString(2);
            String name = rs.getString(3);
            String userPass = rs.getString(4);
            String phone = rs.getString(5);
            Date dob = rs.getDate(6);
            String gender = rs.getString(7);
            String userType = rs.getString(8);
            userList.add(new User(userId, userEmail, name, userPass, phone, dob, gender, userType));
        }
        return userList;
    }

                

//Update by Id
    public void updateUser(int user_id, String userEmail, String name, String password, String phone, LocalDate dob, String gender, String userType) 
            throws SQLException {
               String query = "UPDATE USERS SET "
                       + "USERNAME_EMAIL='%s', "
                       + "USER_NAME='%s', "
                       + "PASSWORD='%s', "
                       + "PHONE='%s', "
                       + "DOB='%s', "
                       + "GENDER='%s', "
                       + "USER_TYPE='%s' "
                       + "WHERE USER_ID=%s";

               st.executeUpdate(String.format(query, userEmail, name, password, phone, dob, gender, userType, user_id));
    }

//Delete by Id
    public void deleteUser(int user_id) throws SQLException{
       String query = "DELETE FROM USERS "
               + "WHERE USER_ID=%s";

       st.executeUpdate(String.format(query, user_id));
    }

}

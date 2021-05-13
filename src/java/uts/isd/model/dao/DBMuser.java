package uts.isd.model.dao;
import uts.isd.model.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* 
* DBManager is the primary DAO class to interact with the database. 
* Complete the existing methods of this classes to perform CRUD operations with the db.
 */
public class DBMuser {

    //private Statement st;
    private Connection conn;
    //private PreparedStatement ps;


    //Create a user
    
    public DBMuser() {
        try {
            DBConnector connector = new DBConnector();
            conn = connector.openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DBMuser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBMuser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
        public void addUser(User user) throws SQLException {
        String sql = "INSERT INTO users (USERNAME_EMAIL, USER_NAME, PASSWORD, PHONE, DOB, GENDER, USER_TYPE) VALUES(?,?,?,?,?,?,?)";        
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, user.getUsername_email());
        ps.setString(2, user.getUser_name());
        ps.setString(3, user.getPassword());
        ps.setString(4, user.getPhone());
        ps.setString(5, user.getDob());
        ps.setString(6, user.getGender());
        ps.setString(7, user.getUser_type());
        ps.executeUpdate();
    }

    public User getUserById(int user_id) {
        String sql = "SELECT * FROM USERS WHERE USER_ID = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, user_id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return new User(
                rs.getInt("USER_ID"),
                rs.getString("USERNAME_EMAIL"),
                rs.getString("USER_NAME"),
                rs.getString("PASSWORD"),
                rs.getString("PHONE"),
                rs.getString("DOB"),
                rs.getString("GENDER"),
                rs.getString("USER_TYPE")
                );
            }
        } catch (SQLException ex){
            Logger.getLogger(DBMuser.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Returned null in get user by id DBMuser");
        return null;
    }

    public void updateUser(User user) throws SQLException {
        System.out.println("Id in the updateUser is: " + user.getUser_id());
        String sql = "update users set "
            + "USERNAME_EMAIL=?, "
            + "USER_NAME=?,"
            + "PASSWORD=?,"
            + "PHONE=?, "
            + "DOB=?,"
            + "GENDER=?,"
            + "USER_TYPE=?"
            + "WHERE USER_ID=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, user.getUser_id());
        ps.setString(2, user.getUsername_email());
        ps.setString(3, user.getUser_name());
        ps.setString(4, user.getPassword());
        ps.setString(5, user.getPhone());
        ps.setString(6, user.getDob());
        ps.setString(7, user.getGender());
        ps.setString(8, user.getUser_type());
        ps.executeUpdate();
    }
};
        
        
//    public DBMuser(Connection conn) throws SQLException {
//        st = conn.createStatement();
//    }
            /* Adding Users */
    //add new user
//    public void addUser(String USERNAME_EMAIL, String USER_NAME, String PASSWORD, String PHONE, String DOB, String GENDER, String USER_TYPE) 
//            throws SQLException {
//                String query = "INSERT INTO USERS ("
//                        + "USERNAME_EMAIL, "
//                        + "USER_NAME, "
//                        + "PASSWORD, "
//                        + "PHONE, "
//                        + "DOB, "
//                        + "GENDER, "
//                        + "USER_TYPE) "
//                        + "VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s')";
//
//                st.executeUpdate(String.format(query, USERNAME_EMAIL, USER_NAME, PASSWORD, PHONE, DOB, GENDER, USER_TYPE));
//    };


//        public User findUser(String USERNAME_EMAIL, String PASSWORD) throws SQLException {
//            System.out.println("Here finding a user");
//            String sql = "SELECT * FROM iotbay.users where USERNAME_EMAIL=? AND PASSWORD=?";
//            try{
//                PreparedStatement ps = conn.prepareStatement(sql);
//                ps.setString(2, USERNAME_EMAIL);
//                ps.setString(4, PASSWORD);
//                ResultSet rs = ps.executeQuery();
//                while (rs.next()){
//                return new User(
//                        rs.getInt("USER_ID"),
//                        rs.getString("USERNAME_EMAIL"),
//                        rs.getString("USER_NAME"),
//                        rs.getString("PASSWORD"),
//                        rs.getString("PHONE"),
//                        rs.getString("DOB"),
//                        rs.getString("GENDER"),
//                        rs.getString("USER_TYPE"));
//                }
//           }catch (SQLException ex){
//                        Logger.getLogger(DBMuser.class.getName()).log(Level.SEVERE, null, ex);
//           }
//            return null;
//        };
        
//Read: Find user by username and email
//    public User findUser(String email, String password) throws SQLException {
//        String fetch = "select * from Users where USERNAME_EMAIL = '" + email + "' and PASSWORD='" + password + "'";
//        ResultSet rs = st.executeQuery(fetch);
//        
//       while(rs.next()){
//            String USERNAME_EMAIL = rs.getString(2);
//            String PASSWORD = rs.getString(4);
//            if(USERNAME_EMAIL.equals(USERNAME_EMAIL) && PASSWORD.equals(PASSWORD)){
//                int USER_ID = rs.getInt(1);
//                String USERNAME = rs.getString(3);
//                String PHONE = rs.getString(5);
//                String DOB = rs.getString(6);
//                String GENDER = rs.getString(7);
//                String USER_TYPE = rs.getString(8);
//                return new User(USER_ID, USERNAME_EMAIL, USERNAME, PASSWORD, PHONE, DOB, GENDER, USER_TYPE);
//            }
//        }
//        return null;
//        }
//    }
        

//    
//    //Read: Find user by username and email
//    public User findUser(String email, String password) throws SQLException {
//        String fetch = "select * from Users where EMAIL = '" + email + "' and PASSWORD='" + password + "'";
//        ResultSet rs = st.executeQuery(fetch);
//        
//        while(rs.next()){
//            String userEmail = rs.getString(2);
//            String userPass = rs.getString(4);
//            if(userEmail.equals(email) && userPass.equals(password)){
//                String name = rs.getString(3);
//                String phone = rs.getString(5);
//                String dob = rs.getString(6);
//            }
//        }
//        return null;
//    }
//    
//    //Read: view registration detail = findUserById()
//    public User findUserById(int user_id) throws SQLException {
//        String fetch = "select * from Users where USER_ID = '" + user_id + "'";
//        ResultSet rs = st.executeQuery(fetch);
//        
//        while(rs.next()){
//            int userId = rs.getInt(1);
//            String userEmail = rs.getString(2);
//            String name = rs.getString(3);
//            String userPass = rs.getString(4);
//            String phone = rs.getString(5);
//            String dob = rs.getString(6);
//            String gender = rs.getString(7);
//            String userType = rs.getString(8);
//        }
//    return null;
//}
//    
//    //find all users
//    public ArrayList<User> fetchUsers() throws SQLException {
//        String cmd = "SELECT * FROM users";
//        ResultSet rs = st.executeQuery(cmd);
//        ArrayList<User> userList = new ArrayList();
//
//        while (rs.next()) {
//            int userId = rs.getInt(1);
//            String userEmail = rs.getString(2);
//            String name = rs.getString(3);
//            String userPass = rs.getString(4);
//            String phone = rs.getString(5);
//            String dob = rs.getString(6);
//            String gender = rs.getString(7);
//            String userType = rs.getString(8);
//            userList.add(new User(userId, userEmail, name, userPass, phone, dob, gender, userType));
//        }
//        return userList;
//    }
//
//                
//
////Update by Id
//    public void updateUser(int user_id, String userEmail, String name, String password, String phone, String dob, String gender, String userType) 
//            throws SQLException {
//               String query = "UPDATE USERS SET "
//                       + "USERNAME_EMAIL='%s', "
//                       + "USER_NAME='%s', "
//                       + "PASSWORD='%s', "
//                       + "PHONE='%s', "
//                       + "DOB='%s', "
//                       + "GENDER='%s', "
//                       + "USER_TYPE='%s' "
//                       + "WHERE USER_ID=%s";
//
//               st.executeUpdate(String.format(query, userEmail, name, password, phone, dob, gender, userType, user_id));
//    }
//
////Delete by Id
//    public void deleteUser(int user_id) throws SQLException{
//       String query = "DELETE FROM USERS "
//               + "WHERE USER_ID=%s";
//
//       st.executeUpdate(String.format(query, user_id));
//    }
//
//}

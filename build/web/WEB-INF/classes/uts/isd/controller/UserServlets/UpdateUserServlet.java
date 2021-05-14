package uts.isd.controller.UserServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import uts.isd.controller.ConnServlet;
import uts.isd.controller.Validator;
import uts.isd.model.User;
import uts.isd.model.dao.*;
import uts.isd.model.dao.DBConnector;

@WebServlet(name = "UpdateUserServlet", urlPatterns = {"/UpdateUserServlet"})
public class UpdateUserServlet extends ConnServlet {
    DBMuser dbmUser;
    
    
    public UpdateUserServlet(){
        dbmUser = new DBMuser();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                User user = dbmUser.getUserById(Integer.parseInt(request.getParameter("user_id")));
//                User user = dbmUser.getUserById(1);
                request.setAttribute("user", user);
                request.getRequestDispatcher("main.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
                    User user = new User();
                    user.setUser_id(Integer.parseInt(request.getParameter("USER_ID")));
                    user.setUsername_email(request.getParameter("USERNAME_EMAIL"));
                    user.setUser_name(request.getParameter("USER_NAME"));
                    user.setPassword(request.getParameter("PASSWORD"));
                    user.setPhone(request.getParameter("PHONE"));
                    user.setGender(request.getParameter("GENDER"));
                    user.setDob(request.getParameter("DOB"));
                    user.setUser_type(request.getParameter("USER_TYPE"));
                    
                    try {
                        System.out.println(user.toString());
                        dbmUser.updateUser(user);
                        //update session
                        HttpSession session = request.getSession();
                        session.setAttribute("user", user);
                    } catch (SQLException ex) {
                        Logger.getLogger(UpdateUserServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
            request.getRequestDispatcher("main.jsp").include(request, response);
            }
}
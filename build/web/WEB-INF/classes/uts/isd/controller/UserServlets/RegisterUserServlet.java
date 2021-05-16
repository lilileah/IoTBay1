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

@WebServlet(name = "RegisterUserServlet", urlPatterns = {"/RegisterUserServlet"})
public class RegisterUserServlet extends ConnServlet {

    DBMuser dbmUser;
    DBMlogs dbmLogs;

    public RegisterUserServlet() {
        dbmUser = new DBMuser();
        dbmLogs = new DBMlogs();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Before doing anything with the model - validte input
        Validator validator = new Validator(request);
        HttpSession session = request.getSession();
        validator.clear(session);
        
        if(!validator.validateEmail(request.getParameter("USERNAME_EMAIL"))){
             session.setAttribute("emailErr", "Error: Email format incorrect");
             request.getRequestDispatcher("register.jsp").include(request, response);
         } else if (!validator.validatePassword(request.getParameter("PASSWORD"))){
             session.setAttribute("passwordErr", "Error: Password needing to be more than 4 digits");
             request.getRequestDispatcher("register.jsp").include(request, response);
        } else {

            User user = new User();
            user.setUsername_email(request.getParameter("USERNAME_EMAIL"));
            user.setUser_name(request.getParameter("USER_NAME"));
            user.setPassword(request.getParameter("PASSWORD"));
            user.setPhone(request.getParameter("PHONE"));
            user.setGender(request.getParameter("GENDER"));
            user.setDob(request.getParameter("DOB").toString());
            user.setUser_type(request.getParameter("USER_TYPE"));

            //Add user to database
            try {
                dbmUser.addUser(user);

            } catch (SQLException ex) {
                Logger.getLogger(RegisterUserServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Create session and send it to the view
            session.setAttribute("user", user);
            request.setAttribute("registered", true);
            request.getRequestDispatcher("register.jsp").include(request, response);

            try {
                dbmLogs.addLog(user.getUser_id(), "Register");
            } catch (SQLException ex) {
                Logger.getLogger(RegisterUserServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}

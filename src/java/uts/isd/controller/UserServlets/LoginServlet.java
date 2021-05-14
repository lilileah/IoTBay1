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


     public class LoginServlet extends HttpServlet {
         
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)   
                throws ServletException, IOException {       
           
         HttpSession session = request.getSession();
         Validator validator = new Validator();
         
         String USERNAME_EMAIL = request.getParameter("USERNAME_EMAIL");
         String PASSWORD = request.getParameter("PASSWORD");
         
         DBMuser manager = (DBMuser)session.getAttribute("manager");
         
         User user = null;
         
         validator.clear(session);
         
         //Validate session
         //if email format wrong, send a bean called emailErr to the login view
         
        if(!validator.validateEmail(USERNAME_EMAIL)){
             session.setAttribute("emailErr", "Error: Email format incorrect");
             request.getRequestDispatcher("login.jsp").include(request, response);
         //if password less than 4 digits, send a bean called passwordErr to the login view
         } else if (!validator.validatePassword(PASSWORD)){
             session.setAttribute("passwordErr", "Error: Password minimum 4 digits");
             request.getRequestDispatcher("login.jsp").include(request, response);
         } else {
             try {
                 System.out.println("USERNAME EMAIL IS: " + USERNAME_EMAIL + " PASSWORD IS " + PASSWORD );
                 if(manager == null){
                     System.out.println("Manager is null!");
                 }
                 user = manager.findUser(USERNAME_EMAIL, PASSWORD);
                 if(user != null){
                     System.out.println("User is in the DB!!!");
                     //find the user and set the session bean
                     session.setAttribute("user", user);
                     //send the session to the welcome page
                     request.getRequestDispatcher("welcome.jsp").include(request, response);
                 } else {
                     //if not found, 
                    System.out.println("User is not in the DB!!!");
                    //create a session called existErr and send it to the view
                    session.setAttribute("existErr", "User does not exist in the database!");
                    request.getRequestDispatcher("login.jsp").include(request, response);
                 }
         } catch (SQLException | NullPointerException ex){
             System.out.println(ex.getMessage() == null ? "User does not exist" : "Welcome!");
         }
        }
     }
    }

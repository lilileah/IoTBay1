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

     protected void doPost(HttpServletRequest request, HttpServletResponse response)   throws ServletException, IOException {       
           
         HttpSession session = request.getSession();
         Validator validator = new Validator();
         String USERNAME_EMAIL = request.getParameter("USERNAME_EMAIL");
         String PASSWORD = request.getParameter("PASSWORD");
         DBMuser manager = (DBMuser)session.getAttribute("manager");
         User user = null;
         //validator.clear(session);
         
            if(!validator.validateEmail(USERNAME_EMAIL)){
             session.setAttribute("emailErr", "Error: Email format incorrect");
             request.getRequestDispatcher("login.jsp").include(request, response);
         } else if (!validator.validatePassword(PASSWORD)){
             request.getRequestDispatcher("login.jsp").include(request, response);
         } else {
             try {
                 user = manager.findUser(USERNAME_EMAIL, PASSWORD);
                 if(user != null){
                     session.setAttribute("user", user);
                     request.getRequestDispatcher("welcome.jsp").include(request, response);
                 } else {
                     session.setAttribute("existErr", "User does not exist in the database!");
                     request.getRequestDispatcher("register.jsp").include(request, response);
                 }
         } catch (SQLException | NullPointerException ex){
             System.out.println(ex.getMessage() == null ? "User does not exist" : "Welcome!");
         }
        }
     }
    }

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
import uts.isd.model.User;
import uts.isd.model.dao.*;
import uts.isd.model.dao.DBConnector;


/**
 *
 * @author samuelpolgar
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/AddUser"})
public class RegisterServlet extends ConnServlet {

    DBMuser dbmUser;

    public RegisterServlet(){
        dbmUser = new DBMuser();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("register.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = new User();
        user.setUsername_email(request.getParameter("USERNAME_EMAIL"));
        user.setUser_name(request.getParameter("USER_NAME"));
        user.setPassword(request.getParameter("PASSWORD"));
        user.setPhone(request.getParameter("PHONE"));
        user.setGender(request.getParameter("GENDER"));
        user.setDob(request.getParameter("DOB"));
        user.setUser_type(request.getParameter("USER_TYPE"));
        try {
            dbmUser.addUser(user);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("main");
    }
}
















//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package uts.isd.controller.UserServlets;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.SQLException;
//import java.util.HashSet;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import uts.isd.controller.ConnServlet;
//import uts.isd.model.User;
//import uts.isd.model.dao.*;
//
///**
// *
// * @author samuelpolgar
// */
//
//public class RegisterServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        
//        HttpSession session = request.getSession();
//
//        //Get the details from the view
//        String USERNAME_EMAIL = request.getParameter("USERNAME_EMAIL");
//        String USER_NAME = request.getParameter("USER_NAME");
//        String PASSWORD = request.getParameter("PASSWORD");
//        String PHONE = request.getParameter("PHONE");
//        String DOB = request.getParameter("DOB");
//        String GENDER = request.getParameter("GENDER");
//        String USER_TYPE = request.getParameter("USER_TYPE");
//        User user = null;   
//    
//        DBMuser manager = (DBMuser) session.getAttribute("manager");
//        
//        System.out.println("Hello World!");
//        //Try write the new user to the data base and log the user in
//        try {
//            System.out.println("Making a user" + USERNAME_EMAIL + USER_NAME + PASSWORD + PHONE + DOB + GENDER + USER_TYPE );
//            manager.addUser(USERNAME_EMAIL, USER_NAME, PASSWORD, PHONE, DOB, GENDER, USER_TYPE);
//        }
//        catch(SQLException | NullPointerException ex){
//        System.out.println(ex.getMessage() == null ? "Something went wrong" : "All good");
//    }
//    }
//}

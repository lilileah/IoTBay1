/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.controller.UserServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import uts.isd.model.User;
import uts.isd.model.dao.DBMuser;

/**
 *
 * @author samuelpolgar
 */
public class RegisterServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();

        //Get the details from the view
        String USERNAME_EMAIL = request.getParameter("USERNAME_EMAIL");
        String USER_NAME = request.getParameter("USER_NAME");
        String PASSWORD = request.getParameter("PASSWORD");
        String PHONE = request.getParameter("PHONE");
        String DOB = request.getParameter("DOB");
        String GENDER = request.getParameter("GENDER");
        String USER_TYPE = request.getParameter("USER_TYPE");
        User user = null;
        
        //create a new user
//        User newUser = new User();
//        newUser.setUsername_email(email);
//        newUser.setUser_name(name);
//        newUser.setPassword(password);
//        newUser.setPhone(phone);
//        newUser.setDob(dob);
//        newUser.setGender(gender);
//        newUser.setUser_type(user_type);
        
        DBMuser manager = (DBMuser) session.getAttribute("manager");
        
        System.out.println("Hello World!");
        //Try write the new user to the data base and log the user in
        try {
            manager.addUser(USERNAME_EMAIL, USER_NAME, PASSWORD, PHONE, DOB, GENDER, USER_TYPE);
            System.out.println("Making a user" + USERNAME_EMAIL + USER_NAME + PASSWORD + PHONE + DOB + GENDER + USER_TYPE );
            //DBMUser.addUser(USERNAME_EMAIL, USER_NAME, PASSWORD, PHONE, DOB, GENDER, USER_TYPE);
        }
        catch(SQLException | NullPointerException ex){
        System.out.println(ex.getMessage() == null ? "Something went wrong" : "All good");
    }
//        processRequest(request, response);
    }
}

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

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends ConnServlet {

    DBMuser dbmUser;
    DBMlogs dbmLogs;

    public LoginServlet() {
        dbmUser = new DBMuser();
        dbmLogs = new DBMlogs();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = dbmUser.getUser(
                request.getParameter("USERNAME_EMAIL"),
                request.getParameter("PASSWORD")
        );
//                User user = dbmUser.getUserById(1);
        request.setAttribute("user", user);
        request.getRequestDispatcher("main.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = dbmUser.getUser(
                request.getParameter("USERNAME_EMAIL"),
                request.getParameter("PASSWORD")
        );
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        request.setAttribute("loggedIn", true);
        request.getRequestDispatcher("main.jsp").include(request, response);

        try {
            dbmLogs.addLog(user.getUser_id(), "Login");
        } catch (SQLException ex) {
            Logger.getLogger(RegisterUserServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

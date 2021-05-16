package uts.isd.controller.UserServlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import uts.isd.controller.ConnServlet;
import uts.isd.model.User;
import uts.isd.model.dao.*;

@WebServlet(name = "DeleteUserServlet", urlPatterns = {"/DeleteUserServlet"})
public class DeleteUserServlet extends ConnServlet {

    DBMuser dbmUser;
    DBMlogs dbmLogs;

    public DeleteUserServlet() {
        dbmUser = new DBMuser();
        dbmLogs = new DBMlogs();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        if (session != null) {
            //session exists
            User currentUser = (User) session.getAttribute("user");
            int userId = Integer.parseInt(request.getParameter("USER_ID"));
            System.out.println("Deleting userId: " + userId);
            dbmUser.deleteUserById(Integer.parseInt(request.getParameter("USER_ID")));
            session.invalidate();
            request.setAttribute("loggedIn", false);
            request.setAttribute("userStatus", "deleted");
            request.getRequestDispatcher("logout.jsp").include(request, response);
            try {
                dbmLogs.addLog(userId, "Delete");
            } catch (SQLException ex) {
                Logger.getLogger(RegisterUserServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            request.setAttribute("loggedIn", false);
            request.getRequestDispatcher("main.jsp").forward(request, response);
        }
    }
}

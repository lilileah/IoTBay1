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

@WebServlet(name = "DeleteUserServlet", urlPatterns = {"/DeleteUserServlet"})
    public class DeleteUserServlet extends ConnServlet {
        DBMuser dbmUser;
        
        public DeleteUserServlet(){
            dbmUser = new DBMuser();
        }

        
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            
                    HttpSession session = request.getSession();
                    if( session != null ){
                        //session exists
                        User currentUser = (User)session.getAttribute("user");
                        dbmUser.deleteUserById(Integer.parseInt(request.getParameter("user_id")));
                        session.invalidate();
                        request.setAttribute("loggedIn", false);
                        request.setAttribute("userStatus", "deleted");
                        request.getRequestDispatcher("logout.jsp").include(request, response);
                        
                    } else {
                        request.setAttribute("loggedIn", false);
                        request.getRequestDispatcher("main.jsp").forward(request, response);
                    }
        }
            
}
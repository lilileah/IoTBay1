/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.controller.UserServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uts.isd.controller.ConnServlet;
import uts.isd.model.AccessLogs;
import uts.isd.model.dao.DBMlogs;

/**
 *
 * @author samuelpolgar
 */
@WebServlet(name = "GetAccessLogsServlet", urlPatterns = {"/GetAccessLogsServlet"})
public class GetAccessLogsServlet extends ConnServlet {
    DBMlogs dbmLogs;
    
    public GetAccessLogsServlet(){
        dbmLogs = new DBMlogs();
}

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            String strUserId = request.getParameter("USER_ID");
            ArrayList<AccessLogs> logsList;
            if (strUserId == null) {
                logsList = dbmLogs.getAllLogs();
            } else {
                logsList = dbmLogs.getLogsByUserId(Integer.valueOf(strUserId));
            }
            request.setAttribute("logsList", logsList);
            request.getRequestDispatcher("accesslogs.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(GetAccessLogsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

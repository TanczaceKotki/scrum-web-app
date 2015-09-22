package com.pega.tutorial;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {

    private static final String USER_TABLE = "USERS";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Credential credential = new Credential(name, email, password);

        try {
            JDBCConnector jdbcConnector = new JDBCConnector();
            Connection c = jdbcConnector.getConnection();

            request.setAttribute("name", name);
            request.setAttribute("email", email);
            request.setAttribute("password", password);

            if (countRows(c, credential) != 1) request.setAttribute("error", "no such user");

            request.getRequestDispatcher("/search.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }




    }


    public int countRows(Connection conn, Credential credential) throws SQLException {
        // select the number of rows in the table
        Statement stmt = null;
        ResultSet rs = null;
        int rowCount = -1;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT COUNT(*) FROM " + USER_TABLE
                    + " WHERE email = '"+ credential.getEmail() +"' AND password = '"+ credential.getPassword()+"'");
            // get the number of rows from the result set
            rs.next();
            rowCount = rs.getInt(1);
        } finally {
            rs.close();
            stmt.close();
        }
        return rowCount;
    }
}
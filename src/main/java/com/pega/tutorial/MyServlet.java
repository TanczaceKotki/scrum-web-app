package com.pega.tutorial;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        Credential credential = new Credential(name, password);

        try {
            JDBCConnector jdbcConnector = new JDBCConnector();
            jdbcConnector.connect();

        } catch (Exception e) {
            e.printStackTrace();
        }


        if(name.equals("Guest")) {

            request.getRequestDispatcher("/WEB-INF/guest.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/WEB-INF/some-result.jsp").forward(request, response);
        }


    }

}
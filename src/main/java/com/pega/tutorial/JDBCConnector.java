package com.pega.tutorial;
    import java.sql.*;

    public class JDBCConnector {
        // JDBC driver name and database URL
        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://10.20.92.42:3306/FollowTheGenre";

        //  Database credentials
        static final String USER = "root";
        static final String PASS = "";

        public void connect() throws Exception {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, "root", "");
        }
}

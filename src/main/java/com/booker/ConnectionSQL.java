package com.booker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQL {

    private String url = "jdbc:mysql://127.0.0.1/booker";
    private String user = "root";
    private String password = "";

    public Connection connect() throws Exception, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);
        
        return conn;
    }
}

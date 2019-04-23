package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
    public Connection ConnectionMysql () throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Restaurant?user=root&password=");
        return connection;
    }
}

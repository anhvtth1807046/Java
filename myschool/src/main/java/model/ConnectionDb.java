package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
    public Connection ConnectionMySql() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ManagerSchool?user=root&password=");
        return connection;
    }
}

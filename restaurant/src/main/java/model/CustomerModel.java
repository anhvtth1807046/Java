package model;

import java.sql.Connection;
import java.sql.SQLException;

public class CustomerModel {
    private Connection connection = null;
    private void initConnection () throws SQLException{
        if (connection == null || connection.isClosed()){
            ConnectionDb db = new ConnectionDb();
            connection = db.ConnectionMysql();
        }


    }


}


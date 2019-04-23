package model;

import entity.Studnet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModelStudent {
    private Connection connection = null;
    private void initConnection() throws SQLException{
        if (connection == null || connection.isClosed()){
            ConnectionDb connectionDb = new ConnectionDb();
            connection = connectionDb.ConnectionMysql();

        }
    }
    public void insert (Studnet studnet){
        try {
            initConnection();
            PreparedStatement statement = connection.prepareStatement("insert into (rollNumber, name , age , address , phone , email)" +"" +
                    "value (? , ? , ? , ? , ? , ?)");
            statement.setString(1, studnet.getRollNumber());
            statement.setString(2, studnet.getName());
            statement.setInt(3, studnet.getAge());
            statement.setString(4, studnet.getAddress());
            statement.setInt(5, studnet.getPhone());
            statement.setString(6, studnet.getEmail());
            statement.execute();
            System.out.println("Anh ơi lưu được rồi!!!");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Studnet> findAll () throws SQLException{
        initConnection();
        ArrayList<Studnet> list = new ArrayList<Studnet>();
        PreparedStatement statement = connection.prepareStatement("select * from ManagerStudent");
        ResultSet resultSet = statement.executeQuery();
        if (!resultSet.wasNull()){
            while (resultSet.next()){
                Studnet studnet = new Studnet(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getString(4),
                        resultSet.getInt(5), resultSet.getString(6));
                list.add(studnet);
            }
        }
        return list;
    }
    public Studnet findOne(String id) throws SQLException{
        Studnet studnet = null;
        initConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from ManagerStudent where rollNumber = ?");
        preparedStatement.setString(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()){
            studnet = new Studnet(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3),
                    resultSet.getString(4), resultSet.getInt(5), resultSet.getString(6));

        }
        return studnet;
    }

    public void update(Studnet studnet){
        try {
            initConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from ManagerStudent where rollNumber = ?");
            preparedStatement.setString(1, studnet.getRollNumber());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                PreparedStatement preparedStatement1 = connection.prepareStatement("UPDATE ManagerStudent SET rollNumber = ?, name = ?, age = ?, address = ? , phone = ?, email = ? where rollNumber = ?");
                preparedStatement.setString(1, resultSet.getString(1));
                preparedStatement.setString(1, studnet.getName());
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




}

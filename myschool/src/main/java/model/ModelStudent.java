package model;

import entity.Student;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;

public class ModelStudent {
    private Connection connection = null;

    private void initConnection() throws SQLException {
        if (connection == null || connection.isClosed()){
            ConnectionDb connectionDb = new ConnectionDb();
            connection = connectionDb.ConnectionMySql();
        }

    }
    public void insert(Student student){
        try {
            initConnection();
            PreparedStatement statement = connection.prepareStatement("insert into ManagerStudent(rollNumber, name , age, address, phone, email)+" +
                    "value (?, ?, ?, ?, ?, ?)");
            statement.setString(1, student.getRollNumber());
            statement.setString(2, student.getName());
            statement.setInt(3, student.getAge());
            statement.setString(4, student.getAddress());
            statement.setInt(5, student.getPhone());
            statement.setString(6, student.getEmail());
            statement.execute();
            System.out.println("Anh ơi lưu được rồi!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Student> findAll() throws SQLException {
        initConnection();
        ArrayList<Student> list = new ArrayList<Student>();
        PreparedStatement statement = connection.prepareStatement("select * from ManagerStudent");
        ResultSet resultSet = statement.executeQuery();
        if (!resultSet.wasNull()) {
            while (resultSet.next()) {
                Student student = new Student(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3),
                        resultSet.getString(4), resultSet.getInt(5), resultSet.getString(6));
                list.add(student);
            }
        }
        return list;
    }

    public Student findOne(String id) throws SQLException{
        Student student = null;
        initConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from ManagerStudent where rollNumber = ?");
        preparedStatement.setString(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()){
            Student st = new Student(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3),
                    resultSet.getString(4), resultSet.getInt(5), resultSet.getString(6));

        }
        return student;
    }

    public void update(Student student) {
        try {
            initConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from ManagerStudent where rollNumber = ?");
            preparedStatement.setString(1, student.getRollNumber());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                preparedStatement = connection.prepareStatement("UPDATE ManagerStudent SET rollNumber = ?, name = ?," +
                        "age = ?, address = ?, phone = ?, email = ? where rollNumber = ?" );
                preparedStatement.setString(1, resultSet.getString(1));
                preparedStatement.setString(2, student.getName());
                preparedStatement.setInt(3, student.getAge());
                preparedStatement.setString(4, student.getAddress());
                preparedStatement.setInt(5, student.getPhone());
                preparedStatement.setString(6, student.getEmail());
                preparedStatement.setString(7, student.getRollNumber());
                preparedStatement.execute();
                System.out.println("Thay đổi thành công!!");
            }else {
                System.out.println("Không có sinh viên nào.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


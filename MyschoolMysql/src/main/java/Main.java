import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/myschool?user=root&password=");
//        Statement statement = connection.createStatement();
//        statement.execute("insert into students(rollNumber, name, dob, address, phone, email) " +
//                "value  ('A001', 'Hoai Anh', '2000-10-23', 'Ha Noi', 01234567, 'hoaianh@gmail.com')");
        PreparedStatement statement = connection.prepareStatement("insert into students(rollNumber, name, dob, address, phone, email) " +
               "value  (?, ?, ?, ?, ?, ?)");
        statement.setString(1,"A002");
        statement.setString(2,"Trinh Viet");
        statement.setString(3,"2000-10-23");
        statement.setString(4,"Ha Noi");
        statement.setString(5, "0123456778");
        statement.setString(6,"hoaianh@gmail.com");
        statement.execute();

    }
}

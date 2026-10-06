package lab2;

// Q3. Create a Java program using JDBC to retrieve and display
// all student records.

import java.sql.*;

public class q3 {

    static String url = "jdbc:mysql://localhost:3307/advanced_java_lab";
    static String username = "root";
    static String password = "root";

    public static void main(String[] args) {

        String sql = "SELECT * FROM students";

        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("Student Records");
            System.out.println("----------------------------");

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String email = rs.getString("email");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Email: " + email);
                System.out.println("----------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
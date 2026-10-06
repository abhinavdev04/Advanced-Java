package lab2;

// Q2. Create a Java program using JDBC to insert student details
// (id, name, age, email) into MySQL database.

import java.sql.*;
import java.util.Scanner;

public class q2 {

    static String url = "jdbc:mysql://localhost:3307/advanced_java_lab";
    static String username = "root";
    static String password = "root";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        String sql = "INSERT INTO students (id, name, age, email) VALUES (?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, email);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student inserted successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
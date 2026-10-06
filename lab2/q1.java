package lab2;

// Q1. Create a Java program to connect to MySQL database using JDBC
// and display successful connection message.

import java.sql.*;

public class q1 {

    static String url = "jdbc:mysql://localhost:3307/advanced_java_lab";
    static String username = "root";
    static String password = "root";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Database connected successfully!");

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
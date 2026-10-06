package lab2;

// Q4. Create a Java program using JDBC to update and delete
// a student record based on student ID.

import java.sql.*;
import java.util.Scanner;

public class q4 {

    static String url = "jdbc:mysql://localhost:3307/advanced_java_lab";
    static String username = "root";
    static String password = "root";

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("1. Update Student");
        System.out.println("2. Delete Student");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            updateStudent();
        } else if (choice == 2) {
            deleteStudent();
        } else {
            System.out.println("Invalid choice!");
        }
    }

    static void updateStudent() {

        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new email: ");
        String email = scanner.nextLine();

        String sql = "UPDATE students SET name = ?, age = ?, email = ? WHERE id = ?";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, email);
            ps.setInt(4, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("Student not found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void deleteStudent() {

        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();

        String sql = "DELETE FROM students WHERE id = ?";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Student not found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
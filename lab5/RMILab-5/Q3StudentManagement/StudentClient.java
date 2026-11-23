import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class StudentClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            StudentInterface obj = (StudentInterface) registry.lookup("StudentService");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Email: ");
            String email = sc.nextLine();

            Student student = new Student(id, name, age, email);

            String message = obj.addStudent(student);

            System.out.println("\nServer Response: " + message);

            sc.close();

        } catch (Exception e) {
            System.out.println("Client error: " + e);
        }
    }
}

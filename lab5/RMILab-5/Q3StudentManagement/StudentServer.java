import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class StudentServer {
    public static void main(String[] args) {
        try {
            StudentImpl obj = new StudentImpl();

            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            registry.rebind("StudentService", obj);

            System.out.println("Student Server is running...");
        } catch (Exception e) {
            System.out.println("Server error: " + e);
        }
    }
}
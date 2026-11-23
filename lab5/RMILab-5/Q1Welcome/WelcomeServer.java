import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class WelcomeServer {
    public static void main(String[] args) {
        try {
            WelcomeImpl obj = new WelcomeImpl();

            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            registry.rebind("WelcomeService", obj);

            System.out.println("Welcome Server is running...");
        } catch (Exception e) {
            System.out.println("Server error: " + e);
        }
    }
}
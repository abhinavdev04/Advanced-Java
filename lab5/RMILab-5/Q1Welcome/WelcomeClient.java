import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class WelcomeClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            WelcomeInterface obj = (WelcomeInterface) registry.lookup("WelcomeService");

            String message = obj.welcome();

            System.out.println("Message from Server: " + message);
        } catch (Exception e) {
            System.out.println("Client error: " + e);
        }
    }
}
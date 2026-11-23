import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            CalculatorImpl obj = new CalculatorImpl();

            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            registry.rebind("CalculatorService", obj);

            System.out.println("Calculator Server is running...");
        } catch (Exception e) {
            System.out.println("Server error: " + e);
        }
    }
}
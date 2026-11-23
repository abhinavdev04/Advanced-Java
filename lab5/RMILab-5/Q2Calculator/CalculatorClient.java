import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            CalculatorInterface obj = (CalculatorInterface) registry.lookup("CalculatorService");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            System.out.println("\n1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            double result;

            switch (choice) {
                case 1:
                    result = obj.add(a, b);
                    break;
                case 2:
                    result = obj.subtract(a, b);
                    break;
                case 3:
                    result = obj.multiply(a, b);
                    break;
                case 4:
                    result = obj.divide(a, b);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    sc.close();
                    return;
            }

            System.out.println("Result: " + result);

            sc.close();

        } catch (Exception e) {
            System.out.println("Client error: " + e);
        }
    }
}
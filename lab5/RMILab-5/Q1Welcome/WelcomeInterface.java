import java.rmi.Remote;
import java.rmi.RemoteException;

public interface WelcomeInterface extends Remote {
    String welcome() throws RemoteException;
}

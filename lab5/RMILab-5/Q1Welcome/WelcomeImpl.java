import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class WelcomeImpl extends UnicastRemoteObject implements WelcomeInterface {

    public WelcomeImpl() throws RemoteException {
        super();
    }

    @Override
    public String welcome() throws RemoteException {
        return "Welcome to Java RMI!";
    }
}

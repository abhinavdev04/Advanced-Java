import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StudentInterface extends Remote {
    String addStudent(Student student) throws RemoteException;
}
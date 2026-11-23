import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StudentImpl extends UnicastRemoteObject implements StudentInterface {

    public StudentImpl() throws RemoteException {
        super();
    }

    @Override
    public String addStudent(Student student) throws RemoteException {
        System.out.println("\nStudent received from Client:");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Email: " + student.getEmail());

        return "Student details received successfully by Server!";
    }
}
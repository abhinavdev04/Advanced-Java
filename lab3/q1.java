package lab3;

// Q1. Create a JavaBean class named Student with properties id, name, age, and email.
// Use getter and setter methods to set and display the student information.

public class q1 {

    public static void main(String[] args) {

        Student student = new Student();

        student.setId(1);
        student.setName("Abhinav");
        student.setAge(21);
        student.setEmail("abhinav@gmail.com");

        System.out.println("Student Details");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Email: " + student.getEmail());
    }
}
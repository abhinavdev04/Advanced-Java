package lab3;

// Q2. Create a JavaBean class named Employee with properties employeeId, name, salary, and department.
// Write a Java program to set and display employee details using getter and setter methods.

public class q2 {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setEmployeeId(101);
        employee.setName("Diwakar Dhungana");
        employee.setSalary(50000000);
        employee.setDepartment("BCA");

        System.out.println("Employee Details");
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Department: " + employee.getDepartment());
    }
}
package lab3;

// Q3. Create a JavaBean class named StudentMarks with properties name, subject1, subject2, and subject3.
// Calculate and display the total marks, average marks, and percentage.

public class q3 {

    public static void main(String[] args) {

        StudentMarks student = new StudentMarks();

        student.setName("Abhinav");
        student.setSubject1(90);
        student.setSubject2(95);
        student.setSubject3(95);

        double total = student.getSubject1()
                     + student.getSubject2()
                     + student.getSubject3();

        double average = total / 3;

        double percentage = (total / 300) * 100;

        System.out.println("Student Marks");
        System.out.println("Name: " + student.getName());
        System.out.println("Subject 1: " + student.getSubject1());
        System.out.println("Subject 2: " + student.getSubject2());
        System.out.println("Subject 3: " + student.getSubject3());
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");
    }
}
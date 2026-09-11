import java.util.Scanner;

class Student {
    private String studentName;
    private String registrationNumber;
    private String department;
    private double studentGpa;

    public void setDetails(String name, String regNo, String dept, double gpa) {
        studentName = name;
        registrationNumber = regNo;
        department = dept;
        studentGpa = gpa;
    }

    public void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + studentName);
        System.out.println("Registration No: " + registrationNumber);
        System.out.println("Department: " + department);
        System.out.println("GPA: " + studentGpa);
    }
}

public class LabTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Registration Number: ");
        String regNo = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

        student1.setDetails(name, regNo, department, gpa);
        student1.display();

        scanner.close();
    }
}
import java.util.Scanner;

class Student {
    private String studentName;
    private String registrationNumber;
    private String depertment;
    private String studentGpa;

    public void setDetails(String name, String regNo, String dept, String gpa) {
        studentName = name;
        registrationNumber = regNo;
        depertment = dept;
        studentGpa = gpa;
    }

    public void display() {
        System.out.println("Name: " + studentName);
        System.out.println("Registration No.: " + registrationNumber);
        System.out.println("Depertment: " + depertment);
        System.out.println("GPA: " + studentGpa);
    }
}

public class LabTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student student1 = new Student();

        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("What is registration name? ");
        String regNo = input.nextLine();

        System.out.print("What is your depertment? ");
        String dept = input.nextLine();

        System.out.print("What's your GPA? ");
        String gpa = input.nextLine();

        student1.setDetails(name, regNo, dept, gpa);

        student1.display();

        input.close();
    }
}
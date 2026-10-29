import java.util.Date;

class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public void display() {
        System.out.println("Name: " + name + ", Address: " + address +
                ", Phone: " + phoneNumber + ", Email: " + emailAddress);
    }
}

class Student extends Person {
    private String status;

    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public void display() {
        super.display();
        System.out.println("Status: " + status);
    }
}

class Employee extends Person {
    protected String office;
    protected double salary;
    protected Date dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress,
            String office, double salary, Date dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public void display() {
        super.display();
        System.out.println("Office: " + office + ", Salary: $" + salary + ", Date Hired: " + dateHired);
    }
}

class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress,
            String office, double salary, Date dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public void display() {
        super.display();
        System.out.println("Office Hours: " + officeHours + ", Rank: " + rank);
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress,
            String office, double salary, Date dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    public void display() {
        super.display();
        System.out.println("Title: " + title);
    }
}

public class LabTask1 {
    public static void main(String[] args) {
        Student student = new Student("Ali", "Rawalpindi", "03007654321", "ali@example.com", "Freshman");
        Faculty faculty = new Faculty("Dr. Khan", "Islamabad", "03222222222", "khan@example.com", "CS-204", 120000,
                new Date(), "10:00 AM - 12:00 PM", "Professor");
        Staff staff = new Staff("Ahmed", "Rawalpindi", "03333333333", "ahmed@example.com", "Admin-05", 40000,
                new Date(), "Assistant Manager");

        student.display();
        faculty.display();
        staff.display();
    }
}
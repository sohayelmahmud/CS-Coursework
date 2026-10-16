class Student {
    private String name;
    private int[] result_array = new int[5];

    public Student(String name, int[] marks) {
        this.name = name;
        result_array = marks;
    }

    public String getName() {
        return name;
    }

    public int[] getResultArray() {
        return result_array;
    }

    public double Average() {
        int sum = 0;
        for (int mark : result_array) {
            sum += mark;
        }
        return (double) sum / result_array.length;
    }
}

public class LabTask3 {
    public static void main(String[] args) {
        // Student 1
        int[] marks1 = { 85, 90, 78, 92, 88 };
        Student s1 = new Student("Sohayel", marks1);
        double avg1 = s1.Average();
        System.out.println("Object 1: " + s1.getName() + "'s Average: " + avg1);

        // student 2
        int[] marks2 = { 75, 80, 85, 70, 90 };
        Student s2 = new Student("Jim", marks2);
        double avg2 = s2.Average();
        System.out.println("Object 2: " + s2.getName() + "'s Average: " + avg2);

        // Comparasion
        if (avg1 > avg2) {
            System.out.println("\n" + s1.getName() + " has a higher average.");
        } else if (avg2 > avg1) {
            System.out.println("\n" + s2.getName() + " has a higher average.");
        } else {
            System.out.println("\nBoth students have the same average.");
        }
        System.out.println("-----------------------------------");

        // Student 3
        Student s3 = new Student(s1.getName(), s2.getResultArray());
        System.out.println("Student 3 Name: " + s3.getName());
        System.out.println("Student 3 Average: " + s3.Average());
    }
}
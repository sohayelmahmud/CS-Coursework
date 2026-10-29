// UniversitySystem.java
class Project {
    String projectTitle;
    String supervisorName;
    int complexityLevel; // 1 to 5

    Project(String projectTitle, String supervisorName, int complexityLevel) {
        this.projectTitle = projectTitle;
        this.supervisorName = supervisorName;
        this.complexityLevel = complexityLevel;
    }

    void displayProject() {
        System.out.println("Project Title: " + projectTitle);
        System.out.println("Supervisor: " + supervisorName);
        System.out.println("Complexity Level: " + complexityLevel);
    }
}

class Student {
    int studentId;
    String studentName;
    Project project;

    Student(int studentId, String studentName, String projectTitle,
            String supervisorName, int complexityLevel) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.project = new Project(projectTitle, supervisorName, complexityLevel);
    }

    void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        project.displayProject();
    }
}

class ResearchStudent extends Student {
    String researchArea;

    ResearchStudent(int studentId, String studentName, String projectTitle,
            String supervisorName, int complexityLevel, String researchArea) {
        super(studentId, studentName, projectTitle, supervisorName, complexityLevel);
        this.researchArea = researchArea;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Research Area: " + researchArea);
    }
}

class ProjectManager {

    void increaseComplexity(Project p) {
        if (p.complexityLevel < 5) {
            p.complexityLevel = p.complexityLevel + 1; // update existing object
        }
    }

    void displayStudent(Student s) {
        s.displayDetails();
    }

    Student findMostComplexProject(Student[] students) {
        if (students == null || students.length == 0)
            return null;

        Student highest = null;
        int maxLevel = -1;

        for (Student s : students) {
            if (s != null) {
                int level = s.project.complexityLevel;
                if (level > maxLevel) {
                    maxLevel = level;
                    highest = s;
                }
            }
        }
        return highest;
    }
}

public class BAI_2_2 {
    public static void main(String[] args) {
        ProjectManager manager = new ProjectManager();
        Student[] students = new Student[5];

        students[0] = new Student(1, "Ali", "AI Chatbot", "Dr. Ahmed", 3);
        students[1] = new Student(2, "Sara", "E-Commerce Website", "Dr. Fatima", 2);
        students[2] = new Student(3, "Rahim", "Library Management", "Dr. Khan", 4);
        students[3] = new ResearchStudent(4, "Karim", "Machine Learning Model", "Dr. Ahmed", 5, "AI");
        students[4] = new ResearchStudent(5, "Nadia", "Data Security System", "Dr. Fatima", 4, "Cybersecurity");

        System.out.println("=== All Students ===");
        for (Student s : students) {
            manager.displayStudent(s);
            System.out.println("-------------------");
        }

        // Increase complexity of student 1's project
        System.out.println("=== Increasing Complexity of Student 1's Project ===");
        manager.increaseComplexity(students[0].project);
        manager.displayStudent(students[0]);

        // Find student with most complex project
        System.out.println("=== Student with Most Complex Project ===");
        Student highest = manager.findMostComplexProject(students);
        if (highest != null) {
            System.out.println("Student Name: " + highest.studentName);
            System.out.println("Complexity Level: " + highest.project.complexityLevel);
        }
    }
}
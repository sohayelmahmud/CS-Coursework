class CourseResult {
    public String studentname;
    public String courseName;
    public String grade;

    public void display() {
        System.out.println(
                "Student Name is:" + studentname + "Course Name is:" + courseName + "Grade is:" + grade);
    }
}

public class CourseResultRun {
    public static void main(String[] args) {
        CourseResult c1 = new CourseResult();
        c1.studentname = "Ali";
        c1.courseName = "OOP";
        c1.grade = "A";
        c1.display();

        CourseResult c2 = new CourseResult();
        c2.studentname = "Saba";
        c2.courseName = "ICP";
        c2.grade = "A+";
        c2.display();
    }
}

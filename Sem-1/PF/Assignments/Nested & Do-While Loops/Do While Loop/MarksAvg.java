import java.util.Scanner;

public class MarksAvg {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float totalStudents = 0,marks,totalMarks = 0,avg;   //total students,marks, total marks, avg

    System.out.print("Note: Programs ends on entering a -ve integer\n");
    do
    {
        System.out.print("Enter marks of a student: ");
        marks = inp.nextFloat();

        if (marks >= 0)
        {
            totalMarks+=marks;
            totalStudents++;
        }
    }
    while(marks >= 0);

    if( totalStudents > 0)
    {
        avg=totalMarks/totalStudents;
        System.out.printf("Average is: %.2f",avg);
    }
    else
        System.out.printf("No student!!");
    }
}

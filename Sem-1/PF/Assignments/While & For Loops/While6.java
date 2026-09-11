import java.util.Scanner;

public class While6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter marks of student: ");
        float marks = inp.nextFloat();

        float t_mark = 0f;
        int t_stud = 0;

        while (marks >= 0) {
            t_stud++;
            t_mark = t_mark + marks;
            System.out.print("Enter marks of student: ");
            marks = inp.nextFloat();
        }

        if (t_stud > 0) {
            float avg = t_mark / t_stud;
            System.out.printf("\nAverage of %d students is: %.2f", t_stud, avg);
        } else {
            System.out.println("\nNo student!");
        }

    }
}

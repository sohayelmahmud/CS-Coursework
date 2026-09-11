import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("\t --- Roots of Quadratic Equation ---");
        System.out.print("Enter a, b, c (separated by space): ");
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();

        float disc = b * b - 4 * a * c;
        float root1 = (float) (-b + Math.pow(disc, 0.5)) / 2 * a;
        float root2 = (float) (-b - Math.pow(disc, 0.5)) / 2 * a;

        if (disc == 0.0) {
            System.out.println("The equation has only one root: " + root1);
        }
        else if (disc > 0.0) {
            System.out.println("The equation has two roots: " + root1 + ", " + root2);
        } 
        else {
            System.out.println("The equation has no real roots.");
        }
    }
}
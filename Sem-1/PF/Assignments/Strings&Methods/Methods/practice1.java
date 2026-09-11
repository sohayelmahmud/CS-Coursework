import java.util.*;

public class practice1 {
    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int add(int a, int b, int d) {
        int c = add(a, b);
        int result = add(c, d);
        return result;
    }

    public static double add(double a, double b) {
        double result = a + b;
        return result;
    }

    public static double add(double a, double b, double d) {
        double c = add(a, b);
        double result = add(c, d);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What type of data you want to add?\n1. Int\n2. Double:\n");
        int choice_type = input.nextInt();
        System.out.print("How many number you want to add?\n1. 2 Numbers\n2. 3 Numbers:\n");
        int choice = input.nextInt();
        if (choice_type == 1) {
            if (choice == 1) {
                System.out.print("Enter the 1st number: ");
                int a = input.nextInt();
                System.out.print("Enter the 2nd number: ");
                int b = input.nextInt();
                System.out.println("Summation of " + a + " and " + b + " is: " + add(a, b));
            } else if (choice == 2) {
                System.out.print("Enter the 1st number: ");
                int a = input.nextInt();
                System.out.print("Enter the 2nd number: ");
                int b = input.nextInt();
                System.out.print("Enter the 3rd number: ");
                int c = input.nextInt();
                System.out.println("Summation of " + a + ", " + b + " and " + c + " is: " + add(a, b, c));
            } else {
                System.out.println("Wrong choice. ");
            }

        } else if (choice_type == 2) {
            if (choice == 1) {
                System.out.print("Enter the 1st number: ");
                double a = input.nextDouble();
                System.out.print("Enter the 2nd number: ");
                double b = input.nextDouble();
                System.out.println("Summation of " + a + " and " + b + " is: " + add(a, b));
            } else if (choice == 2) {
                System.out.print("Enter the 1st number: ");
                double a = input.nextDouble();
                System.out.print("Enter the 2nd number: ");
                double b = input.nextDouble();
                System.out.print("Enter the 3rd number: ");
                double c = input.nextDouble();
                System.out.printf("Summation of ", a, ", ", b, " and ", c, " is: %.2f", add(a, b, c));
            } else {
                System.out.println("Wrong choice. ");
            }
        } else {
            System.out.println("Wrong input for type.");
        }

        input.close();
    }
}
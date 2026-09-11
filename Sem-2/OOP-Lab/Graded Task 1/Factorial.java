import java.util.Scanner;

public class Factorial {
    public static void printFactorial(int x) {
        int result = 1;
        for (int i = x; i > 0; i--) {
            result *= i;
        }
        System.out.println("The factorial of this number is: " + result);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a number to calculate factorial: ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("This is a negative number. Enter a correct number.");
            }

        } while (n < 0);

        printFactorial(n);
        scanner.close();

    }
}

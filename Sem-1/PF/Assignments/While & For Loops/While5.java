import java.util.Scanner;

public class While5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = num.nextInt();

        int factorial = 1;
        int count = 1;

        while (count <= number) {
            factorial = factorial * count;
            count++;
        }
        System.out.printf("%nFactorial of %d is: %d", number, factorial);
    }
}

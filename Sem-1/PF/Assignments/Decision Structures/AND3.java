import java.util.Scanner;

public class AND3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("      --Odd and Positive-- ");
        System.out.print("Enter an integer: ");

        int number = num.nextInt();

        boolean result = (number > 0) && (number % 2 != 0);
        System.out.println("Is " + number + " odd and positive? " + result);
    }
}

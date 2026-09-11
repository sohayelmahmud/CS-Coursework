import java.util.Scanner;

public class NOT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (!(number > 0)) {
            System.out.println("The number is not positive.");
        } else {
            System.out.println("The number is positive.");
        }

        scanner.close();
    }
}

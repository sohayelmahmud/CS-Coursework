import java.util.Scanner;

public class XOR1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        if (num % 3 == 0 ^ num % 5 == 0) {
            System.out.println(num + " is divisible by 3 but not by 5.");
        } 
        else {
            System.out.println(num + " is not divisible by both 3 and 5.");
        }

    }
}

import java.util.Scanner;

public class AND_OR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        boolean result = (username.equals("hassan01") && password.equals("gamer000")) || username.equals("guest");
        System.out.println("Login successful: " + result);

        scanner.close();
    }
}

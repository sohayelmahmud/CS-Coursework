import java.util.Scanner;

public class GuessPass {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "hassanii003", inputPass;
        int attempts = 3;
        
        System.out.println("\t --- Login ---");
        System.out.println("Note: You're given 3 attempts!");
        do {
            System.out.print("Enter your password: ");
            inputPass = sc.nextLine();

            if (inputPass.equals(password)) {
                System.out.println("Access granted. Welcome!");
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Incorrect password. " + attempts + " attempts left.");
                } 
                else {
                    System.out.println("Access denied. No more attempts allowed.");
                    break;
                }
            }
        } while (true);
    }
}

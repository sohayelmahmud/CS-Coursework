import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte num = (byte) (Math.random() * 100 + 1);
        byte guess;

        do {
            System.out.print("Guess number between 1 and 100: ");
            guess = sc.nextByte();

            if (guess < num) {
                System.out.println("Your guess is lower than number.");
            } else if (guess > num) {
                System.out.println("Your guess is higher than number.");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        } while (guess != num);
    }
}
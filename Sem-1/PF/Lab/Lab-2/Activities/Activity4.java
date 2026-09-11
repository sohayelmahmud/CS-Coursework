import java.util.Scanner;
public class Activity4 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		byte num = (byte) (Math.random() * 100);
		short guess;
		
		System.out.println("	--- Number Guess --- ");
		
		while (true) {
			System.out.print("Guess the number: ");
			guess = inp.nextShort();

			if (guess == num) {
				System.out.print("Congratulations! You guessed correctly!");
				break;
			}
			else if (guess > num) {
				System.out.println("Your guess greater than the number!\nTry Again.");
			}
			else {
				System.out.println("Your guess is less than the number!\nTry Again.");
			}			
		}

	}
}
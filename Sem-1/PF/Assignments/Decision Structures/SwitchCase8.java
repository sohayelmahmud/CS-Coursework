import java.util.Scanner;

public class SwitchCase8 {
	public static void main(String[] args) {
		Scanner values = new Scanner(System.in);

		System.out.println("		--- Self-Digit Sum ---");

		int num = -1;
		while (num < 0 || num > 1000){
			System.out.print("Enter any number (0 - 1000; exclusive): ");		// 985 
			num = values.nextInt();
		}
		values.close();
		int num3 = (int) (num % 10);
		int num2 = (int) (num / 100);
		int num1 = (int) (num / 10) % 10;
		int selfSum = num1 + num2 + num3;
		

		System.out.printf("Self Digit Sum of %d is: %d",num,selfSum);

	}
}
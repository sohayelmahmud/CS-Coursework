import java.util.Scanner;
public class Activity5 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int sum = 0;
		short num = 0;
		
		System.out.println("	--- For Loop Sum --- ");
		System.out.print("How many numbers you want to enter? ");
		byte range = inp.nextByte();
		
		byte countNum = 0;
		for (; countNum < range; countNum++) {
			System.out.printf("Enter Number %d: ", countNum + 1);
			num = inp.nextShort();

			sum += num;
		}

		if (num != 0) {
			System.out.printf("Sum of %d digits is: %d", countNum, sum);
		}
		else {
			System.out.print("No Input");

		}
	}
}
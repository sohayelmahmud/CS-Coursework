import java.util.Scanner;
public class Activity3 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int sum = 0;
		short num = 0;
		final short SENTINAL = -999;
		
		System.out.println("	--- Sentinal Value --- ");
		
		byte countNum = 0;
		while (true) {
			System.out.print("Enter Number: ");
			num = inp.nextShort();

			if (num == SENTINAL) {
				break;
			}
			
			sum += num;
			countNum++;
		}

		if (num != 0) {
			System.out.printf("Sum of %d digits is: %d", countNum, sum);
		}
		else {
			System.out.print("No Input");

		}
	}
}
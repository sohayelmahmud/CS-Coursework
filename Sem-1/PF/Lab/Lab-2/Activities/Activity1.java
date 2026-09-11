import java.util.Scanner;
public class Activity1 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int sum = 0;
		short num;
		
		System.out.println("	--- Sum of Numbers --- ");
		System.out.print("How many numbers you want to enter? ");
		byte range = inp.nextByte();
		
		byte count = 1;
		while (count <= range) {
			System.out.printf("Enter Number %d: ", count);
			num = inp.nextShort();
			
			sum += num;
			count++;
		}
		
		float avg = (float) sum / range;

		if (count != 1) {
			System.out.printf("Sum of %d digits is: %d\nAverage of %d digits is: %.2f",
					 range, sum, range, avg);
		}
		else {
			System.out.print("No Input");

		}
	}
}
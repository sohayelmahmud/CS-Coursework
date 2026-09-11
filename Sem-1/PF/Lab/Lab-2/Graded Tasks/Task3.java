import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		short num;
		
		System.out.println("	--- No. of Zero Numbers --- ");
		System.out.print("How many numbers you want to enter? ");
		byte range = inp.nextByte();
		
		byte count = 1, zero = 0;
		while (count <= range) {
			System.out.printf("Enter Number %d: ", count);
			num = inp.nextShort();
			if (num == 0) {
				zero++;
			}
			count++;
		}
		System.out.printf("No. of 0 numbers are: %d", zero);
	}
}
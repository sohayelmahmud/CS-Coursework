import java.util.Scanner;
public class Task6 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("	--- Largest Number Index --- ");
		System.out.println("Note: Enter '0' to Stop Entering.");
		
		System.out.print("Enter any Number: ");
		int num = inp.nextInt();

		short count = 1;
		short indexOfMax = count, max = num;
		
		while (true) {
			count++;
			System.out.print("Enter another Number: ");
			num = inp.nextInt();

			if (num == 0){
				break;
			}

			if (num > max) {
				max = num;
				indexOfMax = count;
			}
		}
		System.out.printf("Index of Largest Number is: %d", max);
	}
}
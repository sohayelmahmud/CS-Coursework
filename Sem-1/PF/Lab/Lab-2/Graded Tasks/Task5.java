import java.util.Scanner;
public class Task5 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("	--- Largest and Smallest Number  --- ");
		System.out.println("Note: Enter '0' to Stop Entering.");
		
		System.out.print("Enter number: ");
		int num = inp.nextInt(); 
		
		int max = num;
		int min = num;
		
		while (true) {
			System.out.print("Enter another Number: ");
			num = inp.nextInt();
			
			if (num == 0){
				break;
			}

			else if (num < min) {
				min = num;
			}

			else if (num > max) {
				max = num;
			}
		}
		System.out.printf("Largest Number is: %d%nSmallest Number is: %d", max, min);
	}
}
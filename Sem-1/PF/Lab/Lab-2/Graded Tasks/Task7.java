import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("	--- No. of Even Numbers --- ");
		System.out.println("Note: Enter '0' to Stop Entering.");
		
		
		short even = 0, num;

		while (true) {
			System.out.print("Enter any Number: ");
			num = inp.nextShort();
			
			if (num == 0){
				break;
			}

			else if (num > 0 && (num % 2 == 0)) {
				even++;
			}

		}
		System.out.printf("No. of even numbers are: %d", even);
	}
}
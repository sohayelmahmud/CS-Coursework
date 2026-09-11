import java.util.Scanner;
public class Task2PartA {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("	--- ASCII Character --- ");
		
		while (true) {
			System.out.print("Enter an ASCII Code (0 - 127, inclusive): ");
			short code = inp.nextShort();
	
			if (code < 0 || code > 127) {
				System.out.println("Wrong ASCII Code!");
				continue;
			}	
			else {
				System.out.printf("Character for %d is: %c", code, (char)code);
				break;
			}
		}
	}
}
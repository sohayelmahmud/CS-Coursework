import java.util.Scanner;
public class Task3PartA {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("	--- Hex Number --- ");

		while (true) {
		System.out.print("Enter any decimal value (0 - 15, inclusive): ");
		byte num = inp.nextByte();
	
		if (num < 0 || num > 15) {
			System.out.println("Wrong Input!");
			continue;	
		}
		if (num >= 0 && num <= 9) {
			System.out.printf("Hex value for %d is: %d", num, num);	
			break;
		}
		else {
			byte mod10 = (byte) (num % 10);
			char hexChar = (char)('A' + mod10);
			System.out.printf("Hex Character for %d is: %c", num, hexChar);
			break;
		}
		}
	}
}
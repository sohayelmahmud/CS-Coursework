import java.util.Scanner;
public class Task3PartB {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("	--- Hex to Binary --- ");

		while (true) {
		System.out.print("Enter a Hex Digit: ");
		int decimalValue = Integer.parseInt(inp.next(), 16);
		
	
		if (decimalValue < 0 || decimalValue > 15) {
			System.out.println("Wrong Input!");
			continue;	
		}
		else {
			String binaryValue = Integer.toBinaryString(decimalValue);
			System.out.printf("Binary Value is: %s", binaryValue);
			break;
		}
		}
	}
}
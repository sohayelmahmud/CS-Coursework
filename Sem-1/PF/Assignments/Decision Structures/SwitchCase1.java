import java.util.Scanner;

public class SwitchCase1 {
	public static void main(String[] args) {
		Scanner amount = new Scanner(System.in);
		System.out.println("		--- Smaller Monetary Units Converter ---");
		System.out.print("Enter the Amount ($): ");
		double inputAmt = amount.nextDouble();
		amount.close();
		
		// into cents
		int remainingAmount = (int) (inputAmt * 100);
		
		// for dollars
		int dollars = remainingAmount / 100;
		remainingAmount %= 100;
		
		// for quarters
		int quarters = remainingAmount / 25;
		remainingAmount %= 25;	

		// for dimes
		int dimes = remainingAmount / 10;
		remainingAmount %= 10;	

		// for nickels
		int nickels = remainingAmount / 5;
		remainingAmount %= 5;

		int pennies = remainingAmount;

		System.out.println("Montary Units are: ");

		switch (dollars) {
			case 1 -> System.out.println("Dollar: " + dollars);
			default -> System.out.println("Dollars: " + dollars);
		}

		switch (quarters) {
			case 1 -> System.out.println("Quarter: " + quarters);
			default -> System.out.println("Quarters: " + quarters);
		}

		switch (dimes) {
			case 1 -> System.out.println("Dime: " + dimes);
			default -> System.out.println("Dimes: " + dimes);
		}

		switch (nickels) {
			case 1 -> System.out.println("Nickel: " + nickels);
			default -> System.out.println("Nickels: " + nickels);
		}

		switch (pennies) {
			case 1 -> System.out.print("Penny: " + pennies);
			default -> System.out.print("Pennies: " + pennies);
		}

	}
}
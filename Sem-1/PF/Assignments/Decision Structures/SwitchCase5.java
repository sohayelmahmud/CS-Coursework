import java.util.Scanner;

public class SwitchCase5 {
	public static void main(String[] args) {
		int cartons = 0;
		Scanner dairy = new Scanner(System.in);

		System.out.println("		--- Milk Cartons, Cost and Profit ---");
		System.out.print("Enter the Amount of Milk : ");
		int litres = dairy.nextInt();
		dairy.close();

		// each carton holds 3.78 litres of milk
		cartons = (int) (litres / 3.78);

		// each litre of milk production requires 0.38$
		float cost = litres * 0.38f;
		
		// each carton of milk gives 0.27$ profit
		float profit = litres * 0.27f;

		

		System.out.printf("Total Cartons: %d\nCost for Production of %d Litres Milk: %.2f$\nProfit for %d Cartons of Milk: %.2f$",
				   cartons, litres, cost, litres, profit);

	}
}
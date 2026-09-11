import java.util.Scanner;

public class SwitchCase6 {
	public static void main(String[] args) {
		Scanner values = new Scanner(System.in);
		System.out.println("		--- Salary and Expenditure ---");
		System.out.print("Enter your pay rate per hour: ");
		double payRate = values.nextDouble();
		
		System.out.print("Enter no. of hours you worked in a week: ");
		double hours = values.nextDouble();

		System.out.print("Enter no. of Weeks you worked: ");
		double weeks = values.nextDouble();

		System.out.print("Enter Tax Percentage(%): ");
		double taxPercent = values.nextDouble();
		values.close();
		
		// income before tax
		double originalSalary = payRate * hours * weeks;

		// tax calculate
		double tax = originalSalary * (taxPercent * 0.01);
		
		// salary after tax
		double afterTaxSalary = originalSalary - tax;
		double actualSalary = afterTaxSalary;

		// 10% on clothes and accessories of school
		double schoolAccessories = actualSalary *  0.1;
		actualSalary -= schoolAccessories;

		// 1% on school supplies
		double schoolSupplies = actualSalary *  0.01;
		actualSalary -= schoolSupplies;

		// you spent 25% on saving bonds
		double savingBonds = actualSalary *  0.25;
		actualSalary -= savingBonds;

		// for each dollar you spent on bonds, your parents spend $0.50 dollars for addtional bonds
		double additionalBonds = savingBonds * 0.50;
		actualSalary -= additionalBonds;
		
		
		System.out.printf("%nSalary Before Tax: %.2f$%nTax Amount: %.2f$%nSalary After Tax: %.2f$%n", originalSalary, tax, afterTaxSalary);
		System.out.printf("Money spent on clothes and other accessories: %.2f$%nMoney spent on school supplies: %.2f$%n", schoolAccessories, schoolSupplies);
		System.out.printf("Money spent on Saving Bonds: %.2f$%nMoney your Parents spent on Additional Saving Bonds: %.2f$%n", savingBonds, additionalBonds);
		System.out.printf("Remaining Salary: %.2f$", actualSalary);

	}
}
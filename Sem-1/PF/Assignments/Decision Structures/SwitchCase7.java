import java.util.Scanner;

public class SwitchCase7 {
	public static void main(String[] args) {
		Scanner students = new Scanner(System.in);

		System.out.println("		--- Ticket Sales ---");
		System.out.print("No. of tickets sold for Class A Seats: ");
		int first = students.nextInt();

		System.out.print("No. of tickets sold for Class B Seats: ");
		int second = students.nextInt();

		System.out.print("No. of tickets sold for Class C Seats: ");
		int third = students.nextInt();

		System.out.print("No. of tickets sold for Class D Seats: ");
		int fourth = students.nextInt();
		students.close();

		double salesA = first * 20;
		double salesB = second * 15;
		double salesC = third * 10;
		double salesD = fourth * 5;
		double totalSales = salesA + salesB + salesC + salesD;

		System.out.printf("%nSales for %d Tickets of Class A: %.2f$", first, salesA);
		System.out.printf("%nSales for %d Tickets of Class B: %.2f$", second, salesB);
		System.out.printf("%nSales for %d Tickets of Class C: %.2f$", third, salesC);
		System.out.printf("%nSales for %d Tickets of Class D: %.2f$", fourth, salesD);
		System.out.printf("%nTotal Sales: %.2f$", totalSales);

	}
}
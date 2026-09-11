import java.util.Scanner;

public class SwitchCase3 {
	public static void main(String[] args) {
		int totBenches = 0, firstBenches = 0, secondBenches = 0, thirdBenches = 0;
		Scanner students = new Scanner(System.in);

		System.out.println("		--- Desks for Purchasing ---");
		System.out.print("No. of Students in First Class: ");
		int first = students.nextInt();

		System.out.print("No. of Students in Second Class: ");
		int second = students.nextInt();

		System.out.print("No. of Students in Third Class: ");
		int third = students.nextInt();
		students.close();

		switch (first % 2) {
			case 0 -> firstBenches += first / 2;
			default -> firstBenches += (int) (first / 2) + 1;
		}

		switch (second % 2) {
			case 0 -> secondBenches += second / 2;
			default -> secondBenches += (int) (second / 2) + 1;
		}

		switch (third % 2) {
			case 0 -> thirdBenches += first / 2;
			default -> thirdBenches += (int) (third / 2) + 1;
		}
	
		totBenches = firstBenches + secondBenches + thirdBenches;

		System.out.printf("\nMinimun no. of Benches required:\nFor First Class: %d\nFor Second Class: %d\nFor Third Class: %d\nTotal Benches: %d"
					 , firstBenches, secondBenches, thirdBenches, totBenches);

	}
}
import java.util.Scanner;

public class SwitchCase4 {
	public static void main(String[] args) {
		Scanner mins = new Scanner(System.in);

		System.out.println("		--- Minutes to 24H Format ---");
		System.out.print("Enter the minutes passed since Midnight (00:00): ");
		int minutes = mins.nextInt();
		mins.close();

		int hours = (int) (minutes / 60);
		int remainingMins = minutes % 60;


		System.out.printf("Time in 24H Format: %02d:%02d" , hours, remainingMins);

	}
}
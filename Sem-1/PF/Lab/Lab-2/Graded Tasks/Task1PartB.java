import java.util.Scanner;
public class Task1PartB {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("	--- Numbers Printing --- ");
		System.out.print("Enter Initial Point: ");
		int num1 = inp.nextInt();

		System.out.print("Enter Final Point: ");
		int num2 = inp.nextInt();
		
		System.out.printf("%nNumbers from %d to %d are:%n", num1, num2);
		
		if (num1 < num2) {
			for (int num = num1; num <= num2; num++) {
				System.out.printf(" %d\t", num);
			}
		}
		else {
			for (int num = num1; num >= num2; num--) {
				System.out.printf(" %d\t", num);
			}
		} 
	}
}
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		long factorial = 1L;
		
		System.out.println("	--- Factorial --- ");
		System.out.print("Enter Number: ");
		short num = inp.nextShort();
		
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
			
			System.out.printf("Factorial of %d is: %d", num, factorial);
	}
}
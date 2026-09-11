import java.util.Scanner;
public class Task2PartB {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("	--- Unicode Value --- ");
		
		System.out.print("Enter a Character: ");
		char ch = inp.next().charAt(0);
		System.out.printf("Unicode value for %c is: %d", ch, (int)ch);
		
	}
}
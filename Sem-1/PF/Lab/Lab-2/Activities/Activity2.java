import java.util.Scanner;
public class Activity2 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("	--- Sum Guess --- ");
		byte num1 = (byte) (Math.random() * 10);
		byte num2 = (byte) (Math.random() * 10);
		byte ans = (byte) (num1 + num2);
		
		while (true) {
			System.out.printf("What is %d + %d? ", num1, num2);
			byte sum = inp.nextByte();

			if (ans != sum){
				System.out.println("Wrong answer! Try Again.  ");
			}
			else {
				System.out.println("Congratulations! You got it.");
				break;
			}
			
		}
		
	}
}
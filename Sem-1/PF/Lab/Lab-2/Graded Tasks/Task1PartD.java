import java.util.Scanner;
public class Task1PartB {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("	--- Sum of Cubes --- ");
		System.out.print("Enter an Integer: ");
		short num = inp.nextShort();

		long cubeSum = 0L;
		for (int i = 1; i <= num; i++) {
			cubeSum += Math.pow(i, 3);
		}
		System.out.printf("Sum of cubes from 1 to %d is: %d",num, cubeSum);
	}
}
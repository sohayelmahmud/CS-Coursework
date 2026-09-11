import java.util.Scanner;
public class Task4 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		short num;
		boolean zeroReached = true;
		
		System.out.println("	--- Length of Sequence Before 0  --- ");
		System.out.print("How many numbers you want to enter? ");
		byte range = inp.nextByte();
		
		
		short count = 1, nonZero = 0;
		while (count <= range) {
			System.out.printf("Enter Number %d: ", count);
			num = inp.nextShort();
			if (num == 0){
				zeroReached = false;
			}
			if (zeroReached) {
				nonZero++;
			}
			count++;
		}
		System.out.printf("Length of Sequence before 0 is: %d", nonZero);
	}
}
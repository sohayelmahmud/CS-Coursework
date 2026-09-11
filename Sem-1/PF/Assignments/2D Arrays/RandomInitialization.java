import java.util.Scanner;
public class RandomInitialization {
	public static void main(String[] args) {
	
	Scanner inp = new Scanner(System.in);
System.out.print("Enter no. of rows: ");
short rows = inp.nextShort();
System.out.print("Enter no. of columns: ");
short cols = inp.nextShort();
System.out.print("Enter max limit of numbers' magnitude: ");
int maxRange = inp.nextInt();

int[][] arr = new int[rows][cols];
	for (int[] row : arr) {
		for (int i = 0; i < row.length; i++) {
			row[i] = (int) (Math.random() * maxRange + 1);
}
}
}
}
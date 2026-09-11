import java.util.Scanner;
public class InitializingArray {
	public static void main(String[] args) {
	
	Scanner inp = new Scanner(System.in);
System.out.print("Enter no. of rows: ");
short rows = inp.nextShort();
System.out.print("Enter no. of columns: ");
short cols = inp.nextShort();

int[][] arr = new int[rows][cols];
	for (int row = 0; row < arr.length; row++) {
		for (int i = 0; i < arr[row].length; i++) {
			System.out.printf("Enter element for row %d: ", row + 1);
			arr[row][i] = inp.nextInt();
}
}
}
}
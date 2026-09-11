import java.util.Scanner;
import java.util.Arrays;
public class SummingArray {
	public static void main(String[] args) {
	
	Scanner inp = new Scanner(System.in);
System.out.print("Enter no. of rows: ");
short rows = inp.nextShort();
System.out.print("Enter no. of columns: ");
short cols = inp.nextShort();
System.out.print("Enter max limit of numbers' magnitude: ");
int maxRange = inp.nextInt();

// random initialization
int[][] arr = new int[rows][cols];
	for (int[] row : arr) {
		for (int i = 0; i < row.length; i++) {
			row[i] = (int) (Math.random() * maxRange + 1);
}
}

// printing elements
System.out.println("\n2D Array is: ");
for (int[] array : arr) {
System.out.println(Arrays.toString(array));
}

// summing all elements
long sum = 0;
for (int[] row : arr) {
	for (int element : row) {
		sum += element;
}
}
System.out.printf("\nSum of all elements of array is: %d", sum);
}


}
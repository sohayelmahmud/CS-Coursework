import java.util.Scanner;
import java.util.Arrays;
public class LargestSumRow {
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
long highestSum = Long.MIN_VALUE, sum;
int highIndex = 0;
for (int i = 0; i < arr.length; i++) {
	sum = 0;
	for (int element : arr[i]) {
		sum += element;
}
if (sum > highestSum) {
	highestSum = sum;
	highIndex = i;
}
}
System.out.printf("\nRow# %d has the highest sum of %d", highIndex + 1, highestSum);
}
}
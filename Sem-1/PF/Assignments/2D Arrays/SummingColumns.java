import java.util.Scanner;
import java.util.Arrays;
public class SummingColumns {
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
System.out.println("\nOriginal 2D Array is: ");
for (int[] array : arr) {
System.out.println(Arrays.toString(array));
}

// summing columns
long sum = 0;
for (int i = 0; i < cols; i++) {
	for (int[] row : arr) {
		sum += row[i];
}
System.out.printf("\nSum of all elements of column %d is: %d", i + 1, sum);
sum = 0;
}

}


}
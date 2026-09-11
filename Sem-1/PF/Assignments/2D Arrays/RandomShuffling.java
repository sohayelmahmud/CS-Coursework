import java.util.Scanner;
import java.util.Arrays;
public class RandomShuffling {
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

// shuffling
int[] arrayTemp = new int[cols];
int tempElement = 0, randIndex = 0;
for (int i = 0; i < arr.length; i++) {
	arrayTemp = arr[i];
	randIndex = (int) (Math.random() * arr.length);
	arr[i] = arr[randIndex];
	arr[randIndex] = arrayTemp;

	for (int j = 0; j < arr[i].length; j++) {
	tempElement = arr[i][j];
	randIndex = (int) (Math.random() * arr[i].length);
	arr[i][j] = arr[i][randIndex];
	arr[i][randIndex] = tempElement;
}
}
// printing elements
System.out.println("\n2D Array after shuffling is: ");
for (int[] array : arr) {
System.out.println(Arrays.toString(array));
}
}
}
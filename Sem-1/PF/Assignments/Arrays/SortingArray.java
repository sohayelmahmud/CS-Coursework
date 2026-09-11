import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("\t--- Bubble Sort Algorithm ---");
        int[] numsArray = {6, 8, 10, 4, 2, 3, 12, 18, 16, 20, 14, 1, 7, 5, 9, 15, 13, 17, 11, 19};
        System.out.println("Array before Sorting: " + Arrays.toString(numsArray));

        bubbleSort(numsArray);
        System.out.println("Sorted Array: " + Arrays.toString(numsArray));
    }

    // using bubble sort (the best; less time complexity)
    private static void bubbleSort(int[] numsArray) {
        int temp = 0;
        for (int run = numsArray.length - 1; run >= 1; run--) {
            for (int i = 0; i < run; i++){
                if (numsArray[i] > numsArray[i + 1]){
                    temp = numsArray[i + 1];
                    numsArray[i + 1] = numsArray[i];
                    numsArray[i] = temp;
                }
            }
        }
    }
}
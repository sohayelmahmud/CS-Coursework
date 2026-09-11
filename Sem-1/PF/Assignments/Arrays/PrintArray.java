import java.util.Arrays;

public class PrintArray {

    public static void main(String[] args) {
        int[] nums = { 6, 8, 10, 4, 2, 3, 12, 18, 16, 20, 14, 1, 7, 5, 9, 15, 13, 17, 11, 19 };
        System.out.println("Array is: " + Arrays.toString(nums));
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
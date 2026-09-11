import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        int[] nums = {6, 8, 10, 4, 2, 3, 12, 18, 16, 20, 14, 1, 7, 5, 9, 15, 13, 17, 11, 19};
        System.out.println("Array is: " + Arrays.toString(nums));
        int sum = 0;
        for (int num: nums) {
            sum += num;
        }
        System.out.printf("Sum of array elements: %d", sum);
    }
}

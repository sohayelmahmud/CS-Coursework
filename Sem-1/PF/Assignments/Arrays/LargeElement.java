import java.util.Arrays;

public class LargeElement {
    public static void main(String[] args) {
        int[] nums = { 87, 18, 10, 4, 2, 67, 12, 18, 16, 20, 14, 1, 7, 5, 70, 15, 13, 17, 11, 19 };
        System.out.println("Array is: " + Arrays.toString(nums));
        int largest = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > largest)
                largest = num;
        }
        System.out.printf("Largest Element is: %d", largest);
    }
}

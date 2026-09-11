import java.util.Arrays;

public class CopyingReverseElements {
    public static void main(String[] args) {
        int[] nums = {87, 18, 10, 4, 2, 67, 12, 18, 16, 20, 14, 1, 7, 5, 70, 15, 13, 17, 11, 19 };
        System.out.println("Original Array is: " + Arrays.toString(nums));
        
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[nums.length - 1 - i];
        }
        System.out.println("Reversed Copied Array is: " + Arrays.toString(nums2));

    }
}

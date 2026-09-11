import java.util.Arrays;

public class ShufflingElements {
    public static void main(String[] args) {
        int[] nums = { 87, 18, 10, 4, 2, 67, 12, 18, 16, 20, 14, 1, 7, 5, 70, 15, 13, 17, 11, 19 };
        System.out.println("Array is: " + Arrays.toString(nums));
        int randomIndex = 0, tempStore = 0;
        for (int i = 0; i < nums.length; i++) {
            randomIndex = (int) (Math.random() * nums.length);
            tempStore = nums[i];
            nums[i] = nums[randomIndex];
            nums[randomIndex] = tempStore;
        }
        System.out.println("After Elements Shuffled: " + Arrays.toString(nums));
    }
}

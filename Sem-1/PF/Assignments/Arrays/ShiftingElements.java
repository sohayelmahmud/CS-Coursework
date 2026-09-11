import java.util.Arrays;
import java.util.Scanner;

public class ShiftingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = { 87, 18, 10, 4, 2, 67, 12, 18, 16, 20, 14, 1, 7, 5, 70, 15, 13, 17, 11, 19 };
        System.out.println("Array is: " + Arrays.toString(nums));

        System.out.println("Do you want to:\nLeft Shift (Enter \'L\'\nRight Shift (Enter \'R\'')");
        while (true) {
            System.out.print("Enter your choice: ");
            char choice = Character.toLowerCase(sc.next().charAt(0));

            switch (choice) {
                case 'l':
                    leftShift(nums);
                    System.out.println("After Left Shifting: " + Arrays.toString(nums));
                    break;

                case 'r':
                    rightShift(nums);
                    System.out.println("After Right Shifting: " + Arrays.toString(nums));
                    break;

                default:
                    System.out.println("Wrong choice!)");
                    continue;
            }
            break;
        }
    }

    private static void rightShift(int[] nums) {
        int last = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 1; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = last;
    }

    private static void leftShift(int[] nums) {
        int first = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = first;
    }
}
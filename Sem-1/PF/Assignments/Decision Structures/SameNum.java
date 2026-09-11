import java.util.Scanner;

public class SameNum {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num1, num2, num3, equal = 0;

        System.out.print("Enter 3 numbers separated by space: ");
        num1 = number.nextInt();
        num2 = number.nextInt();
        num3 = number.nextInt();

        if (num1 == num2 && num1 == num3) {
            equal = 3;
        }
        else if (num1 == num2 || num1 == num3 || num2 == num3) {
            equal = 2;
        }
        System.out.println("Total Equal numbers: " + equal);
    }
}

import java.util.Scanner;

public class Task1PartB {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("\t --- Reversed Number ---");
        System.out.print("Enter any number: ");
        int number = inp.nextInt();

        reverse(number);
    }

    public static void reverse(int number) {
        int remain, reverse = 0, origNum = number;

        while (number > 0) {
            remain = number % 10;
            reverse = reverse * 10 + remain;
            number /= 10;
        }
        String numStr = Integer.toString(origNum);
        char checkZero = numStr.charAt(numStr.length() - 1);
        if (checkZero == '0') {
            System.out.printf("%d, reversed is: 0%d", origNum, reverse);
        }
        else {
            System.out.printf("%d, reversed is: %d", origNum, reverse);
        }
    }
}
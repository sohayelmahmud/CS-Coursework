import java.util.Scanner;

public class Task1PartA {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("\t --- Self-Digits Sum ---");
        System.out.print("Enter any number: ");
        int number = inp.nextInt();

        System.out.printf("Sum of digits in %d is: %d", number, selfDigitSum(number));
    }

    public static int selfDigitSum(int number) {
        int sum = 0, remain;
        while (number > 0) {
            remain = number % 10;
            sum += remain;
            number /= 10;
        }
        return sum;
    }
}
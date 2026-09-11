import java.util.Scanner;

public class ReversedNum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = inp.nextInt();

        int revNum = 0;
        byte digit = 0;
        do {
            digit = (byte) (num % 10);
            revNum = revNum * 10 + digit;
            num /= 10;
        } while (num != 0);

        System.out.println("Reversed integer is: " + revNum);
    }
}
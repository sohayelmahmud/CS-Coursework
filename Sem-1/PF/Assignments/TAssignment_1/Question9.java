import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("\t --- ISBN-10 Number ---");
        System.out.print("Enter first nine digits of an ISBN as integer: ");
        String origNum = inp.nextLine();

        byte tenthDigit = tenthDigit(origNum);
        if (tenthDigit == 10) {
            System.out.println("The ISBN-10 number is: " + origNum + "X");
        } else {
            System.out.println("The ISBN-10 number is: " + origNum + tenthDigit);
        }
    }
    public static byte tenthDigit(String origNum) {
        byte remain;
        int sum = 0, digits = Integer.parseInt(origNum);
        for (byte mul = 9; mul >= 1; mul--) {
            remain = (byte) (digits % 10);
            sum += remain * mul;
            digits /= 10; // digits = digits / 10
        }
        return (byte) (sum % 11);
    }
}

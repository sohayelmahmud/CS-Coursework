import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int reverseNum = 0, num;
        boolean reversed = false, isPalindrome = false;

        System.out.println("\t --- Reversed/Palindrome Number ---");

        System.out.println("Do you want to:\n Print Reversed Number (press 'R')" +
                "\n Check Palindrome Number (press 'P')");

        while (true) {
            System.out.print("Enter your choice: ");
            char choice = inp.next().charAt(0);

            System.out.print("Enter Number: ");
            num = inp.nextInt();

            switch (Character.toUpperCase(choice)) {
                case 'R':
                    reverseNum = reverse(num);
                    reversed = true;
                    break;

                case 'P':
                    isPalindrome = isPalindrome(num);
                    if (isPalindrome) {
                        System.out.printf("%d is Palindrome", num);
                    } else {
                        System.out.printf("%d is not Palindrome", num);
                    }
                    break;

                default:
                    System.out.println("Wrong Choice");
                    continue;
            }
            break;
        }
        if (reversed) {
            String numStr = Integer.toString(reverseNum);
            char checkZero = numStr.charAt(numStr.length() - 1);
            if (checkZero == '0') {
                System.out.printf("%d, reversed is: 0%d", num, reverseNum);
            } else {
                System.out.printf("%d, reversed is: %d", num, reverseNum);
            }
        }

    }

    public static int reverse(int number) {
        int remain, reverse = 0;

        while (number > 0) {
            remain = number % 10;
            reverse = reverse * 10 + remain;
            number /= 10;
        }
        return reverse;

    }

    public static boolean isPalindrome(int num) {
        int reversed = reverse(num);
        if (num == reversed) {
            return true;
        }
        return false;
    }

}
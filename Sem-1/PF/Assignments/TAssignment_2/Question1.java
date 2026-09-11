import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("\t --- SSN Validator ---");
        System.out.print("Enter a SSN: ");
        String securityNum = inp.nextLine();

        if (isValidSSN(securityNum)) {
            System.out.printf("%s is a is a valid social security number", securityNum);
        } else {
            System.out.printf("%s is not a valid social security number", securityNum);
        }
    }

    public static boolean isValidSSN(String securityNum) {
        int digitCount = 0, hyphenCount = 0;
        if (securityNum.length() == 11) {
            for (byte i = 0; i <= 10; i++) {
                if (Character.isDigit(securityNum.charAt(i))) {
                    digitCount++;
                }
                if (securityNum.charAt(i) == '-') {
                    hyphenCount++;
                    if (hyphenCount == 1) {
                        if (digitCount != 3) {
                            return false;
                        }
                    } else if (hyphenCount == 2) {
                        if (digitCount != 5) {
                            return false;
                        }
                    } else if (hyphenCount > 2) {
                        return false;
                    }
                }
            }
        }
        if ((digitCount == 9) && (hyphenCount == 2)) {
            return true;
        } else {
            return false;
        }
    }
}